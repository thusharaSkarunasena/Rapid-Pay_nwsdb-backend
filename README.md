# Rapid Pay - NWSDB Backend API

## Description
This demo API is a part of the 'Rapid Pay' project which is developed as a utility bill payment platform.
NWSDB backend API is used to check if the given account number for the 'NWSDB' bill payment is a valid account number.
API is hosted to 'Heroku' & API endpoints are not secured.

## Technologies Used
* Spring Boot
* PostgreSQL

## API Demo Url
[https://rapidpay-nwsdb.herokuapp.com](https://rapidpay-nwsdb.herokuapp.com/)
	
## API Endpoints
	/nwsdb_user/getAllNwsdbUsers
	/nwsdb_user/getNwsdbUser/{id}
	/nwsdb_user/checkNwsdbUser/{account_number}
	/nwsdb_user/saveNwsdbUser
	/nwsdb_user/updateNwsdbUser
	/nwsdb_user/deleteNwsdbUser/{id}
