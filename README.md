# thrift-service
thrift service
Created maven project from maven -> thrift-archetype
Followed this link to create a sample thrift server and client https://www.baeldung.com/apache-thrift
after creating thrift file in Thrift directory, ran maven clean -X install to generate the Source code from IDL. This generates java source files in target directory.
The other way to generate the source files is thrift -r -out src/main/java/ThriftService --gen java src/main/thrift/service.thrift 
