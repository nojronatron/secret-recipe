# Lab14 Secret Recipe

Lab project that reinforces Spring Framework MVC web design and introduces password hashing.

## Feature Tasks

- [X] Create database
- [X] Create table that models users with username, id, and hashed password
- [ ] Create a table that models posts with a postId, userId, and text content
- [ ] Create a table with a 1-to-many releationship between users and posts
- [!] Authenticate the site so only logged-in users can see posts
- [X] Use Bcrypt to hash all passwords stored on the site

*Note*: Authenticating the site is only partially effective. A user that knows the GetMapping can simply type it into the url bar and get to the site without authentication.

## How To Use This Project

1. Clone this repo
2. CD to the root project directory
3. Execute `gradlew bootRun` or open the project in IntelliJ IDEA (or your favorite IDE with Java support) and click the Run button.

The project includes Spring frameworks that includes a running Apache web server, default port: 8080.

## Project Effort

Start Date and Time: 6-Jun-22 1500hrs
End Date and Time: 6-Jun-22 1700hrs => Break for midterm project prep, Dinner, Helping Chuck with this project
Restart Time: 6-Jun-22 1945hrs
Completion Time: 6-Jun-22 2050 hrs
