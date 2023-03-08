full stack app running with JWT based authorization

(user name  : Riya
pwd  : 2233 )
Look at : filter, JWT Utils , Webconfig ,DaoBasedUserDetailsService,UserDetailsImpl , User Entity, Role POJOs


Quick steps to add JWT support in existing 

From React : in login(signin) --sending JS object containing username n pwd in POST request In case of success --
1. set up request interceptor to add JWT token (with Bearer ) in all further requests
2. store JWT under session storage (change it to localstorage)
3. redirect to Welcome component

