"# gradle-web-resin" 

## server

Resin at localhost:8080
Program arg
--root-directory "C:/Users/brennam/resin-4.0.66"
      -conf "C:/Users/brennam/eclipse-workspace/Servers/Resin 4.0 at localhost-config/resin.xml"
      -verbose
       -server app-0 console
	   
VM arg	   
	       -Dresin.home="C:/Users/brennam/resin-4.0.66"
      -Djava.util.logging.manager=com.caucho.log.LogManagerImpl 
      -Djava.system.class.loader=com.caucho.loader.SystemClassLoader
      -Djavax.management.builder.initial=com.caucho.jmx.MBeanServerBuilderImpl 
      -Djava.awt.headless=true 
      -Dresin.home="C:/Users/brennam/resin-4.0.66"
      -Dserver.address="localhost" 
      -Dserver.port="8080"
      -Xss1m -Xmx512m -server
      -Djava.library.path="C:/Users/brennam/resin-4.0.66/win64;C:\Users\brennam\eclipse\jee-2022-03\eclipse;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/Users/brennam/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.2.v20220201-1208/jre/bin/server;C:/Users/brennam/.p2/pool/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.2.v20220201-1208/jre/bin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\Docker\Docker\resources\bin;C:\ProgramData\DockerDesktop\version-bin;C:\Program Files\Git\cmd;C:\Users\brennam\AppData\Local\Microsoft\WindowsApps;C:\Users\brennam\openjdk-18_windows-x64_bin\jdk-18\bin;C:\Users\brennam\apache-maven-3.8.5-bin\apache-maven-3.8.5\bin;C:\Users\brennam\gradle-7.4.2-bin\gradle-7.4.2\bin;;C:\Users\brennam\Desktop;;."
	  