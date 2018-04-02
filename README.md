# GeopagosPdfTest

*************** PDF Test.****************

Libraries used on the proyect:

• Jersey bundle 1.19 core.
• Jersey rss-311 1.1.1
• JDBC-Mysql-connector-5.1.6
• Gson 2.8.2

Build on STS tool 3.9.0, run with Tomcat 7, maven proyect.
Connection to DB is requiered, you should change this data to stablish connection (DB data, user: "root", pass: "")

Important ==> For simplify steps a DB file is on WEB-INF/DB/geopagos.sql just import the file on your DB manager, is loaded with some mock data.

If the import does'nt work just:

• Create Mysql DB= "geopagos"
• Create Mysql table on geopagos DB= "geometric_figure"
  - Colum "id": int AI;
  - Colum "height": double;
  - Column "width": double;
  - Column "surface": double;
  - Column "diameter": double;
  - Column "type": varchar 50;

This could be implemented with Hibernate libraries.

************* Two services **************
1- Register Geometric Figure on a DB.
2- Get all Geometric Figures from DB.

A. A. Berlot

