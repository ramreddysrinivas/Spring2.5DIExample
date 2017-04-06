this application is an Example for  Spring 2.5 dependency injection.
I used maven for building the project(it also loads dependencies).
I used ApplicationContext,ClassPathXmlApplicationContext,FileSystemXmlApplicationContext for loading the dependencies.
Also used BeanFactory,XmlBeanFactory,Resource,ClassPathResource,FileSystemResource  

maven commands 
navigate to application directory on command promt 
mvn clean  it will remove the content in target folder in side the application(it contains jar  or war file)
mvn install it will download the dependencies in m2 repository(C:\Users\Srinivas\.m2\repository). it will create a new war  or  jar in target folder. if war or jar is already present,it will be repalaced.
mvn clean install it will download the dependencies in m2 repository(C:\Users\Srinivas\.m2\repository). it will remove the content in target folder in side the application(it contains jar  or war file) and creates war  or jar with latest code
mvn eclipse:eclipse it will load the dependencies to application class path(project build path) from m2 repository