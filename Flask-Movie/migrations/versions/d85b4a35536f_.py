"""empty message

Revision ID: d85b4a35536f
Revises: 66307bb0bc50
Create Date: 2021-04-27 17:03:37.584599

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = 'd85b4a35536f'
down_revision = '66307bb0bc50'
branch_labels = None
depends_on = None


def upgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.create_table('movie',
    sa.Column('id', sa.Integer(), autoincrement=True, nullable=False),
    sa.Column('username', sa.String(length=100), nullable=False),
    sa.Column('genre', sa.String(length=100), nullable=False),
    sa.Column('country', sa.String(length=100), nullable=False),
    sa.PrimaryKeyConstraint('id')
    )
    # ### end Alembic commands ###


def downgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.drop_table('movie')
    # ### end Alembic commands ###
