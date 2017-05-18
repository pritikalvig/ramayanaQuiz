# ramayanQuiz

A barebones Scala app (using the Play framework), deployed to Heroku.  

This application is running at https://ramayanaquiz.herokuapp.com

## Running Locally

Make sure you have Play and sbt installed.  Also, install the [Heroku Toolbelt](https://toolbelt.heroku.com/).

```sh
$ git clone https://github.com/pritikalvig/ramayanaQuiz.git
$ sbt compile stage
$ heroku local
```

Your app should now be running on [localhost:5000](http://localhost:5000/).

