module com.hamma.rest{
	requires static lombok;
	/*requires grizzly.http.server;
	requires jersey.container.grizzly2.http;
	requires jersey.server;*/
	requires jakarta.ws.rs;
	requires com.mongodb.client ;
	//requires org.junit.jupiter.api;
	exports com.hamma.jersey.rest;
}