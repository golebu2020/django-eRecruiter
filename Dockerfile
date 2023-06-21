FROM python:slim

LABEL maintainer="Chinedu Olebu"

ENV PYTHONUNBUFFERED=1

COPY . /App

WORKDIR /App

RUN pip install --upgrade pip && pip install -r requirements.txt

# RUN rm -rf requirements.txt

EXPOSE 8000

CMD [ "python", "manage.py", "runserver", "0.0.0.0:8000" ]
