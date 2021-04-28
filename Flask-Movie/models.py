# encoding: utf-8

from exts import db
from datetime import datetime
from werkzeug.security import generate_password_hash, check_password_hash


class User(db.Model):
    __tablename__ = 'user'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    username = db.Column(db.String(100), nullable=False)
    email = db.Column(db.String(100), nullable=False)
    password = db.Column(db.String(200), nullable=False)

    def __init__(self, *args, **kwargs):
        email = kwargs.get('email')
        username = kwargs.get('username')
        password = kwargs.get('password')

        self.email = email
        self.username = username
        self.password = generate_password_hash(password)

    def check_password(self, raw_password):
        result = check_password_hash(self.password, raw_password)
        return result


class Movie(db.Model):
    __tablename__ = 'movie'
    id = db.Column(db.Integer, primary_key=True, autoincrement=True)
    moviename = db.Column(db.String(100), nullable=False)
    genre = db.Column(db.String(100), nullable=False)
    country = db.Column(db.String(100), nullable=False)
    year = db.Column(db.Integer, nullable=False)