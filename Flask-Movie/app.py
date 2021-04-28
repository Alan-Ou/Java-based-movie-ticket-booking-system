# encoding: utf-8

from flask import Flask, render_template, request, redirect, url_for, session, g
from exts import db
from models import User,Movie
from functools import wraps
import config
from sqlalchemy import or_

app = Flask(__name__)
app.config['SECRET_KEY'] = 'malizhi123.'
app.config.from_object(config)
app.static_folder = 'static'
db.init_app(app)


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/sign_up', methods={'GET', 'POST'})
def sign_up():
    if request.method == 'GET':
        return render_template('index.html')
    else:
        username = request.form['username']
        email = request.form['email']
        password1 = request.form['password1']
        password2 = request.form['password2']

        # an email can only register an account
        user = User.query.filter(User.email == email).first()
        if user:
            return u'The email account has been registered'
        else:

            if password1 != password2:
                return u'The passwords entered are not the same, please fill in after checking'
            else:
                current_user = User(username=username, email=email, password=password1)
                db.session.add(current_user)
                db.session.commit()
                # current_user = User.query.filter_by(email=email).first()
                # login_user(current_user)
                return redirect(url_for('sign_in'))


@app.route('/sign_in', methods={'GET', 'POST'})
def sign_in():
    if request.method == 'GET':
        return render_template('index.html')
    else:
        email = request.form['email']
        password = request.form['password']
        # remember = request.form['remember']
        user = User.query.filter(User.email == email).first()
        if user and user.check_password(password):
            session['user_id'] = user.id
            # if re:
            #     session.permanent = True
            # else:

            session.permanent = False
            if email == "123456@qq.com":
                return render_template('administrator.html')
            else:
                return redirect(url_for('index'))
        else:
            return u'Email or password is wrong, please confirm and login again'

@app.route('/add_movie', methods={'GET', 'POST'})
def add_movie():
    if request.method == 'GET':
        return render_template('administrator.html')
    else:
        moviename = request.form['moviename']
        genre = request.form['genre']
        country = request.form['country']

        # an email can only register an account
        a = User.query.filter(Movie.moviename == moviename).first()
        if a:
            return u'The email account has been registered'
        else:


            b = Movie(moviename=moviename,genre=genre,country=country)
            db.session.add(b)
            db.session.commit()
            # current_user = User.query.filter_by(email=email).first()
            # login_user(current_user)
            return redirect(url_for('add_movie'))

@app.route('/logout')
def logout():
    session.clear()
    return redirect(url_for('sign_in'))


def login_required(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        if session.get('user_id'):  # 如果用户登录了
            return func(*args, **kwargs)  # 返回的是某个页面 记得func前面要加return 不然会产生return render_template('center.html')这样类似的功能
        else:
            return redirect(url_for('sign_in'))

    return wrapper


@app.before_request
def my_before_request():
    user_id = session.get('user_id')
    if user_id:
        user = User.query.filter(User.id == user_id).first()
        if user:
            g.user = user


@app.context_processor
def my_context_processor():
    if hasattr(g,'user'):
        return {'user': g.user}
    return {}


if __name__ == '__main__':
    app.run()
