set projectLocation=C:\Users\Shubham Pawar\eclipse-workspace\NareshIT
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLoctaion%\lib\*
java org.testng.TestNG %projectLocation%\testing.xml