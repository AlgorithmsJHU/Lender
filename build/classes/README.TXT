Files in project : GUI.java

Java Version is 1.8, as detailed below.

Eclipse Java EE IDE for Web Developers.
Version: Juno Service Release 2
Build id: 20130225-0426

To Compile and Run: 

I open the projecta and the GUI.java file. Right click in the GUI.java file and select "Run As" and then select "Java Application". You can then use the GUI to open a file for compression/encryption or for decompression/decryption. As of now, it does not compress/encrypt/decompress/decrypt the files. It only saves them as a different name. Where this will be done in GUI.java is noted by comments.

OR

Via command line, navigate to where the project is located. Run the scrip build by issuing the command "./build". This will build the code and run the application.  


NOTE, below is a dump of the Eclispe Installation Details Configuration page:




*** Date: Sunday, September 25, 2016 5:47:37 PM Eastern Daylight Time

*** Platform Details:

*** System properties:
__wbp.linux.disableScreenshotWorkarounds=false
applicationXMI=org.eclipse.ui.workbench/LegacyIDE.e4xmi
awt.toolkit=sun.awt.X11.XToolkit
eclipse.application=org.eclipse.ui.ide.workbench
eclipse.buildId=M20130204-1200
eclipse.commands=-os
linux
-ws
gtk
-arch
x86_64
-showsplash
/home/garrett/eclipse//plugins/org.eclipse.platform_4.2.2.v201302041200/splash.bmp
-launcher
/home/garrett/eclipse/eclipse
-name
Eclipse
--launcher.library
/home/garrett/eclipse//plugins/org.eclipse.equinox.launcher.gtk.linux.x86_64_1.1.200.v20120913-144807/eclipse_1502.so
-startup
/home/garrett/eclipse//plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar
--launcher.overrideVmargs
-exitdata
8f8003
-product
org.eclipse.epp.package.jee.product
-vm
/usr/bin/java
eclipse.home.location=file:/home/garrett/eclipse/
eclipse.launcher=/home/garrett/eclipse/eclipse
eclipse.launcher.name=Eclipse
eclipse.p2.data.area=@config.dir/../p2/
eclipse.p2.profile=epp.package.jee
eclipse.product=org.eclipse.epp.package.jee.product
eclipse.startTime=1474765509636
eclipse.vm=/usr/bin/java
eclipse.vmargs=-Dosgi.requiredJavaVersion=1.5
-Dhelp.lucene.tokenizer=standard
-XX:MaxPermSize=256m
-Xms40m
-Xmx512m
-jar
/home/garrett/eclipse//plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar
equinox.use.ds=true
file.encoding=UTF-8
file.encoding.pkg=sun.io
file.separator=/
gosh.args=--nointeractive
help.lucene.tokenizer=standard
java.awt.graphicsenv=sun.awt.X11GraphicsEnvironment
java.awt.printerjob=sun.print.PSPrinterJob
java.class.path=/home/garrett/eclipse//plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar
java.class.version=52.0
java.endorsed.dirs=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/endorsed
java.ext.dirs=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/ext:/usr/java/packages/lib/ext
java.home=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre
java.io.tmpdir=/tmp
java.library.path=/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
java.runtime.name=OpenJDK Runtime Environment
java.runtime.version=1.8.0_102-b14
java.specification.name=Java Platform API Specification
java.specification.vendor=Oracle Corporation
java.specification.version=1.8
java.vendor=Oracle Corporation
java.vendor.url=http://java.oracle.com/
java.vendor.url.bug=http://bugreport.sun.com/bugreport/
java.version=1.8.0_102
java.vm.info=mixed mode
java.vm.name=OpenJDK 64-Bit Server VM
java.vm.specification.name=Java Virtual Machine Specification
java.vm.specification.vendor=Oracle Corporation
java.vm.specification.version=1.8
java.vm.vendor=Oracle Corporation
java.vm.version=25.102-b14
javax.swing.adjustPopupLocationToFit=false
line.separator=

org.apache.commons.logging.Log=org.apache.commons.logging.impl.NoOpLog
org.eclipse.cdt.debug.ui.debuggerActive=false
org.eclipse.debug.ui.breakpoints.toggleFactoriesUsed=true
org.eclipse.debug.ui.debugViewToolbarVisible=false
org.eclipse.equinox.launcher.splash.location=/home/garrett/eclipse//plugins/org.eclipse.platform_4.2.2.v201302041200/splash.bmp
org.eclipse.equinox.simpleconfigurator.configUrl=file:org.eclipse.equinox.simpleconfigurator/bundles.info
org.eclipse.jdt.debug.ui.debuggerActive=false
org.eclipse.jdt.debug.ui.instanceof.IJavaStackFrame=false
org.eclipse.jdt.debug.ui.supportsForceReturn=false
org.eclipse.jdt.debug.ui.supportsInstanceRetrieval=false
org.eclipse.update.reconcile=false
org.osgi.framework.executionenvironment=OSGi/Minimum-1.0,OSGi/Minimum-1.1,OSGi/Minimum-1.2,JRE-1.1,J2SE-1.2,J2SE-1.3,J2SE-1.4,J2SE-1.5,JavaSE-1.6,JavaSE-1.7
org.osgi.framework.language=en
org.osgi.framework.os.name=Linux
org.osgi.framework.os.version=3.10.0.10
org.osgi.framework.processor=x86-64
org.osgi.framework.system.capabilities=osgi.ee; osgi.ee="OSGi/Minimum"; version:List<Version>="1.0, 1.1, 1.2",osgi.ee; osgi.ee="JRE"; version:List<Version>="1.0, 1.1",osgi.ee; osgi.ee="JavaSE"; version:List<Version>="1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7"
org.osgi.framework.system.packages=javax.accessibility,javax.activation,javax.activity,javax.annotation,javax.annotation.processing,javax.crypto,javax.crypto.interfaces,javax.crypto.spec,javax.imageio,javax.imageio.event,javax.imageio.metadata,javax.imageio.plugins.bmp,javax.imageio.plugins.jpeg,javax.imageio.spi,javax.imageio.stream,javax.jws,javax.jws.soap,javax.lang.model,javax.lang.model.element,javax.lang.model.type,javax.lang.model.util,javax.management,javax.management.loading,javax.management.modelmbean,javax.management.monitor,javax.management.openmbean,javax.management.relation,javax.management.remote,javax.management.remote.rmi,javax.management.timer,javax.naming,javax.naming.directory,javax.naming.event,javax.naming.ldap,javax.naming.spi,javax.net,javax.net.ssl,javax.print,javax.print.attribute,javax.print.attribute.standard,javax.print.event,javax.rmi,javax.rmi.CORBA,javax.rmi.ssl,javax.script,javax.security.auth,javax.security.auth.callback,javax.security.auth.kerberos,javax.security.auth.login,javax.security.auth.spi,javax.security.auth.x500,javax.security.cert,javax.security.sasl,javax.sound.midi,javax.sound.midi.spi,javax.sound.sampled,javax.sound.sampled.spi,javax.sql,javax.sql.rowset,javax.sql.rowset.serial,javax.sql.rowset.spi,javax.swing,javax.swing.border,javax.swing.colorchooser,javax.swing.event,javax.swing.filechooser,javax.swing.plaf,javax.swing.plaf.basic,javax.swing.plaf.metal,javax.swing.plaf.multi,javax.swing.plaf.nimbus,javax.swing.plaf.synth,javax.swing.table,javax.swing.text,javax.swing.text.html,javax.swing.text.html.parser,javax.swing.text.rtf,javax.swing.tree,javax.swing.undo,javax.tools,javax.transaction,javax.transaction.xa,javax.xml,javax.xml.bind,javax.xml.bind.annotation,javax.xml.bind.annotation.adapters,javax.xml.bind.attachment,javax.xml.bind.helpers,javax.xml.bind.util,javax.xml.crypto,javax.xml.crypto.dom,javax.xml.crypto.dsig,javax.xml.crypto.dsig.dom,javax.xml.crypto.dsig.keyinfo,javax.xml.crypto.dsig.spec,javax.xml.datatype,javax.xml.namespace,javax.xml.parsers,javax.xml.soap,javax.xml.stream,javax.xml.stream.events,javax.xml.stream.util,javax.xml.transform,javax.xml.transform.dom,javax.xml.transform.sax,javax.xml.transform.stax,javax.xml.transform.stream,javax.xml.validation,javax.xml.ws,javax.xml.ws.handler,javax.xml.ws.handler.soap,javax.xml.ws.http,javax.xml.ws.soap,javax.xml.ws.spi,javax.xml.ws.spi.http,javax.xml.ws.wsaddressing,javax.xml.xpath,org.ietf.jgss,org.omg.CORBA,org.omg.CORBA_2_3,org.omg.CORBA_2_3.portable,org.omg.CORBA.DynAnyPackage,org.omg.CORBA.ORBPackage,org.omg.CORBA.portable,org.omg.CORBA.TypeCodePackage,org.omg.CosNaming,org.omg.CosNaming.NamingContextExtPackage,org.omg.CosNaming.NamingContextPackage,org.omg.Dynamic,org.omg.DynamicAny,org.omg.DynamicAny.DynAnyFactoryPackage,org.omg.DynamicAny.DynAnyPackage,org.omg.IOP,org.omg.IOP.CodecFactoryPackage,org.omg.IOP.CodecPackage,org.omg.Messaging,org.omg.PortableInterceptor,org.omg.PortableInterceptor.ORBInitInfoPackage,org.omg.PortableServer,org.omg.PortableServer.CurrentPackage,org.omg.PortableServer.POAManagerPackage,org.omg.PortableServer.POAPackage,org.omg.PortableServer.portable,org.omg.PortableServer.ServantLocatorPackage,org.omg.SendingContext,org.omg.stub.java.rmi,org.w3c.dom,org.w3c.dom.bootstrap,org.w3c.dom.css,org.w3c.dom.events,org.w3c.dom.html,org.w3c.dom.ls,org.w3c.dom.ranges,org.w3c.dom.stylesheets,org.w3c.dom.traversal,org.w3c.dom.views,org.w3c.dom.xpath,org.xml.sax,org.xml.sax.ext,org.xml.sax.helpers
org.osgi.framework.uuid=a05b261b-bc82-0016-1621-b3d861b8ec1e
org.osgi.framework.vendor=Eclipse
org.osgi.framework.version=1.7.0
org.osgi.supports.framework.extension=true
org.osgi.supports.framework.fragment=true
org.osgi.supports.framework.requirebundle=true
os.arch=amd64
os.name=Linux
os.version=3.10.0-327.10.1.el7.x86_64
osgi.arch=x86_64
osgi.bundles=reference:file:org.eclipse.equinox.simpleconfigurator_1.0.301.v20120914-163612.jar@1:start
osgi.bundles.defaultStartLevel=4
osgi.bundlestore=/home/garrett/eclipse/configuration/org.eclipse.osgi/bundles
osgi.configuration.area=file:/home/garrett/eclipse/configuration/
osgi.framework=file:/home/garrett/eclipse/plugins/org.eclipse.osgi_3.8.2.v20130124-134944.jar
osgi.framework.extensions=
osgi.framework.shape=jar
osgi.framework.version=3.8.2.v20130124-134944
osgi.install.area=file:/home/garrett/eclipse/
osgi.instance.area=file:/home/garrett/workspace/
osgi.instance.area.default=file:/home/garrett/workspace/
osgi.logfile=/home/garrett/workspace/.metadata/.log
osgi.manifest.cache=/home/garrett/eclipse/configuration/org.eclipse.osgi/manifests
osgi.nl=en_US
osgi.os=linux
osgi.requiredJavaVersion=1.5
osgi.splashLocation=/home/garrett/eclipse//plugins/org.eclipse.platform_4.2.2.v201302041200/splash.bmp
osgi.splashPath=platform:/base/plugins/org.eclipse.platform
osgi.syspath=/home/garrett/eclipse/plugins
osgi.tracefile=/home/garrett/workspace/.metadata/trace.log
osgi.ws=gtk
path.separator=:
sun.arch.data.model=64
sun.awt.enableExtraMouseButtons=true
sun.boot.class.path=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/resources.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/rt.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/jsse.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/jce.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/charsets.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/jfr.jar:/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/classes
sun.boot.library.path=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/amd64
sun.cpu.endian=little
sun.cpu.isalist=
sun.desktop=gnome
sun.font.fontmanager=sun.awt.X11FontManager
sun.io.unicode.encoding=UnicodeLittle
sun.java.command=/home/garrett/eclipse//plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar -os linux -ws gtk -arch x86_64 -showsplash /home/garrett/eclipse//plugins/org.eclipse.platform_4.2.2.v201302041200/splash.bmp -launcher /home/garrett/eclipse/eclipse -name Eclipse --launcher.library /home/garrett/eclipse//plugins/org.eclipse.equinox.launcher.gtk.linux.x86_64_1.1.200.v20120913-144807/eclipse_1502.so -startup /home/garrett/eclipse//plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar --launcher.overrideVmargs -exitdata 8f8003 -product org.eclipse.epp.package.jee.product -vm /usr/bin/java -vmargs -Dosgi.requiredJavaVersion=1.5 -Dhelp.lucene.tokenizer=standard -XX:MaxPermSize=256m -Xms40m -Xmx512m -jar /home/garrett/eclipse//plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar
sun.java.launcher=SUN_STANDARD
sun.jnu.encoding=UTF-8
sun.management.compiler=HotSpot 64-Bit Tiered Compilers
sun.os.patch.level=unknown
swing.systemlaf=javax.swing.plaf.metal.MetalLookAndFeel
user.country=US
user.dir=/home/garrett/eclipse
user.home=/home/garrett
user.language=en
user.name=garrett
user.timezone=America/New_York

*** Features:
org.eclipse.cdt (8.1.2.201302132326) "Eclipse C/C++ Development Tools"
org.eclipse.cdt.gdb (7.0.0.201302132326) "GDB Common"
org.eclipse.cvs (1.3.201.v20130116-085741-7B79FJKAkF7BG7ODH5CAJT) "Eclipse CVS Client"
org.eclipse.datatools.common.doc.user (1.10.2.v201209181447-26-311A16321A3557) "Data Tools Platform User Documentation"
org.eclipse.datatools.connectivity.doc.user (1.10.2.v201209181447-37D-7733L3D753L7BBF) "Data Tools Platform Connectivity User Documentation"
org.eclipse.datatools.connectivity.feature (1.10.2.v201209181447-7C7h9DEt1bxqP9criVgb9XdVJxM) "Data Tools Platform Connectivity Plug-in"
org.eclipse.datatools.connectivity.oda.designer.core.feature (1.10.2.v201209181447-7B7C7RCcNBGVEWBjChUf) "DTP ODA Designer UI Framework Plug-in"
org.eclipse.datatools.connectivity.oda.designer.feature (1.10.2.v201209181447-4137w312412222241) "DTP ODA Designer UI Framework Plug-in"
org.eclipse.datatools.connectivity.oda.feature (1.10.2.v201209181447-7H7C7XCcNBHNEZEnCaQf) "DTP Open Data Access"
org.eclipse.datatools.doc.user (1.10.2.v201209181447-47C08w95FFAK89FHEC7) "Data Tool Platform User Documentation"
org.eclipse.datatools.enablement.apache.derby.feature (1.10.2.v201209181447-77798iBmKEQ3NjRZLqcr8KIQ) "High-level Sybase Enablement Plug-in"
org.eclipse.datatools.enablement.feature (1.10.2.v201209181447-7J9Q7UBWxiOqR0kgP1dlatUt_Gz-) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.hsqldb.feature (1.10.2.v201209181447-67E2AqGCM7KfNUIqKM8KIQ) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.ibm.feature (1.10.2.v201209181447-7F47YFC7sRdqUcnsbg_0) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.ingres.feature (1.10.2.v201209181447-540AkF78Z7UCRAQDB) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.jdbc.feature (1.10.2.v201209181447-4-39oB5896KB97JHP) "High-level Sybase Enablement Plug-in"
org.eclipse.datatools.enablement.jdt.feature (1.10.2.v201209181447-2-07w312218332612) "Data Tools Platform Connectivity JDT Extension Plug-in"
org.eclipse.datatools.enablement.msft.feature (1.10.2.v201209181447-546AkF7AM9ICL8W9Q) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.mysql.feature (1.10.2.v201209181447-5478AkF7AK8X9JCREG) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.oda.designer.feature (1.10.2.v201209181447-33778s735838595F67) "Eclipse Data Tools Platform XML ODA Designer"
org.eclipse.datatools.enablement.oda.feature (1.10.2.v201209181447-7A7T7DDZRDKJEZInGgOV) "Eclipse Data Tools Platform XML ODA Runtime Driver"
org.eclipse.datatools.enablement.oracle.feature (1.10.2.v201209181447-548fAkF7AL7RBJANAI) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.postgresql.feature (1.10.2.v201209181447-553AkF7AK8PCRBQBP) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.sap.feature (1.10.2.v201209181447-540AkF7AJ7YEJBU7S) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.sqlite.feature (1.10.2.v201209181447-542AkF7AJ7SAKAPBF) "Eclipse Data Tools Platform Enablement"
org.eclipse.datatools.enablement.sybase.feature (1.10.2.v201209181447-7E478F9NiNc2S7fxRCTD) "High-level Sybase Enablement Plug-in"
org.eclipse.datatools.intro (1.10.2.v201209181447-26-7w312116392911) "Eclipse Data Tools Platform Intro Plug-in"
org.eclipse.datatools.modelbase.feature (1.10.2.v201209181447-7707GCcNBHLDaKTEcRi) "Eclipse Data Tools Platform SQLModel Plug-in"
org.eclipse.datatools.sqldevtools.ddlgen.feature (1.10.2.v201209181447-7A-7DF7RZHQUMdThK5_t) "Eclipse Data Tools Platform FE UI Plug-in"
org.eclipse.datatools.sqldevtools.feature (1.10.2.v201209181447-7N8B7WFDri4ohCyg6O43UgSwbFm0) "Eclipse Data Tools Platform SQL Tools Common UI Plug-in"
org.eclipse.datatools.sqldevtools.parsers.feature (1.10.2.v201209181447-623BgJ9EE9ZJRDZLA) "Eclipse Data Tools Platform SQL Parser Plugin"
org.eclipse.datatools.sqltools.doc.user (1.10.2.v201209181447-37D-7733L3D753L7BBF) "Data Tools Platform SQL Tools User Documentation"
org.eclipse.draw2d (3.9.0.201212170307) "Graphical Editing Framework Draw2d"
org.eclipse.egit (2.2.0.201212191850-r) "Git Team Provider"
org.eclipse.egit.mylyn (2.2.0.201212191850-r) "Git Team Provider"
org.eclipse.emf (2.8.3.v20130125-0826) "EMF - Eclipse Modeling Framework Runtime and Tools"
org.eclipse.emf.codegen (2.8.0.v20130125-0826) "EMF Code Generation"
org.eclipse.emf.codegen.ecore (2.8.2.v20130125-0826) "EMF Ecore Code Generator"
org.eclipse.emf.codegen.ecore.ui (2.8.0.v20130125-0826) "EMF Ecore Code Generator UI"
org.eclipse.emf.codegen.ui (2.7.0.v20130125-0826) "EMF Code Generation UI"
org.eclipse.emf.common (2.8.0.v20130125-0546) "EMF Common"
org.eclipse.emf.common.ui (2.7.0.v20130125-0826) "EMF Common UI"
org.eclipse.emf.converter (2.8.0.v20130125-0826) "EMF Model Converter"
org.eclipse.emf.databinding (1.2.0.v20130125-0826) "EMF Data Binding"
org.eclipse.emf.databinding.edit (1.2.1.v20130125-0826) "EMF Edit Data Binding"
org.eclipse.emf.ecore (2.8.3.v20130125-0546) "EMF Ecore"
org.eclipse.emf.ecore.edit (2.8.0.v20130125-0826) "EMF Ecore Edit"
org.eclipse.emf.ecore.editor (2.8.0.v20130125-0826) "EMF Sample Ecore Editor"
org.eclipse.emf.edit (2.8.0.v20130125-0826) "EMF Edit"
org.eclipse.emf.edit.ui (2.8.0.v20130125-0826) "EMF Edit UI"
org.eclipse.emf.mapping (2.7.0.v20130125-0826) "EMF Mapping"
org.eclipse.emf.mapping.ecore (2.7.0.v20130125-0826) "EMF Ecore Mapping"
org.eclipse.emf.mapping.ecore.editor (2.7.0.v20130125-0826) "EMF Ecore Mapping Editor"
org.eclipse.emf.mapping.ui (2.7.0.v20130125-0826) "EMF Mapping UI"
org.eclipse.epp.mpc (1.1.1.I20110907-0947) "Marketplace Client"
org.eclipse.epp.package.jee.feature (1.5.2.20130211-1820) "Java EE IDE"
org.eclipse.gef (3.9.0.201212170307) "Graphical Editing Framework GEF"
org.eclipse.help (1.4.1.v20120912-144938-8R7xFOXFLWUl7PpNBh_HIGkb4) "Help System Base"
org.eclipse.jdt (3.8.2.v20130116-090414-8-8nFu3FNOfwKLRuqgXKIy9z0I83) "Eclipse Java Development Tools"
org.eclipse.jgit (2.2.0.201212191850-r) "JGit Core"
org.eclipse.jpt.common.eclipselink.feature (1.2.1.v201208222210-3318s73573J777753) "Dali Java Persistence Tools - EclipseLink Common"
org.eclipse.jpt.common.feature (1.2.2.v201301082148-664AkF7BG7WDLFEEF) "Dali Java Persistence Tools - Common"
org.eclipse.jpt.dbws.eclipselink.feature (1.1.102.v201301101606-797EBpCcNBHLEeHXGVaV4KKI) "Dali Java Persistence Tools - EclipseLink DBWS Support"
org.eclipse.jpt.jaxb.eclipselink.feature (1.3.2.v201301092252-777B5BgJ9EJAgHNGrMm1f9e) "Dali Java Persistence Tools - EclipseLink MOXy (JAXB) Support"
org.eclipse.jpt.jaxb.feature (1.2.2.v201301082148-56ACAkF7BG7WDLFEEF) "Dali Java Persistence Tools - JAXB Support"
org.eclipse.jpt.jpa.eclipselink.feature (3.2.2.v201301082148-7K7J78EVVFNVHz0NgOXgX4KKI) "Dali Java Persistence Tools - EclipseLink JPA Support"
org.eclipse.jpt.jpa.feature (3.2.2.v201301091616-7U7K8qFC7sRdwVKaof36y4KKI) "Dali Java Persistence Tools - JPA Support"
org.eclipse.jst.common.fproj.enablement.jdt (3.4.0.v201108231500-377DG8s73543J5H6D66) "Eclipse Faceted Project Framework JDT Enablement"
org.eclipse.jst.enterprise_ui.feature (3.4.2.v201301240600-7b7JINbFSK2WM3QNAEr799V-TyUp) "Eclipse Java EE Developer Tools"
org.eclipse.jst.ws.axis2tools.feature (1.1.200.v201103022333-78-FF0DZRDKDDePSKwHj) "Axis2 Tools"
org.eclipse.jst.ws.cxf.feature (1.1.1.v201301072322-7H79FI1FAKlbpxGw_Xn0myE7G9E) "CXF Web Services Core"
org.eclipse.jst.ws.jaxws.feature (1.2.1.v201301072322-7E7AF72F8NcJSbKkQAUoWl) "JAX-WS Tools Core"
org.eclipse.mylyn_feature (3.8.3.v20130107-0100) "Mylyn Tasks"
org.eclipse.mylyn.bugzilla_feature (3.8.3.v20130107-0100) "Mylyn Tasks"
org.eclipse.mylyn.commons (3.8.3.v20130107-0100) "Mylyn Commons"
org.eclipse.mylyn.commons.identity (1.0.3.v20130107-0100) "Mylyn Commons"
org.eclipse.mylyn.commons.notifications (1.0.3.v20130107-0100) "Mylyn Commons"
org.eclipse.mylyn.commons.repositories (1.0.3.v20130107-0100) "Mylyn Commons"
org.eclipse.mylyn.context_feature (3.8.3.v20130107-0100) "Mylyn Context"
org.eclipse.mylyn.discovery (3.8.3.v20130107-0100) "Mylyn Commons"
org.eclipse.mylyn.ide_feature (3.8.3.v20130107-0100) "Mylyn Context"
org.eclipse.mylyn.java_feature (3.8.3.v20130107-0100) "Mylyn Context"
org.eclipse.mylyn.monitor (3.8.3.v20130107-0100) "Mylyn Commons"
org.eclipse.mylyn.tasks.ide (3.8.3.v20130107-0100) "Mylyn Tasks"
org.eclipse.mylyn.team_feature (3.8.3.v20130107-0100) "Mylyn Context"
org.eclipse.mylyn.wikitext_feature (1.7.3.v20130107-0100) "Mylyn WikiText"
org.eclipse.pde (3.8.2.v20130116-091538-7c7wFj0FFt6Zr9bd4AM1JEQMS) "PDE"
org.eclipse.platform (4.2.1.v20130118-173121-9MF7GHYdG0B5kx4E_SkfZV-1mNjVATf67ZAb7) "Eclipse Platform"
org.eclipse.rcp (4.2.2.v20130129-152330-7IARAABrMQkGSvMgQnUlz-DQz00h) "Eclipse RCP"
org.eclipse.rse (3.4.1.201302122026) "Remote System Explorer End-User Runtime"
org.eclipse.rse.core (3.4.1.201302122026) "RSE Core"
org.eclipse.rse.dstore (3.4.1.201302071946) "RSE DStore Services"
org.eclipse.rse.ftp (3.1.0.201302062102) "RSE FTP Service"
org.eclipse.rse.local (2.1.400.201302062104) "RSE Local Services"
org.eclipse.rse.ssh (3.0.400.201205062159) "RSE SSH Services"
org.eclipse.rse.telnet (2.3.0.201205241511) "RSE Telnet Service"
org.eclipse.rse.terminals (1.2.1.201301071106) "RSE Terminals UI"
org.eclipse.rse.useractions (1.1.400.201301240456) "Remote System Explorer User Actions"
org.eclipse.tm.terminal (3.2.2.201301071106) "Target Management Terminal Widget"
org.eclipse.tm.terminal.ssh (2.1.200.201301080822) "Target Management Terminal SSH Connector"
org.eclipse.tm.terminal.telnet (2.1.200.201301080822) "Target Management Terminal Telnet Connector"
org.eclipse.tm.terminal.view (2.4.1.201301031142) "Target Management Terminal View"
org.eclipse.wb.core.feature (1.5.2.r42x201302111859) "WindowBuilder Core"
org.eclipse.wb.core.ui.feature (1.5.2.r42x201302111927) "WindowBuilder Core UI"
org.eclipse.wb.core.xml.feature (1.5.2.r42x201302111919) "WindowBuilder Core for XML GUI's"
org.eclipse.wb.doc.user.feature (1.5.2.r42x201302111931) "WindowBuilder User Guide"
org.eclipse.wb.layout.group.feature (1.5.2.r42x201302111942) "WindowBuilder GroupLayout Support"
org.eclipse.wb.rcp.feature (1.5.2.r42x201302112047) "SWT Designer"
org.eclipse.wb.rcp.SWT_AWT_support (1.5.2.r42x201302112057) "WindowBuilder SWT_AWT Support"
org.eclipse.wb.swing.feature (1.5.2.r42x201302112024) "Swing Designer"
org.eclipse.wb.swt.feature (1.5.2.r42x201302112017) "SWT Designer Core"
org.eclipse.wb.xwt.feature (1.5.2.r42x201302112106) "SWT Designer XWT Support"
org.eclipse.wst.common.fproj (3.4.0.v201202292300-377F8N8s735555393B7B) "Eclipse Faceted Project Framework"
org.eclipse.wst.jsdt.feature (1.4.1.v201208171701-7H7DFg0FC7sReqSyfqesWi) "Eclipse JavaScript Development Tools"
org.eclipse.wst.web_ui.feature (3.4.2.v201211061806-7O7MFu3EMkBK01NbrfU9ATE5cdZFz-OoeYjaI4d2) "Eclipse Web Developer Tools"
org.eclipse.wst.xml_ui.feature (3.4.2.v201211061806-7H7GFeJDxumUrsn5qkiQgOEhsz0p60HAmPyU6VX) "Eclipse XML Editors and Tools"
org.eclipse.wst.xml.xpath2.processor.feature (2.0.101.v201301101924-7A7K1CcNBGPDRH_FUNe) "Eclipse XPath 2 Developers Tools"
org.eclipse.wst.xsl.feature (1.3.200.v201212131556-7T7ZFUbFIqUoJvvaKoCpRBIaGVOf) "Eclipse XSL Developer Tools"

*** Plug-in Registry:
com.ibm.icu (4.4.2.v20110823) "International Components for Unicode for Java (ICU4J)" [Active]
com.jcraft.jsch (0.1.46.v201205102330) "JSch" [Resolved]
com.sun.el (2.2.0.v201108011116) "Javax Expression Language Reference Implementation Bundle" [Resolved]
com.sun.syndication (0.9.0.v200803061811) "Rss and atOM utilitiEs (ROME)" [Resolved]
java_cup.runtime (0.10.0.v201005080400) "Java Cup" [Resolved]
javax.activation (1.1.0.v201108011116) "Apache Geronimo Activation Plug-in" [Resolved]
javax.annotation (1.0.0.v20101115-0725) "Common Annotations" [Resolved]
javax.el (2.2.0.v201108011116) "Javax Expression Language Bundle" [Resolved]
javax.inject (1.0.0.v20091030) "Atinject Dependency Injection Annotations" [Resolved]
javax.jws (2.0.0.v201005080400) "Web Services Metadata" [Resolved]
javax.mail (1.4.0.v201005080615) "Javax Mail Plug-in" [Resolved]
javax.persistence (2.0.5.v201212031355) "Java Persistence API 2.0" [Resolved]
javax.servlet (3.0.0.v201112011016) "Servlet API Bundle" [Resolved]
javax.servlet.jsp (2.2.0.v201112011158) "JSP API Bundle" [Resolved]
javax.wsdl (1.5.1.v201012040544) "WSDL4J" [Resolved]
javax.wsdl (1.6.2.v201012040545) "WSDL4J" [Resolved]
javax.xml (1.3.4.v201005080400) "JAXP XML" [Resolved]
javax.xml.bind (2.1.9.v201005080401) "XML Binding for Java" [Resolved]
javax.xml.rpc (1.1.0.v201005080400) "JAX-RPC" [Resolved]
javax.xml.soap (1.2.0.v201005080501) "SAAJ" [Resolved]
javax.xml.stream (1.0.1.v201004272200) "Java XML Streaming API" [Resolved]
javax.xml.ws (2.1.0.v200902101523) "Java API for XML Web Services (JAX-WS)" [Resolved]
net.sourceforge.lpg.lpgjavaruntime (1.1.0.v201004271650) "SourceForge LPG" [Resolved]
org.apache.ant (1.8.3.v201301120609) "Apache Ant" [Resolved]
org.apache.axis (1.4.0.v201005080400) "Apache Web Services" [Resolved]
org.apache.batik.css (1.6.0.v201011041432) "Apache Batik CSS" [Resolved]
org.apache.batik.util (1.6.0.v201011041432) "Apache Batik Utilities" [Resolved]
org.apache.batik.util.gui (1.6.0.v201011041432) "Apache Batik GUI Utilities" [Resolved]
org.apache.bcel (5.2.0.v201005080400) "Apache BCEL" [Resolved]
org.apache.commons.codec (1.3.0.v201101211617) "Apache Commons Codec Plug-in" [Resolved]
org.apache.commons.collections (3.2.0.v201005080500) "Apache Commons Collections" [Resolved]
org.apache.commons.compress (1.3.0.v201212111400) "Apache Commons Compress" [Resolved]
org.apache.commons.discovery (0.2.0.v201004190315) "Jakarta-Commons Discovery" [Resolved]
org.apache.commons.httpclient (3.1.0.v201012070820) "Apache Commons Httpclient" [Resolved]
org.apache.commons.lang (2.6.0.v201205030909) "Apache Commons Lang" [Resolved]
org.apache.commons.lang (2.1.0.v201005080500) "Apache Jakarta Commons Lang" [Resolved]
org.apache.commons.logging (1.0.4.v201101211617) "Apache Commons Logging Plug-in" [Resolved]
org.apache.commons.net (2.2.0.v201101241833) "Apache Commons Net" [Resolved]
org.apache.felix.gogo.command (0.8.0.v201108120515) "Apache Felix Gogo Command" [Active]
org.apache.felix.gogo.runtime (0.8.0.v201108120515) "Apache Felix Gogo Runtime" [Active]
org.apache.felix.gogo.shell (0.8.0.v201110170705) "Apache Felix Gogo Shell" [Active]
org.apache.jasper.glassfish (2.2.2.v201205150955) "JSP 2.2 implementation from Glassfish" [Resolved]
org.apache.log4j (1.2.15.v201012070815) "Apache Jakarta log4j Plug-in" [Resolved]
org.apache.lucene (2.9.1.v201101211721) "Apache Lucene" [Resolved]
org.apache.lucene.analysis (2.9.1.v201101211721) "Apache Lucene Analysis" [Resolved]
org.apache.lucene.core (2.9.1.v201101211721) "Apache Lucene Core" [Resolved]
org.apache.velocity (1.5.0.v200905192330) "Apache Velocity Plug-in" [Resolved]
org.apache.ws.commons.util (1.0.1.v20100518-1140) "WS Commons Util Plug-in" [Resolved]
org.apache.wsil4j (1.0.0.v200901211807) "WSIL4J" [Resolved]
org.apache.xalan (2.7.1.v201005080400) "Xalan-Java" [Resolved]
org.apache.xerces (2.9.0.v201101211617) "Apache Xerces-J" [Resolved]
org.apache.xml.resolver (1.2.0.v201005080400) "Apache XmlResolver" [Resolved]
org.apache.xml.serializer (2.7.1.v201005080400) "Apache XML Commons Serializer" [Resolved]
org.apache.xmlrpc (3.0.0.v20100427-1100) "Apache XML-RPC Plug-in" [Resolved]
org.eclipse.ant.core (3.2.401.v20121204-162022) "Ant Build Tool Core" [Starting]
org.eclipse.ant.launching (1.0.200.v20120530-1204) "Ant Launching Support" [Starting]
org.eclipse.ant.ui (3.5.301.v20121210-210948) "Ant UI" [Starting]
org.eclipse.cdt (8.1.1.201302132326) "Eclipse C/C++ Development Tools" [Starting]
org.eclipse.cdt.codan.checkers (1.1.0.201302132326) "Codan Checkers" [Starting]
org.eclipse.cdt.codan.checkers.ui (1.1.0.201302132326) "Codan Checkers UI" [Starting]
org.eclipse.cdt.codan.core (2.1.0.201302132326) "Code Analysis Core" [Starting]
org.eclipse.cdt.codan.core.cxx (1.1.0.201302132326) "Code Analysis Core for C/C++" [Starting]
org.eclipse.cdt.codan.ui (2.1.0.201302132326) "Code Analysis UI" [Starting]
org.eclipse.cdt.codan.ui.cxx (3.0.0.201302132326) "Codan Analysis UI for C/C++" [Active]
org.eclipse.cdt.core (5.4.1.201302132326) "C/C++ Development Tools Core" [Active]
org.eclipse.cdt.core.linux (5.2.0.201302132326) "C/C++ Development Tools Core for Linux" [Resolved]
org.eclipse.cdt.core.linux.x86_64 (5.2.0.201302132326) "C/C++ Development Tools Core for Linux (x86_64)" [Resolved]
org.eclipse.cdt.debug.core (7.2.0.201302132326) "C/C++ Development Tools Debug Model" [Active]
org.eclipse.cdt.debug.mi.core (7.2.0.201302132326) "C/C++ Development Tools GDB/MI CDI Debugger Core" [Active]
org.eclipse.cdt.debug.mi.ui (6.1.1.201302132326) "C/C++ Development Tools GDB/MI CDI Debugger UI" [Active]
org.eclipse.cdt.debug.ui (7.2.0.201302132326) "C/C++ Development Tools Debugger UI" [Active]
org.eclipse.cdt.doc.user (5.2.0.201302132326) "C/C++ Development User Guide" [Starting]
org.eclipse.cdt.dsf (2.3.0.201302132326) "Debug Services Framework Core" [Active]
org.eclipse.cdt.dsf.gdb (4.1.1.201302132326) "GDB DSF Debugger Integration Core" [Active]
org.eclipse.cdt.dsf.gdb.ui (2.3.1.201302132326) "GDB DSF Debugger Integration UI" [Active]
org.eclipse.cdt.dsf.ui (2.3.0.201302132326) "Debugger Services Framework UI" [Active]
org.eclipse.cdt.gdb (7.0.0.201302132326) "GDB Common" [Starting]
org.eclipse.cdt.gdb.ui (7.0.0.201302132326) "GDB UI Common" [Starting]
org.eclipse.cdt.launch (7.1.0.201302132326) "C/C++ Development Tools Launching Support" [Starting]
org.eclipse.cdt.make.core (7.2.0.201302132326) "C/C++ Standard make Build Core" [Active]
org.eclipse.cdt.make.ui (7.2.0.201302132326) "C/C++ Standard make Build UI" [Active]
org.eclipse.cdt.managedbuilder.core (8.1.0.201302132326) "CDT Build System Core" [Active]
org.eclipse.cdt.managedbuilder.gnu.ui (8.1.0.201302132326) "GNU Managed Build Definitions" [Starting]
org.eclipse.cdt.managedbuilder.ui (8.1.0.201302132326) "C/C++ Managed Builder UI" [Starting]
org.eclipse.cdt.ui (5.5.0.201302132326) "C/C++ Development Tools UI" [Active]
org.eclipse.compare (3.5.301.v20130125-135424) "Compare Support" [Active]
org.eclipse.compare.core (3.5.200.v20120522-1148) "Core Compare Support" [Active]
org.eclipse.core.commands (3.6.2.v20130123-162658) "Commands" [Resolved]
org.eclipse.core.contenttype (3.4.200.v20120523-2004) "Eclipse Content Mechanism" [Active]
org.eclipse.core.databinding (1.4.1.v20120912-132807) "JFace Data Binding" [Starting]
org.eclipse.core.databinding.beans (1.2.200.v20120523-1955) "JFace Data Binding for JavaBeans" [Resolved]
org.eclipse.core.databinding.observable (1.4.1.v20120521-2329) "JFace Data Binding Observables" [Active]
org.eclipse.core.databinding.property (1.4.100.v20120523-1955) "JFace Data Binding" [Starting]
org.eclipse.core.expressions (3.4.401.v20120912-155018) "Expression Language" [Active]
org.eclipse.core.externaltools (1.0.100.v20120521-2012) "External Tools Headless Support" [Starting]
org.eclipse.core.filebuffers (3.5.200.v20120523-1310) "File Buffers" [Active]
org.eclipse.core.filesystem (1.3.200.v20130115-145044) "Core File Systems" [Active]
org.eclipse.core.filesystem.linux.x86_64 (1.2.0.v20120522-1137) "Core File System for Linux" [Resolved]
org.eclipse.core.jobs (3.5.300.v20120912-155018) "Eclipse Jobs Mechanism" [Active]
org.eclipse.core.net (1.2.200.v20120914-093638) "Internet Connection Management" [Active]
org.eclipse.core.net.linux.x86_64 (1.1.0.v20120522-1148) "Proxy for Linux x86_64" [Resolved]
org.eclipse.core.resources (3.8.1.v20121114-124432) "Core Resource Management" [Active]
org.eclipse.core.runtime (3.8.0.v20120912-155025) "Core Runtime" [Active]
org.eclipse.core.runtime.compatibility (3.2.200.v20120521-2346) "Core Runtime Plug-in Compatibility" [Active]
org.eclipse.core.runtime.compatibility.auth (3.2.300.v20120523-2004) "Authorization Compatibility Plug-in" [Starting]
org.eclipse.core.runtime.compatibility.registry (3.5.101.v20130108-163257) "Eclipse Registry Compatibility Fragment" [Resolved]
org.eclipse.core.variables (3.2.600.v20120521-2012) "Core Variables" [Active]
org.eclipse.cvs (1.2.1.v201302041200) "Eclipse CVS Client" [Starting]
org.eclipse.datatools.common.doc.user (1.7.0.20090521092446) "Data Tools Platform User Documentation" [Starting]
org.eclipse.datatools.connectivity (1.2.7.v201302060508) "Data Tools Platform Connectivity Plug-in" [Starting]
org.eclipse.datatools.connectivity.apache.derby (1.0.103.v201212070447) "Eclipse Data Tools Platform Derby Plug-in" [Starting]
org.eclipse.datatools.connectivity.apache.derby.dbdefinition (1.0.2.v201107221459) "Eclipse Data Tools Platform Apache Derby Database Definition" [Starting]
org.eclipse.datatools.connectivity.apache.derby.ui (1.0.3.v201107221459) "Eclipse Data Tools Platform Apache Derby UI Plug-in" [Starting]
org.eclipse.datatools.connectivity.console.profile (1.0.10.v201109250955) "DTP Connection Profiles Storage File Editor Plug-in" [Starting]
org.eclipse.datatools.connectivity.db.generic (1.0.1.v201107221459) "Eclipse Data Tools Platform Generic DB Connectivity Plug-in" [Starting]
org.eclipse.datatools.connectivity.db.generic.ui (1.0.2.v201211200622) "Eclipse Data Tools Platform Generic DB UI Plug-in" [Starting]
org.eclipse.datatools.connectivity.dbdefinition.genericJDBC (1.0.1.v201107221459) "Eclipse Data Tools Platform DBDefinition Generic JDBC Plug-in" [Starting]
org.eclipse.datatools.connectivity.doc.user (1.7.0.20090521092446) "Data Tools Platform Connectivity User Documentation" [Starting]
org.eclipse.datatools.connectivity.doc.user.contexts (1.7.0.20090521092446) "Data Tools Platform Connectivity User Documentation for context-sensitive help" [Starting]
org.eclipse.datatools.connectivity.oda (3.3.4.v201212070447) "DTP Open Data Access" [Starting]
org.eclipse.datatools.connectivity.oda.consumer (3.2.5.v201109151100) "DTP ODA Consumer Helper Component Plug-in" [Starting]
org.eclipse.datatools.connectivity.oda.design (3.3.6.v201212070447) "DTP ODA Design Session Model" [Starting]
org.eclipse.datatools.connectivity.oda.design.ui (3.2.8.v201207060816) "DTP ODA Designer UI Framework Plug-in" [Starting]
org.eclipse.datatools.connectivity.oda.flatfile (3.1.4.v201210260850) "Eclipse Data Tools Platform Flat File ODA Runtime Driver" [Starting]
org.eclipse.datatools.connectivity.oda.flatfile.ui (3.1.5.v201302061811) "Eclipse Data Tools Platform Flat File ODA Designer" [Starting]
org.eclipse.datatools.connectivity.oda.profile (3.2.8.v201209080429) "DTP ODA Connection Profile Framework Plug-in" [Starting]
org.eclipse.datatools.connectivity.oda.template.ui (3.2.4.v201301111130) "DTP ODA New Plug-in Template Wizard" [Starting]
org.eclipse.datatools.connectivity.sqm.core (1.2.6.v201212070447) "Eclipse Data Tools Platform SQM Core Plug-in" [Starting]
org.eclipse.datatools.connectivity.sqm.core.ui (1.2.3.v201212070447) "Eclipse Data Tools Platform SQM UI Plug-in" [Starting]
org.eclipse.datatools.connectivity.sqm.server.ui (1.1.101.v201212070447) "Eclipse Data Tools Platform Server UI Plug-in" [Starting]
org.eclipse.datatools.connectivity.ui (1.2.4.v201212070447) "Data Tools Platform Connectivity UI Plug-in" [Starting]
org.eclipse.datatools.connectivity.ui.dse (1.1.5.v201212070447) "Eclipse Data Tools Platform Data Source Explorer Plug-in" [Starting]
org.eclipse.datatools.doc.user (1.7.0.20090521092446) "Data Tool Platform User Documentation" [Starting]
org.eclipse.datatools.enablement.finfo (1.5.1.v200906161800) "Eclipse Data Tools Platform Enablement" [Starting]
org.eclipse.datatools.enablement.hsqldb (1.0.0.v201107221502) "Eclipse Data Tools Platform HSQLDB Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.hsqldb.dbdefinition (1.0.0.v201107221502) "Eclipse Data Tools Platform HSQLDB Database Definition Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.hsqldb.ui (1.0.0.v201108120600) "Eclipse Data Tools Platform HSQLDB UI Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.iseries (1.0.2.v201107221502) "Eclipse Data Tools Platform IBM DB2 UDB iSeries Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.iseries.dbdefinition (1.0.3.v201107221502) "DB2 UDB iSeries Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.iseries.ui (1.0.3.v201212120614) "Eclipse Data Tools Platform IBM DB2 UDB UI iSeries Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.luw (1.0.2.v201107221502) "Eclipse Data Tools Platform IBM DB2 UDB LUW Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.luw.dbdefinition (1.0.4.v201107221502) "Eclipse Data Tools Platform DB2 UDB Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.luw.ui (1.0.4.v201212120614) "Eclipse Data Tools Platform IBM DB2 UDB LUW UI Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.zseries (1.0.2.v201107221502) "Eclipse Data Tools Platform IBM DB2 UDB zSeries Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.zseries.dbdefinition (1.0.4.v201107221502) "DB2 UDB Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.db2.zseries.ui (1.0.2.v201202100836) "Eclipse Data Tools Platform IBM DB2 UDB zSeries UI Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.informix (1.0.1.v201107221502) "Eclipse Data Tools Platform Informix Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.informix.dbdefinition (1.0.4.v201107221502) "Eclipse Data Tools Platform Informix Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.informix.ui (1.0.3.v201202100836) "Eclipse Data Tools Platform Informix UI Plug-in" [Starting]
org.eclipse.datatools.enablement.ibm.ui (1.0.0.v201107221502) "Eclipse Data Tools Platform IBM UI Plug-in" [Starting]
org.eclipse.datatools.enablement.ingres (1.0.0.v200906111150) "Ingres DTP Plug-in" [Starting]
org.eclipse.datatools.enablement.ingres.dbdefinition (1.0.0.v200906161800) "Ingres DTP Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.ingres.ui (1.0.0.v201105270214) "Ingres DTP UI Plug-in" [Starting]
org.eclipse.datatools.enablement.jdt.classpath (1.0.1.v201107221501) "Data Tools Platform Connectivity JDT Extension Plug-in" [Starting]
org.eclipse.datatools.enablement.msft.sqlserver (1.0.2.v201212120617) "Eclipse Data Tools Platform Microsoft SQL Server Plug-in" [Starting]
org.eclipse.datatools.enablement.msft.sqlserver.dbdefinition (1.0.1.v201201240505) "Eclipse Data Tools Platform SQL Server Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.msft.sqlserver.ui (1.0.3.v201212120617) "Eclipse Data Tools Platform Microsoft SQL Server UI Plug-in" [Starting]
org.eclipse.datatools.enablement.mysql (1.0.4.v201212120617) "Eclipse Data Tools Platform MySQL Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.mysql.dbdefinition (1.0.4.v201109022331) "Eclipse Data Tools Platform MySQL Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.mysql.ui (1.0.0.v201109022331) "Eclipse Data Tools Platform MySQL UI Plug-in" [Starting]
org.eclipse.datatools.enablement.oda.ws (1.2.4.v201203221631) "Eclipse Data Tools Platform Web Services ODA Runtime Driver" [Starting]
org.eclipse.datatools.enablement.oda.ws.ui (1.2.4.v201203221631) "Eclipse Data Tools Platform Web Services ODA Designer" [Starting]
org.eclipse.datatools.enablement.oda.xml (1.2.4.v201301161136) "Eclipse Data Tools Platform XML ODA Runtime Driver" [Starting]
org.eclipse.datatools.enablement.oda.xml.ui (1.2.4.v201302041603) "Eclipse Data Tools Platform XML ODA Designer" [Starting]
org.eclipse.datatools.enablement.oracle (1.0.0.v201107221506) "Eclipse Data Tools Platform Oracle Plug-in" [Starting]
org.eclipse.datatools.enablement.oracle.dbdefinition (1.0.103.v201206010214) "Eclipse Data Tools Platform Oracle Database Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.oracle.ui (1.0.3.v201201131121) "Eclipse Data Tools Platform Oracle UI Plug-in" [Starting]
org.eclipse.datatools.enablement.postgresql (1.1.1.v201205252207) "PostgreSQL Connection Profile and Driver Template Plug-in" [Starting]
org.eclipse.datatools.enablement.postgresql.dbdefinition (1.0.2.v201110070445) "PostgreSQL DB Definition" [Starting]
org.eclipse.datatools.enablement.postgresql.ui (1.0.0.v201107221506) "PostgreSQL Connection Profile and Driver Template UI Plug-in" [Starting]
org.eclipse.datatools.enablement.sap.maxdb (1.0.0.v201107221507) "Eclipse Data Tools Platform MaxDB Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.sap.maxdb.dbdefinition (1.0.0.v201107221507) "Eclipse Data Tools Platform MaxDB Definition Plug-in" [Starting]
org.eclipse.datatools.enablement.sap.maxdb.ui (1.0.0.v201107221507) "Eclipse Data Tools Platform MaxDB UI Plug-in" [Starting]
org.eclipse.datatools.enablement.sqlite (1.0.0.v201002041100) "Eclipse Data Tools Platform SQLite Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.sqlite.dbdefinition (1.0.2.v201206010441) "Eclipse Data Tools Platform SQLite Database Definition Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.sqlite.ui (1.0.0.v201107221507) "Eclipse Data Tools Platform SQLite UI Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase (1.0.1.v201107221507) "High-level Sybase Enablement Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase.asa (1.0.2.v201212120618) "Sybase ASA Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase.asa.dbdefinition (1.0.0.v200906161800) "Eclipse Data Tools Platform Sybase ASA Database Definition" [Starting]
org.eclipse.datatools.enablement.sybase.asa.models (1.0.0.v201107221507) "Sybase ASA SQL Model" [Starting]
org.eclipse.datatools.enablement.sybase.asa.schemaobjecteditor.examples (2.5.0.200810071) "Sybase ASA Schema Object Editor" [Starting]
org.eclipse.datatools.enablement.sybase.asa.ui (1.0.1.v200906111204) "Sybase ASA Connection Profile UI Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase.ase (1.0.3.v201212120618) "JDBC/Sybase ASE Connection Profile Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase.ase.dbdefinition (1.0.0.v201107221507) "Eclipse Data Tools Platform Sybase ASE Database Definition" [Starting]
org.eclipse.datatools.enablement.sybase.ase.models (1.0.1.v201010140307) "Sybase ASE Model Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase.ase.ui (1.0.1.v200906020900) "ASE Enablement UI Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase.models (1.0.0.v201010140307) "Sybase Model Plug-in" [Starting]
org.eclipse.datatools.enablement.sybase.ui (1.0.0.v200906090452) "Sybase UI Plug-in" [Starting]
org.eclipse.datatools.help (1.5.0.v200906020553) "Data Tools Platform Help Utilities" [Resolved]
org.eclipse.datatools.intro (1.7.0.v201005281800) "Eclipse Data Tools Platform Intro Plug-in" [Resolved]
org.eclipse.datatools.modelbase.dbdefinition (1.0.2.v201107221519) "Eclipse Data Tools Platform DBDefinition Model" [Starting]
org.eclipse.datatools.modelbase.derby (1.0.0.v201107221519) "Eclipse Data Tools Platform Derby Model Plug-in" [Starting]
org.eclipse.datatools.modelbase.sql (1.0.6.v201208230744) "Eclipse Data Tools Platform SQLModel Plug-in" [Starting]
org.eclipse.datatools.modelbase.sql.edit (1.0.2.v201208230744) "Eclipse Data Tools Platform SQLModel Edit Plug-in" [Starting]
org.eclipse.datatools.modelbase.sql.query (1.1.4.v201212120619) "Eclipse Data Tools Platform SQL Query Model Plugin" [Starting]
org.eclipse.datatools.modelbase.sql.query.edit (1.0.1.v201110151245) "SQL Query Edit Support Plugin" [Starting]
org.eclipse.datatools.modelbase.sql.xml.query (1.0.2.v201201131123) "Eclipse Data Tools Platform SQL XML Query Model Plugin" [Starting]
org.eclipse.datatools.oda.cshelp (1.1.1.v201107221500) "DTP ODA Context-sensitive Help" [Starting]
org.eclipse.datatools.sqltools.common.ui (1.0.1.v201212120623) "Eclipse Data Tools Platform SQL Tools Common UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.data.core (1.2.3.v201212120623) "Data Core Plugin" [Starting]
org.eclipse.datatools.sqltools.data.ui (1.2.2.v201212120623) "Data UI Plugin" [Starting]
org.eclipse.datatools.sqltools.db.derby (1.0.0.v201107221520) "Eclipse Data Tools Platform Derby SQL Tools Plug-in" [Starting]
org.eclipse.datatools.sqltools.db.derby.ui (1.0.0.v200906020900) "Eclipse Data Tools Platform Derby SQL Tools UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.db.generic (1.0.0.v201107221520) "Eclipse Data Tools Platform SQL Tools Generic Database Plug-in" [Starting]
org.eclipse.datatools.sqltools.db.generic.ui (1.0.0.v200906020900) "Eclipse Data Tools Platform SQL Tools Generic Database UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.ddlgen.ui (1.0.3.v201211200616) "Eclipse Data Tools Platform FE UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.debugger.core (1.0.1.v201107221520) "Eclipse Data Tools Platform SQL Debugger Framework" [Starting]
org.eclipse.datatools.sqltools.debugger.core.ui (1.0.0.v201003161000) "Eclipse Data Tools Platform SQL Debugger UI Framework" [Starting]
org.eclipse.datatools.sqltools.doc.user (1.7.0.20090521092446) "Data Tools Platform SQL Tools User Documentation" [Starting]
org.eclipse.datatools.sqltools.doc.user.contexts (1.7.0.20090521092446) "Data Tools Platform SQL Tools User Documentation for context-sensitive help" [Starting]
org.eclipse.datatools.sqltools.editor.core (1.0.3.v201212120623) "Eclipse Data Tools Platform SQL Editor Core Plug-in" [Starting]
org.eclipse.datatools.sqltools.editor.core.ui (1.0.0.v201001150815) "Eclipse Data Tools Platform SQL Editor Core UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.parsers.sql (1.0.2.v201107221520) "Eclipse Data Tools Platform SQL Parser Plugin" [Starting]
org.eclipse.datatools.sqltools.parsers.sql.lexer (1.0.1.v201107221520) "Eclipse Data Tools Platform Lexer Plug-in" [Starting]
org.eclipse.datatools.sqltools.parsers.sql.query (1.2.1.v201201250511) "Eclipse Data Tools Platform SQL Query Parser Plugin" [Starting]
org.eclipse.datatools.sqltools.parsers.sql.xml.query (1.0.0.v201107221520) "Eclipse Data Tools Platform SQL XML Query Parser Plugin" [Starting]
org.eclipse.datatools.sqltools.plan (1.0.0.v201107221520) "Eclipse Data Tools Platform SQL Execution Plan View Plug-in" [Starting]
org.eclipse.datatools.sqltools.result (1.1.6.v201302050842) "Eclipse Data Tools Platform SQL Results View Plug-ins" [Starting]
org.eclipse.datatools.sqltools.result.ui (1.1.3.v201302061703) "Eclipse Data Tools Platform SQL Results View UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.routineeditor (1.0.0.v201107221520) "Eclipse Data Tools Platform SQL Tools Routine Editor Plug-in" [Starting]
org.eclipse.datatools.sqltools.routineeditor.ui (1.0.3.v201211200616) "Eclipse Data Tools Platform SQL Tools Routine Editor UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.schemaobjecteditor (1.1.0.v200906022302) "Schema Object Editor Plug-in" [Starting]
org.eclipse.datatools.sqltools.schemaobjecteditor.ui (1.1.1.200810071) "Schema Object Editor Framework" [Starting]
org.eclipse.datatools.sqltools.schemaobjecteditor.ui.pages (1.1.1.200810071) "Schema Object Editor Pages Plug-in" [Starting]
org.eclipse.datatools.sqltools.sql (1.0.1.v201110050515) "Eclipse Data Tools Platform SQL Core Plug-in" [Starting]
org.eclipse.datatools.sqltools.sql.ui (1.0.1.v201201270735) "Eclipse Data Tools Platform SQL Core UI Plug-in" [Starting]
org.eclipse.datatools.sqltools.sqlbuilder (1.0.5.v201212120623) "SQL Builder" [Starting]
org.eclipse.datatools.sqltools.sqleditor (1.0.4.v201212120623) "Eclipse Data Tools Platform SQL Editor" [Starting]
org.eclipse.datatools.sqltools.sqlscrapbook (1.0.2.v201205310922) "Eclipse Data Tools Platform Sqlscrapbook Plug-in" [Starting]
org.eclipse.datatools.sqltools.tabledataeditor (1.0.2.v201212120623) "Eclipse Data Tools Platform Table Data Editor Plug-in" [Starting]
org.eclipse.debug.core (3.7.100.v20120521-2012) "Debug Core" [Active]
org.eclipse.debug.ui (3.8.2.v20130130-171415) "Debug UI" [Active]
org.eclipse.draw2d (3.9.0.201212170307) "Graphical Editing Framework Draw2d" [Starting]
org.eclipse.dstore.core (3.3.101.201302071946) "RSE DStore Core" [Starting]
org.eclipse.dstore.extra (2.1.400.201211090626) "RSE DStore Platform Support" [Starting]
org.eclipse.e4.core.commands (0.10.1.v20120523-1955) "Eclipse e4 core commands" [Active]
org.eclipse.e4.core.contexts (1.2.0.v20121221-192508) "Eclipse Contexts" [Active]
org.eclipse.e4.core.di (1.2.0.v20121024-173149) "Eclipse Dependency Injection" [Active]
org.eclipse.e4.core.di.extensions (0.11.100.v20121024-182359) "Eclipse Dependency Injection Extensions" [Active]
org.eclipse.e4.core.services (1.0.0.v20120521-2346) "Eclipse Application Services" [Active]
org.eclipse.e4.ui.bindings (0.10.3.v20130123-162658) "Eclipse Bindings Support" [Active]
org.eclipse.e4.ui.css.core (0.10.2.v20120912-132817) "Eclipse CSS Core Support" [Resolved]
org.eclipse.e4.ui.css.swt (0.10.3.v20130123-162658) "Eclipse CSS SWT Support" [Active]
org.eclipse.e4.ui.css.swt.theme (0.9.4.v20130123-162658) "Eclipse CSS SWT Theme Support" [Active]
org.eclipse.e4.ui.di (0.10.1.v20120523-1955) "Eclipse UI Dependency Injection" [Active]
org.eclipse.e4.ui.model.workbench (0.10.1.v20120523-1955) "Eclipse Workbench Model" [Active]
org.eclipse.e4.ui.services (0.10.3.v20130123-162658) "Eclipse UI Application Services" [Active]
org.eclipse.e4.ui.widgets (0.12.3.v20130123-162658) "Eclipse UI Custom widgets" [Resolved]
org.eclipse.e4.ui.workbench (0.11.0.v20130125-100758) "Eclipse e4 Workbench" [Active]
org.eclipse.e4.ui.workbench.addons.swt (0.10.3.v20130124-185622) "Eclipse e4 Workbench Add-ons" [Active]
org.eclipse.e4.ui.workbench.renderers.swt (0.10.3.v20130124-170312) "Eclipse e4 Workbench SWT Renderer" [Active]
org.eclipse.e4.ui.workbench.swt (0.10.3.v20130124-133900) "Eclipse e4 Workbench SWT" [Active]
org.eclipse.e4.ui.workbench3 (0.12.0.v20120521-2329) "Bundle for Workbench APIs available in e4" [Resolved]
org.eclipse.ecf (3.1.300.v20120610-1946) "ECF Core API" [Starting]
org.eclipse.ecf.filetransfer (5.0.0.v20120610-1946) "ECF Filetransfer API" [Starting]
org.eclipse.ecf.identity (3.1.200.v20120610-1946) "ECF Core Identity API" [Starting]
org.eclipse.ecf.provider.filetransfer (3.2.0.v20120610-1946) "ECF Filetransfer Provider" [Starting]
org.eclipse.ecf.provider.filetransfer.httpclient (4.0.200.v20120610-1946) "ECF HttpClient Filetransfer Provider" [Starting]
org.eclipse.ecf.provider.filetransfer.httpclient.ssl (1.0.0.v20120610-1946) "ECF HttpClient Filetransfer Provider" [Resolved]
org.eclipse.ecf.provider.filetransfer.ssl (1.0.0.v20120610-1946) "ECF Filetransfer Provider" [Resolved]
org.eclipse.ecf.ssl (1.0.100.v20120610-1946) "ECF Core API" [Resolved]
org.eclipse.egit (2.2.0.201212191850-r) "Git Team Provider" [Starting]
org.eclipse.egit.core (2.2.0.201212191850-r) "Git Team Provider Core" [Active]
org.eclipse.egit.doc (2.2.0.201212191850-r) "Git Team Provider Documentation" [Resolved]
org.eclipse.egit.mylyn.ui (2.2.0.201212191850-r) "EGit Mylyn UI" [Starting]
org.eclipse.egit.ui (2.2.0.201212191850-r) "Git Team Provider UI" [Active]
org.eclipse.emf (2.6.0.v20130125-0826) "EMF - Eclipse Modeling Framework Runtime and Tools" [Starting]
org.eclipse.emf.ant (2.7.0.v20130125-0826) "EMF Ant Tasks" [Starting]
org.eclipse.emf.codegen (2.8.0.v20130125-0826) "EMF Code Generation" [Starting]
org.eclipse.emf.codegen.ecore (2.8.2.v20130125-0826) "EMF Ecore Code Generator" [Starting]
org.eclipse.emf.codegen.ecore.ui (2.8.0.v20130125-0826) "EMF Ecore Code Generator UI" [Starting]
org.eclipse.emf.codegen.ui (2.6.0.v20130125-0826) "EMF Code Generation UI" [Starting]
org.eclipse.emf.common (2.8.0.v20130125-0546) "EMF Common" [Active]
org.eclipse.emf.common.ui (2.7.0.v20130125-0826) "EMF Common UI" [Starting]
org.eclipse.emf.converter (2.5.0.v20130125-0826) "EMF Model Converter" [Starting]
org.eclipse.emf.databinding (1.2.0.v20130125-0826) "EMF Data Binding" [Starting]
org.eclipse.emf.databinding.edit (1.2.1.v20130125-0826) "EMF Edit Data Binding" [Starting]
org.eclipse.emf.ecore (2.8.3.v20130125-0546) "EMF Ecore" [Active]
org.eclipse.emf.ecore.change (2.8.0.v20130125-0546) "EMF Change Model" [Starting]
org.eclipse.emf.ecore.change.edit (2.5.0.v20130125-0826) "EMF Change Edit" [Starting]
org.eclipse.emf.ecore.edit (2.8.0.v20130125-0826) "EMF Ecore Edit" [Starting]
org.eclipse.emf.ecore.editor (2.8.0.v20130125-0826) "EMF Sample Ecore Editor" [Starting]
org.eclipse.emf.ecore.xmi (2.8.1.v20130125-0546) "EMF XML/XMI Persistence" [Active]
org.eclipse.emf.edit (2.8.0.v20130125-0826) "EMF Edit" [Starting]
org.eclipse.emf.edit.ui (2.8.0.v20130125-0826) "EMF Edit UI" [Starting]
org.eclipse.emf.exporter (2.6.0.v20130125-0826) "EMF Model Exporter" [Starting]
org.eclipse.emf.importer (2.7.0.v20130125-0826) "EMF Model Importer" [Starting]
org.eclipse.emf.importer.ecore (2.6.0.v20130125-0826) "EMF Ecore Importer" [Starting]
org.eclipse.emf.importer.java (2.6.0.v20130125-0826) "EMF Annotated Java Importer" [Starting]
org.eclipse.emf.importer.rose (2.6.0.v20130125-0826) "EMF Rose Importer" [Starting]
org.eclipse.emf.mapping (2.7.0.v20130125-0826) "EMF Mapping" [Starting]
org.eclipse.emf.mapping.ecore (2.6.0.v20130125-0826) "EMF Ecore Mapping" [Starting]
org.eclipse.emf.mapping.ecore.editor (2.6.0.v20130125-0826) "EMF Ecore Mapping Editor" [Starting]
org.eclipse.emf.mapping.ecore2ecore (2.7.0.v20130125-0826) "EMF Ecore to Ecore Mapping" [Starting]
org.eclipse.emf.mapping.ecore2ecore.editor (2.5.0.v20130125-0826) "EMF Ecore to Ecore Mapping Editor" [Starting]
org.eclipse.emf.mapping.ecore2xml (2.7.0.v20130125-0826) "EMF Ecore to XML Mapping" [Starting]
org.eclipse.emf.mapping.ecore2xml.ui (2.6.0.v20130125-0826) "EMF Ecore to XML Mapping Editor" [Starting]
org.eclipse.emf.mapping.ui (2.6.0.v20130125-0826) "EMF Mapping UI" [Starting]
org.eclipse.epp.mpc.core (1.1.1.I20110907-0947) "Marketplace Client" [Starting]
org.eclipse.epp.mpc.help.ui (1.1.1.I20110907-0947) "Marketplace Client" [Resolved]
org.eclipse.epp.mpc.ui (1.1.1.I20110907-0947) "Marketplace Client" [Active]
org.eclipse.epp.package.jee (1.5.2.20130110-1126) "Java EE IDE" [Resolved]
org.eclipse.equinox.app (1.3.100.v20120522-1841) "Equinox Application Container" [Active]
org.eclipse.equinox.bidi (0.9.100.v20121107-021609) "Bidirectional Text Support" [Starting]
org.eclipse.equinox.common (3.6.100.v20120522-1841) "Common Eclipse Runtime" [Active]
org.eclipse.equinox.concurrent (1.0.300.v20120912-130548) "Equinox Concurrent API" [Starting]
org.eclipse.equinox.console (1.0.0.v20120522-1841) "Console plug-in" [Active]
org.eclipse.equinox.ds (1.4.1.v20120926-201320) "Declarative Services" [Active]
org.eclipse.equinox.event (1.2.200.v20120522-2049) "Event Admin" [Active]
org.eclipse.equinox.frameworkadmin (2.0.100.v20120913-155515) "Equinox Framework Admin" [Active]
org.eclipse.equinox.frameworkadmin.equinox (1.0.400.v20120913-155709) "Equinox Framework Admin for Equinox" [Starting]
org.eclipse.equinox.http.jetty (3.0.1.v20121109-203239) "Jetty Http Service" [Starting]
org.eclipse.equinox.http.registry (1.1.200.v20120912-130548) "Http Service Registry Extensions" [Resolved]
org.eclipse.equinox.http.servlet (1.1.300.v20120912-130548) "Http Services Servlet" [Starting]
org.eclipse.equinox.jsp.jasper (1.0.400.v20120912-130548) "Jasper Jsp Support Bundle" [Starting]
org.eclipse.equinox.jsp.jasper.registry (1.0.300.v20120912-130548) "Jasper Jsp Registry Support Plug-in" [Starting]
org.eclipse.equinox.launcher (1.3.0.v20120522-1813) "Equinox Launcher" [Resolved]
org.eclipse.equinox.launcher.gtk.linux.x86_64 (1.1.200.v20120913-144807) "Equinox Launcher Linux X86_64 Fragment" [Resolved]
org.eclipse.equinox.p2.artifact.repository (1.1.200.v20120430-1959) "Equinox Provisioning Artifact Repository Support" [Starting]
org.eclipse.equinox.p2.console (1.0.300.v20120429-0125) "Equinox Provisioning Console" [Starting]
org.eclipse.equinox.p2.core (2.2.0.v20120430-0525) "Equinox Provisioning Core" [Active]
org.eclipse.equinox.p2.director (2.2.0.v20120524-0542) "Equinox Provisioning Director" [Starting]
org.eclipse.equinox.p2.director.app (1.0.300.v20120428-0517) "Equinox Provisioning Director Application" [Starting]
org.eclipse.equinox.p2.directorywatcher (1.0.300.v20110808-1657) "Equinox Provisioning Directory Watcher" [Active]
org.eclipse.equinox.p2.discovery (1.0.200.v20120913-155635) "Equinox Provisioning Discovery" [Resolved]
org.eclipse.equinox.p2.discovery.compatibility (1.0.101.v20120913-155635) "Equinox Provisioning Discovery" [Starting]
org.eclipse.equinox.p2.engine (2.2.0.v20130121-021919) "Equinox Provisioning Engine" [Active]
org.eclipse.equinox.p2.extensionlocation (1.2.100.v20110808-1657) "Equinox Provisioning Extension Location Repository Support" [Starting]
org.eclipse.equinox.p2.garbagecollector (1.0.200.v20110808-1657) "Equinox Provisioning Garbage Collector" [Active]
org.eclipse.equinox.p2.jarprocessor (1.0.200.v20110808-1657) "Equinox Provisioning JAR Processor" [Resolved]
org.eclipse.equinox.p2.metadata (2.1.0.v20120430-2001) "Equinox Provisioning Metadata" [Active]
org.eclipse.equinox.p2.metadata.repository (1.2.100.v20120524-1717) "Equinox Provisioning Metadata Repository" [Active]
org.eclipse.equinox.p2.operations (2.2.0.v20130119-010614) "Equinox Provisioning Operations API" [Active]
org.eclipse.equinox.p2.publisher (1.2.0.v20121002-080415) "Equinox Provisioning Publisher Infrastructure" [Starting]
org.eclipse.equinox.p2.publisher.eclipse (1.1.0.v20120913-155635) "Equinox Provisioning Publisher for Eclipse" [Starting]
org.eclipse.equinox.p2.ql (2.0.100.v20110808-1657) "Equinox Provisioning p2 query language" [Starting]
org.eclipse.equinox.p2.reconciler.dropins (1.1.200.v20120301-2145) "Equinox Provisioning Drop-in" [Active]
org.eclipse.equinox.p2.repository (2.2.0.v20120524-1945) "Equinox Provisioning Repository" [Active]
org.eclipse.equinox.p2.repository.tools (2.0.100.v20120501-1314) "Equinox Provisioning Repository Tools" [Starting]
org.eclipse.equinox.p2.touchpoint.eclipse (2.1.100.v20120428-0117) "Equinox Provisioning Eclipse Touchpoint" [Starting]
org.eclipse.equinox.p2.touchpoint.natives (1.1.0.v20130121-021919) "Equinox Provisioning Native Touchpoint" [Starting]
org.eclipse.equinox.p2.transport.ecf (1.0.100.v20120913-155635) "Equinox Provisioning ECF based Transport" [Starting]
org.eclipse.equinox.p2.ui (2.2.0.v20130119-010614) "Equinox Provisioning UI Support" [Active]
org.eclipse.equinox.p2.ui.discovery (1.0.0.v20120913-155635) "Equinox Provisioning Discovery UI" [Resolved]
org.eclipse.equinox.p2.ui.importexport (1.0.1.v20120913-155635) "Equinox Provisioning Import and Export" [Starting]
org.eclipse.equinox.p2.ui.sdk (1.0.200.v20120515-1650) "Equinox Provisioning Platform Update Support" [Active]
org.eclipse.equinox.p2.ui.sdk.scheduler (1.1.0.v20110815-1744) "Equinox Provisioning Platform Automatic Update Support" [Active]
org.eclipse.equinox.p2.updatechecker (1.1.200.v20110808-1657) "Equinox Provisioning Update Checker" [Active]
org.eclipse.equinox.p2.updatesite (1.0.400.v20120412-1615) "Equinox Provisioning Legacy Update Site Support" [Starting]
org.eclipse.equinox.preferences (3.5.1.v20121031-182809) "Eclipse Preferences Mechanism" [Active]
org.eclipse.equinox.registry (3.5.200.v20120522-1841) "Extension Registry Support" [Active]
org.eclipse.equinox.security (1.1.100.v20120522-1841) "Equinox Java Authentication and Authorization Service (JAAS)" [Active]
org.eclipse.equinox.security.ui (1.1.100.v20120522-2049) "Equinox Security Default UI" [Starting]
org.eclipse.equinox.simpleconfigurator (1.0.301.v20120914-163612) "Simple Configurator" [Active]
org.eclipse.equinox.simpleconfigurator.manipulator (2.0.0.v20110808-1657) "Simple Configurator Manipulator" [Active]
org.eclipse.equinox.util (1.0.400.v20120917-192807) "Equinox Util Bundle" [Active]
org.eclipse.gef (3.9.0.201212170307) "Graphical Editing Framework GEF" [Starting]
org.eclipse.help (3.6.0.v20120912-134126) "Help System Core" [Active]
org.eclipse.help.base (3.6.101.v201302041200) "Help System Base" [Starting]
org.eclipse.help.ui (3.5.201.v20130108-092756) "Help System UI" [Starting]
org.eclipse.help.webapp (3.6.101.v20130116-182509) "Help System Webapp" [Starting]
org.eclipse.jdt (3.8.1.v201302041200) "Eclipse Java Development Tools" [Resolved]
org.eclipse.jdt.annotation (1.0.1.v20130111-135246) "JDT Annotations for Enhanced Null Analysis" [Resolved]
org.eclipse.jdt.apt.core (3.3.500.v20120522-1651) "Java Annotation Processing Core" [Active]
org.eclipse.jdt.apt.pluggable.core (1.0.400.v20120522-1651) "Java Compiler Apt IDE" [Starting]
org.eclipse.jdt.apt.ui (3.3.300.v20120522-1651) "Java Annotation Processing UI" [Starting]
org.eclipse.jdt.compiler.apt (1.0.600.v20130116-050536) "Java Compiler Apt" [Resolved]
org.eclipse.jdt.compiler.tool (1.0.200.v20130116-050536) "Java Compiler Tool Support" [Resolved]
org.eclipse.jdt.core (3.8.3.v20130121-145325) "Java Development Tools Core" [Active]
org.eclipse.jdt.core.manipulation (1.5.0.v20120523-1543) "Java Code Manipulation Functionality" [Active]
org.eclipse.jdt.debug (3.7.101.v20120913-153601) "JDI Debug Model" [Active]
org.eclipse.jdt.debug.ui (3.6.100.v20120530-1425) "JDI Debug UI" [Active]
org.eclipse.jdt.doc.user (3.8.2.v20130121-200410) "Eclipse Java development user guide" [Resolved]
org.eclipse.jdt.junit (3.7.100.v20120523-1543) "Java Development Tools JUnit support" [Active]
org.eclipse.jdt.junit.core (3.7.100.v20120523-1257) "Java Development Tools JUnit core support" [Starting]
org.eclipse.jdt.junit.runtime (3.4.301.v20120914-131016) "Java Development Tools JUnit Runtime Support" [Resolved]
org.eclipse.jdt.junit4.runtime (1.1.200.v20120523-1257) "Java Development Tools JUnit4 Runtime Support" [Resolved]
org.eclipse.jdt.launching (3.6.101.v20130111-183046) "Java Development Tools Launching Support" [Active]
org.eclipse.jdt.ui (3.8.2.v20130107-165834) "Java Development Tools UI" [Active]
org.eclipse.jem (2.0.600.v201201051400) "Java EMF Model" [Active]
org.eclipse.jem.beaninfo (2.0.300.v200905030615) "Java EMF Model BeanInfo (Introspection) Support" [Starting]
org.eclipse.jem.beaninfo.vm (2.0.300.v201004110600) "JEM Beaninfo VM Jar" [Resolved]
org.eclipse.jem.beaninfo.vm.common (2.0.300.v201004110600) "JEM Beaninfo Common Jar" [Resolved]
org.eclipse.jem.proxy (2.0.400.v201101101900) "Java EMF Model Proxy Support" [Starting]
org.eclipse.jem.util (2.1.100.v201103021400) "Java EMF Model Utilities" [Active]
org.eclipse.jem.workbench (2.0.400.v201104251400) "Java EMF Model Workbench Support" [Starting]
org.eclipse.jetty.continuation (8.1.3.v20120522) "Jetty :: Continuation" [Resolved]
org.eclipse.jetty.http (8.1.3.v20120522) "Jetty :: Http Utility" [Resolved]
org.eclipse.jetty.io (8.1.3.v20120522) "Jetty :: IO Utility" [Resolved]
org.eclipse.jetty.security (8.1.3.v20120522) "Jetty :: Security" [Resolved]
org.eclipse.jetty.server (8.1.3.v20120522) "Jetty :: Server Core" [Resolved]
org.eclipse.jetty.servlet (8.1.3.v20120522) "Jetty :: Servlet Handling" [Resolved]
org.eclipse.jetty.util (8.1.3.v20120522) "Jetty :: Utilities" [Resolved]
org.eclipse.jetty.webapp (8.1.3.v20120522) "Jetty :: Webapp Application Support" [Resolved]
org.eclipse.jetty.xml (8.1.3.v20120522) "Jetty :: XML utilities" [Resolved]
org.eclipse.jface (3.8.102.v20130123-162658) "JFace" [Active]
org.eclipse.jface.databinding (1.6.0.v20120912-132807) "JFace Data Binding for SWT and JFace" [Resolved]
org.eclipse.jface.text (3.8.2.v20121126-164145) "JFace Text" [Resolved]
org.eclipse.jgit (2.2.0.201212191850-r) "JGit Core" [Active]
org.eclipse.jpt.common.branding (1.2.1.v201208222210) "Dali Java Persistence Tools - Common" [Resolved]
org.eclipse.jpt.common.core (1.2.2.v201301082148) "Dali Java Persistence Tools - Common Core" [Starting]
org.eclipse.jpt.common.eclipselink.branding (1.2.1.v201208222210) "Dali Java Persistence Tools - EclipseLink Common" [Resolved]
org.eclipse.jpt.common.eclipselink.core (1.2.1.v201208222210) "Dali Java Persistence Tools - Common EclipseLink Core" [Starting]
org.eclipse.jpt.common.ui (1.2.1.v201208222210) "Dali Java Persistence Tools - Common UI" [Starting]
org.eclipse.jpt.common.utility (2.1.1.v201208222210) "Dali Java Persistence Tools - Common Utility" [Resolved]
org.eclipse.jpt.dbws.eclipselink.branding (1.1.101.v201208222210) "Dali Java Persistence Tools - EclipseLink DBWS Support" [Resolved]
org.eclipse.jpt.dbws.eclipselink.core.gen (1.0.1.v201208222210) "Dali Java Persistence Tools - DBWS Support - Web Services Generation" [Resolved]
org.eclipse.jpt.dbws.eclipselink.ui (1.0.201.v201208222210) "Dali Java Persistence Tools - DBWS UI" [Starting]
org.eclipse.jpt.doc.user (1.4.2.v201205290002) "Dali Java Persistence Tools - Documentation" [Resolved]
org.eclipse.jpt.jaxb.branding (1.2.1.v201208222210) "Dali Java Persistence Tools - JAXB Support" [Resolved]
org.eclipse.jpt.jaxb.core (1.2.2.v201301082148) "Dali Java Persistence Tools - JAXB Core" [Starting]
org.eclipse.jpt.jaxb.core.schemagen (1.0.201.v201208222210) "Dali Java Persistence Tools - JAXB Support - Schema Generation" [Resolved]
org.eclipse.jpt.jaxb.eclipselink.branding (1.2.1.v201208222210) "Dali Java Persistence Tools - EclipseLink MOXy (JAXB) Support" [Resolved]
org.eclipse.jpt.jaxb.eclipselink.core (1.2.1.v201208222210) "Dali Java Persistence Tools - EclipseLink JAXB Support - Core" [Starting]
org.eclipse.jpt.jaxb.eclipselink.core.schemagen (1.1.1.v201208222210) "Dali Java Persistence Tools - EclipseLink JAXB Support - Schema Generation" [Resolved]
org.eclipse.jpt.jaxb.eclipselink.ui (1.3.1.v201208222210) "Dali Java Persistence Tools - EclipseLink MOXy Support - UI" [Starting]
org.eclipse.jpt.jaxb.ui (1.3.1.v201208222210) "Dali Java Persistence Tools - JAXB UI" [Starting]
org.eclipse.jpt.jpa.branding (3.2.1.v201208222210) "Dali Java Persistence Tools - JPA Support" [Resolved]
org.eclipse.jpt.jpa.core (3.2.2.v201301092252) "Dali Java Persistence Tools - Jpa Core" [Starting]
org.eclipse.jpt.jpa.db (2.1.101.v201208222210) "Dali Java Persistence Tools - JPA DB" [Starting]
org.eclipse.jpt.jpa.db.ui (2.0.1.v201208222210) "Dali Java Persistence Tools - JPA DB UI" [Resolved]
org.eclipse.jpt.jpa.eclipselink.branding (3.2.1.v201208222210) "Dali Java Persistence Tools - EclipseLink JPA Support" [Resolved]
org.eclipse.jpt.jpa.eclipselink.core (2.2.1.v201208222210) "Dali Java Persistence Tools - JPA EclipseLink Support - Core" [Starting]
org.eclipse.jpt.jpa.eclipselink.core.ddlgen (2.1.1.v201208222210) "Dali Java Persistence Tools - Jpa EclipseLink Support - DDL Generation" [Resolved]
org.eclipse.jpt.jpa.eclipselink.ui (2.2.1.v201208222210) "Dali Java Persistence Tools - EclipseLink Support - UI" [Starting]
org.eclipse.jpt.jpa.gen (2.2.2.v201301082148) "Dali Java Persistence Tools - Entity Gen" [Resolved]
org.eclipse.jpt.jpa.ui (3.2.2.v201301092252) "Dali Java Persistence Tools - JPA UI" [Starting]
org.eclipse.jsch.core (1.1.400.v20120522-1148) "JSch Core" [Active]
org.eclipse.jsch.ui (1.1.400.v20120522-1148) "JSch UI" [Starting]
org.eclipse.jsf.branding (3.3.0.v201301161500) "JavaServer Faces Tools" [Resolved]
org.eclipse.jst.common.annotations.controller (1.1.300.v200908252030) "Annotation Controller Plug-in" [Resolved]
org.eclipse.jst.common.annotations.core (1.1.300.v201004141630) "Annotation Core Plug-in" [Resolved]
org.eclipse.jst.common.annotations.ui (1.1.300.v201002081900) "Annotations UI Plug-in" [Starting]
org.eclipse.jst.common.frameworks (1.1.601.v201208160700) "Integration Plug-in" [Starting]
org.eclipse.jst.common.project.facet.core (1.4.201.v201108161900) "Eclipse Faceted Project Framework JDT Enablement" [Active]
org.eclipse.jst.common.project.facet.ui (1.4.200.v201008182133) "Eclipse Faceted Project Framework JDT Enablement UI" [Starting]
org.eclipse.jst.common.ui (1.0.201.v201208292200) "Common JST UI Plug-in" [Starting]
org.eclipse.jst.ejb.doc.user (1.1.301.v201105130956) "EJB docs" [Starting]
org.eclipse.jst.ejb.ui (1.1.700.v201201190500) "WTP EJB UI Plug-in" [Starting]
org.eclipse.jst.ejb.ui.infopop (1.0.300.v2010022311013) "EJB infopop" [Starting]
org.eclipse.jst.j2ee (1.1.603.v201301092200) "Java EE Component" [Active]
org.eclipse.jst.j2ee.core (1.2.200.v201205030130) "J2EE Core Component" [Active]
org.eclipse.jst.j2ee.doc.user (1.1.400.v201008122303) "J2EE tools documentation" [Resolved]
org.eclipse.jst.j2ee.ejb (1.1.601.v201210040812) "EJB component Plug-in" [Starting]
org.eclipse.jst.j2ee.ejb.annotation.model (1.1.300.v201003112036) "EJB Annotation Model Plug-in" [Starting]
org.eclipse.jst.j2ee.ejb.annotations.emitter (1.1.200.v200909290826) "EJB Emitter Plug-in" [Starting]
org.eclipse.jst.j2ee.ejb.annotations.ui (1.1.200.v201004290730) "EJB Annotations Ui Plug-in" [Starting]
org.eclipse.jst.j2ee.ejb.annotations.xdoclet (1.2.200.v201103302125) "Xdoclet Annotations Plug-in" [Starting]
org.eclipse.jst.j2ee.infopop (1.0.300.v200805140415) "J2EE tools infopops" [Resolved]
org.eclipse.jst.j2ee.jca (1.1.600.v201111012200) "JCA Plug-in" [Starting]
org.eclipse.jst.j2ee.jca.ui (1.1.400.v201004150700) "WTP JCA UI Plug-in" [Starting]
org.eclipse.jst.j2ee.navigator.ui (1.1.600.v201203142300) "J2EE Extensions to Common Navigator" [Starting]
org.eclipse.jst.j2ee.ui (1.1.600.v201205170400) "WTP J2EE UI Plug-in" [Starting]
org.eclipse.jst.j2ee.web (1.1.601.v201212130700) "Web Plug-in" [Starting]
org.eclipse.jst.j2ee.webservice (1.1.400.v201004110600) "Web Service Plug-in" [Starting]
org.eclipse.jst.j2ee.webservice.ui (1.1.500.v201105122000) "WTP Webservice UI Plug-in" [Starting]
org.eclipse.jst.j2ee.xdoclet.runtime (1.1.300.v201004280700) "XDocletRuntime Plug-in" [Starting]
org.eclipse.jst.jee (1.0.501.v201301091334) "Java EE common Plug-in" [Starting]
org.eclipse.jst.jee.ejb (1.0.301.v201007070821) "Java EE Ejb Plug-in" [Starting]
org.eclipse.jst.jee.ui (1.0.500.v201205170400) "Eclipse Java EE Developer Tools" [Starting]
org.eclipse.jst.jee.web (1.0.301.v201007070907) "Java EE Web Plug-in" [Starting]
org.eclipse.jst.jsf.apache.trinidad.tagsupport (1.2.0.v201301161500) "JavaServer Faces Tools - Taglibrary Metadata (Apache Trinidad)" [Starting]
org.eclipse.jst.jsf.common (1.3.0.v201301161500) "JavaServer Faces Tools - Common" [Starting]
org.eclipse.jst.jsf.common.runtime (1.2.0.v201301161500) "JavaServer Faces Tools - Common Runtime" [Starting]
org.eclipse.jst.jsf.common.ui (1.3.0.v201301161500) "JavaServer Faces Tools - Common UI" [Starting]
org.eclipse.jst.jsf.core (1.5.0.v201301161500) "JavaServer Faces Tools - Core" [Starting]
org.eclipse.jst.jsf.doc.user (1.3.0.v201211081916) "JavaServer Faces Tools - User Guide" [Starting]
org.eclipse.jst.jsf.facelet.core (1.1.0.v201301161500) "JSF Facelets Tools - WTP Incubator Project" [Starting]
org.eclipse.jst.jsf.facelet.ui (1.1.0.v201301161500) "UI Plug-in" [Starting]
org.eclipse.jst.jsf.facesconfig (1.3.0.v201301161500) "JavaServer Faces Tools - FacesConfig Model" [Starting]
org.eclipse.jst.jsf.facesconfig.ui (1.3.0.v201301161500) "JavaServer Faces Tools - FacesConfig Editor" [Starting]
org.eclipse.jst.jsf.standard.tagsupport (1.3.0.v201301161500) "JavaServer Faces Tools - Taglibrary Metadata" [Starting]
org.eclipse.jst.jsf.ui (1.4.0.v201301161500) "JavaServer Faces Tools - UI" [Starting]
org.eclipse.jst.jsp.core (1.2.502.v201301101836) "Structured Source JSP Model" [Starting]
org.eclipse.jst.jsp.ui (1.1.702.v201301101836) "SSE JSP Source Editor" [Starting]
org.eclipse.jst.jsp.ui.infopop (1.0.200.v201004150328) "JSP tools infopops" [Resolved]
org.eclipse.jst.pagedesigner (1.4.0.v201301161500) "JavaServer Faces Tools - Web Page Editor" [Starting]
org.eclipse.jst.pagedesigner.jsf.ui (1.3.0.v201301161500) "JavaServer Faces Tools - Pagedesigner UI" [Starting]
org.eclipse.jst.pagedesigner.jsp.core (1.3.0.v201301161500) "JavaServer Faces Tools - JSP Core Pagedesigner" [Starting]
org.eclipse.jst.server.core (1.2.302.v20120503_1042) "Java Server Support" [Starting]
org.eclipse.jst.server.generic.core (1.0.700.v20101219) "Generic Server Plugin" [Starting]
org.eclipse.jst.server.generic.jboss (1.6.1.v200904151730) "JBoss Generic server definitions" [Starting]
org.eclipse.jst.server.generic.jonas (1.5.205.v200805140145) "JOnAS Generic Server definitions" [Starting]
org.eclipse.jst.server.generic.oc4j (1.5.206.v20090812) "OC4J Generic server definitions" [Starting]
org.eclipse.jst.server.generic.ui (1.0.505.v20100428) "Generic Server Plugin UI" [Starting]
org.eclipse.jst.server.preview.adapter (1.1.201.v20130123_1813) "JEE Preview Server Support" [Starting]
org.eclipse.jst.server.tomcat.core (1.1.402.v20130108_1103) "Apache Tomcat Support" [Starting]
org.eclipse.jst.server.tomcat.ui (1.1.300.v20120420_1012) "Apache Tomcat UI Support" [Starting]
org.eclipse.jst.server.ui (1.1.202.v20110419) "Java Server UI Support" [Starting]
org.eclipse.jst.server.ui.doc.user (1.0.500.v201005192218) "Server Tools documentation for J2EE Standard Tools" [Starting]
org.eclipse.jst.server.ui.infopop (1.0.400.v200805140145) "Server Tools infopops for J2EE Standard Tools" [Resolved]
org.eclipse.jst.server.websphere.core (1.0.302.v20080620) "WebSphere Generic Server Definition Core Plug-in" [Starting]
org.eclipse.jst.servlet.ui (1.1.600.v201202011057) "WTP Servlet UI Plug-in" [Starting]
org.eclipse.jst.servlet.ui.infopop (1.0.500.v201105122000) "Servlet infopop" [Starting]
org.eclipse.jst.standard.schemas (1.2.1.v201302050732) "Java EE Related Schemas" [Resolved]
org.eclipse.jst.ws (1.0.600.v201108242234) "Web Services" [Starting]
org.eclipse.jst.ws.annotations.core (1.2.0.v201203272107) "Annotations Core" [Starting]
org.eclipse.jst.ws.axis.consumption.core (1.0.407.v201104071820) "Web service Axis Consumption Core" [Starting]
org.eclipse.jst.ws.axis.consumption.ui (1.0.700.v201204181727) "Webservice Axis Consumption UI" [Starting]
org.eclipse.jst.ws.axis.creation.ui (1.0.750.v201204120428) "Webservice Axis Creation UI" [Starting]
org.eclipse.jst.ws.axis.infopop (1.0.300.v200805140230) "Web services Axis context sensitive help" [Starting]
org.eclipse.jst.ws.axis.ui.doc.user (1.1.100.v201005192217) "Axis Web services documentation" [Resolved]
org.eclipse.jst.ws.axis2.consumption.core (1.0.105.v201004211805) "Webservice Axis2 Consumption Core Plug-in" [Starting]
org.eclipse.jst.ws.axis2.consumption.ui (1.0.103.v201004211805) "Webservice Axis2 Consumption UI Plug-in" [Starting]
org.eclipse.jst.ws.axis2.core (1.0.204.v201004211805) "Webservice Axis2 Core Plug-in" [Starting]
org.eclipse.jst.ws.axis2.creation.core (1.0.106.v201004211805) "Webservice Axis2 Creation Core Plug-in" [Starting]
org.eclipse.jst.ws.axis2.creation.ui (1.0.104.v201004211805) "Webservice Axis2 Creation UI Plug-in" [Starting]
org.eclipse.jst.ws.axis2.ui (1.0.303.v201003110431) "Axis2 Tools" [Starting]
org.eclipse.jst.ws.axis2.ui.doc.user (1.0.100.v201005192217) "Axis2 Web services documentation" [Resolved]
org.eclipse.jst.ws.consumption (1.0.701.v201212112014) "Web Services Consumption" [Starting]
org.eclipse.jst.ws.consumption.infopop (1.0.300.v200805140230) "Web services UI" [Resolved]
org.eclipse.jst.ws.consumption.ui (1.1.600.v201301232254) "Web Services Consumption Graphical User Interface" [Starting]
org.eclipse.jst.ws.consumption.ui.doc.user (1.0.600.v201005192217) "Web service consumption documentation" [Starting]
org.eclipse.jst.ws.creation.ejb.ui (1.0.201.v201004211805) "Web Services Creation EJB Graphical User Interface" [Resolved]
org.eclipse.jst.ws.creation.ui (1.0.700.v201205041550) "Web Services Creation Graphical User Interface" [Starting]
org.eclipse.jst.ws.cxf.consumption.core (1.0.201.v201301072322) "CXF Web Services Consumption Core" [Starting]
org.eclipse.jst.ws.cxf.consumption.ui (1.0.200.v201201312103) "CXF Web Services Consumption UI" [Starting]
org.eclipse.jst.ws.cxf.core (1.1.1.v201301082115) "CXF Web Services Core" [Starting]
org.eclipse.jst.ws.cxf.creation.core (1.0.201.v201301072322) "CXF Web Services Creation Core" [Starting]
org.eclipse.jst.ws.cxf.creation.ui (1.0.201.v201301072322) "CXF Web Services Creation UI" [Starting]
org.eclipse.jst.ws.cxf.doc.user (1.0.201.v201301072322) "CXF Web services User Guide" [Resolved]
org.eclipse.jst.ws.cxf.ui (1.0.200.v201203062228) "CXF Web Services UI" [Starting]
org.eclipse.jst.ws.doc.user (1.0.600.v201005192217) "Web Services UI" [Resolved]
org.eclipse.jst.ws.infopop (1.0.300.v200805140230) "Web services UI" [Resolved]
org.eclipse.jst.ws.jaxb.core (1.0.100.v201104031139) "JAXB Tools Core" [Starting]
org.eclipse.jst.ws.jaxrs.core (1.0.400.v201202152223) "JAX-RS Tools - Core" [Active]
org.eclipse.jst.ws.jaxrs.ui (1.0.500.v201205020140) "JAX-RS Tools - UI" [Starting]
org.eclipse.jst.ws.jaxws.core (1.0.201.v201301072322) "JAX-WS Tools Core" [Starting]
org.eclipse.jst.ws.jaxws.doc.user (1.0.200.v201205231938) "JAX-WS Tools User Guide" [Resolved]
org.eclipse.jst.ws.jaxws.dom.integration (1.0.200.v201109042201) "JAX-WS DOM Integration" [Starting]
org.eclipse.jst.ws.jaxws.dom.runtime (1.0.200.v201109042201) "JAX-WS DOM Runtime" [Resolved]
org.eclipse.jst.ws.jaxws.dom.ui (1.0.0.v201004171919) "JAX-WS DOM UI" [Starting]
org.eclipse.jst.ws.jaxws.ui (1.0.201.v201301072322) "JAX-WS Tools UI" [Active]
org.eclipse.jst.ws.jaxws.utils (1.0.200.v201201032002) "JAX-WS Utils" [Active]
org.eclipse.jst.ws.uddiregistry (1.0.500.v201004211805) "Web Services Universal Description Discovery and Integration Registry" [Starting]
org.eclipse.jst.ws.ui (1.0.403.v201004211805) "Web Services Graphical User Interface" [Starting]
org.eclipse.linuxtools.binutils (4.0.0.201302051708) "Binutils Plug-in" [Starting]
org.eclipse.linuxtools.profiling.docs (1.0.0.201302051708) "Profiling Framework Documentation" [Resolved]
org.eclipse.linuxtools.profiling.launch (1.2.0.201302051708) "Profiling Launch Plug-in" [Starting]
org.eclipse.linuxtools.profiling.launch.ui (0.9.2.201302051708) "Profiling Launch UI Plug-in (Incubation)" [Starting]
org.eclipse.linuxtools.profiling.ui (1.0.0.201302051708) "Profiling UI Plug-in" [Starting]
org.eclipse.linuxtools.tools.launch.core (1.1.0.201302051708) "Tools Launcher Core" [Starting]
org.eclipse.linuxtools.valgrind.cachegrind (1.0.0.201302051708) "Cachegrind Plug-in" [Starting]
org.eclipse.linuxtools.valgrind.core (1.0.0.201302051708) "Valgrind Core Plug-in" [Starting]
org.eclipse.linuxtools.valgrind.doc (1.0.0.201302051708) "Valgrind Documentation" [Starting]
org.eclipse.linuxtools.valgrind.helgrind (1.1.0.201302051708) "Helgrind Plug-in" [Starting]
org.eclipse.linuxtools.valgrind.launch (1.2.0.201302051708) "Valgrind Launch Plug-in" [Starting]
org.eclipse.linuxtools.valgrind.massif (1.1.0.201302051708) "Massif Plug-in" [Starting]
org.eclipse.linuxtools.valgrind.memcheck (1.1.0.201302051708) "Memcheck Plug-in" [Starting]
org.eclipse.linuxtools.valgrind.ui (1.0.0.201302051708) "Valgrind UI Plug-in" [Starting]
org.eclipse.linuxtools.valgrind.ui.editor (1.0.0.201302051708) "Valgrind Editor" [Starting]
org.eclipse.ltk.core.refactoring (3.6.0.v20120523-1543) "Refactoring Core" [Active]
org.eclipse.ltk.ui.refactoring (3.7.0.v20120523-1543) "Refactoring UI" [Active]
org.eclipse.mylyn.bugzilla.core (3.8.3.v20130107-0100) "Mylyn Bugzilla Connector Core" [Active]
org.eclipse.mylyn.bugzilla.ide (3.8.3.v20130107-0100) "Mylyn Bugzilla IDE Extensions" [Resolved]
org.eclipse.mylyn.bugzilla.ui (3.8.3.v20130107-0100) "Mylyn Bugzilla Connector UI" [Active]
org.eclipse.mylyn.commons.core (3.8.3.v20130107-0100) "Mylyn Commons" [Active]
org.eclipse.mylyn.commons.identity (0.9.1.v20120412-0100) "Mylyn Commons" [Starting]
org.eclipse.mylyn.commons.identity.core (1.0.3.v20130107-0100) "Mylyn SCM Framework" [Starting]
org.eclipse.mylyn.commons.net (3.8.3.v20130107-0100) "Mylyn Commons Net" [Active]
org.eclipse.mylyn.commons.notifications (0.9.1.v20120412-0100) "Mylyn Commons" [Starting]
org.eclipse.mylyn.commons.notifications.core (1.0.3.v20130107-0100) "Mylyn Commons" [Active]
org.eclipse.mylyn.commons.notifications.feed (1.0.3.v20130107-0100) "Mylyn Commons" [Active]
org.eclipse.mylyn.commons.notifications.ui (1.0.3.v20130107-0100) "Mylyn Commons" [Starting]
org.eclipse.mylyn.commons.repositories (0.9.1.v20120412-0100) "Mylyn Commons" [Resolved]
org.eclipse.mylyn.commons.repositories.core (1.0.3.v20130107-0100) "Mylyn Commons" [Resolved]
org.eclipse.mylyn.commons.repositories.ui (1.0.3.v20130107-0100) "Mylyn Commons" [Starting]
org.eclipse.mylyn.commons.screenshots (3.8.3.v20130107-0100) "Mylyn Commons" [Resolved]
org.eclipse.mylyn.commons.team (0.9.1.v20120412-0100) "Mylyn Commons" [Starting]
org.eclipse.mylyn.commons.ui (3.8.3.v20130107-0100) "Mylyn Commons UI" [Active]
org.eclipse.mylyn.commons.workbench (3.8.3.v20130107-0100) "Mylyn Commons UI" [Active]
org.eclipse.mylyn.commons.xmlrpc (3.8.3.v20130107-0100) "Mylyn XML-RPC Support" [Starting]
org.eclipse.mylyn.context.core (3.8.3.v20130107-0100) "Mylyn Context" [Active]
org.eclipse.mylyn.context.tasks.ui (3.8.3.v20130107-0100) "Mylyn Context Tasks UI" [Active]
org.eclipse.mylyn.context.ui (3.8.3.v20130107-0100) "Mylyn Context UI" [Active]
org.eclipse.mylyn.discovery.core (3.8.3.v20130107-0100) "Mylyn Connector Discovery Core" [Resolved]
org.eclipse.mylyn.discovery.ui (3.8.3.v20130107-0100) "Mylyn Connector Discovery UI" [Resolved]
org.eclipse.mylyn.help.ui (3.8.3.v20130107-0100) "Mylyn Help" [Starting]
org.eclipse.mylyn.ide.ant (3.8.3.v20130107-0100) "Mylyn Ant Bridge" [Starting]
org.eclipse.mylyn.ide.ui (3.8.3.v20130107-0100) "Mylyn IDE UI" [Active]
org.eclipse.mylyn.java.tasks (3.8.3.v20130107-0100) "Mylyn Java Tasks" [Active]
org.eclipse.mylyn.java.ui (3.8.3.v20130107-0100) "Mylyn Java Bridge" [Active]
org.eclipse.mylyn.monitor.core (3.8.3.v20130107-0100) "Mylyn Monitor Core" [Resolved]
org.eclipse.mylyn.monitor.ui (3.8.3.v20130107-0100) "Mylyn Monitor UI" [Active]
org.eclipse.mylyn.resources.ui (3.8.3.v20130107-0100) "Mylyn Resources UI" [Starting]
org.eclipse.mylyn.tasks.bugs (3.8.3.v20130107-0100) "Mylyn Bug Reporting" [Starting]
org.eclipse.mylyn.tasks.core (3.8.3.v20130107-0100) "Mylyn Tasks" [Resolved]
org.eclipse.mylyn.tasks.index.core (3.8.3.v20130107-0100) "Mylyn Tasks Index" [Starting]
org.eclipse.mylyn.tasks.index.ui (3.8.3.v20130107-0100) "Mylyn Tasks Index" [Resolved]
org.eclipse.mylyn.tasks.search (3.8.3.v20130107-0100) "Mylyn Tasks UI" [Resolved]
org.eclipse.mylyn.tasks.ui (3.8.3.v20130107-0100) "Mylyn Tasks UI" [Active]
org.eclipse.mylyn.team.cvs (3.8.3.v20130107-0100) "Mylyn CVS Extensions" [Resolved]
org.eclipse.mylyn.team.ui (3.8.3.v20130107-0100) "Mylyn Team UI" [Active]
org.eclipse.mylyn.wikitext.confluence.core (1.7.3.v20130107-0100) "Mylyn WikiText Confluence" [Resolved]
org.eclipse.mylyn.wikitext.confluence.ui (1.7.3.v20130107-0100) "Mylyn WikiText Confluence UI" [Resolved]
org.eclipse.mylyn.wikitext.core (1.7.3.v20130107-0100) "Mylyn WikiText" [Starting]
org.eclipse.mylyn.wikitext.help.ui (1.7.3.v20130107-0100) "Mylyn WikiText Help UI" [Resolved]
org.eclipse.mylyn.wikitext.mediawiki.core (1.7.3.v20130107-0100) "Mylyn WikiText MediaWiki" [Resolved]
org.eclipse.mylyn.wikitext.mediawiki.ui (1.7.3.v20130107-0100) "Mylyn WikiText MediaWiki UI" [Resolved]
org.eclipse.mylyn.wikitext.tasks.ui (1.7.3.v20130107-0100) "Mylyn WikiText Tasks UI" [Starting]
org.eclipse.mylyn.wikitext.textile.core (1.7.3.v20130107-0100) "Mylyn WikiText Textile" [Resolved]
org.eclipse.mylyn.wikitext.textile.ui (1.7.3.v20130107-0100) "Mylyn WikiText Textile UI" [Resolved]
org.eclipse.mylyn.wikitext.tracwiki.core (1.7.3.v20130107-0100) "Mylyn WikiText TracWiki" [Resolved]
org.eclipse.mylyn.wikitext.tracwiki.ui (1.7.3.v20130107-0100) "Mylyn WikiText TracWiki UI" [Resolved]
org.eclipse.mylyn.wikitext.twiki.core (1.7.3.v20130107-0100) "Mylyn WikiText Twiki" [Resolved]
org.eclipse.mylyn.wikitext.twiki.ui (1.7.3.v20130107-0100) "Mylyn WikiText Twiki UI" [Resolved]
org.eclipse.mylyn.wikitext.ui (1.7.3.v20130107-0100) "Mylyn WikiText UI" [Starting]
org.eclipse.osgi (3.8.2.v20130124-134944) "OSGi System Bundle" [Active]
org.eclipse.osgi.services (3.3.100.v20120522-1822) "OSGi Release 4.2.0 Services" [Resolved]
org.eclipse.osgi.util (3.2.300.v20120913-144807) "OSGi Release 4.2.0 Utility Classes" [Resolved]
org.eclipse.pde (3.8.0.v201302041200) "PDE" [Active]
org.eclipse.pde.api.tools (1.0.400.v20120523-2012) "API Tools" [Active]
org.eclipse.pde.api.tools.ui (1.0.400.v20120523-2012) "API Tools UI" [Active]
org.eclipse.pde.build (3.8.2.v20121114-140810) "Plug-in Development Environment Build Support" [Starting]
org.eclipse.pde.core (3.8.1.v20130115-200504) "PDE Core" [Active]
org.eclipse.pde.doc.user (3.8.2.v20130121-200410) "PDE User Guide" [Resolved]
org.eclipse.pde.ds.core (1.0.200.v20120530-1435) "PDE DS Core" [Starting]
org.eclipse.pde.ds.ui (1.0.200.v20120530-1435) "PDE DS UI" [Starting]
org.eclipse.pde.junit.runtime (3.4.200.v20120530-1435) "PDE JUnit Runtime Support" [Resolved]
org.eclipse.pde.launching (3.6.100.v20120605-203027) "PDE Launching Support" [Active]
org.eclipse.pde.runtime (3.4.300.v20120523-1453) "PDE Runtime" [Starting]
org.eclipse.pde.ua.core (1.0.200.v20120530-1435) "PDE UA Core" [Starting]
org.eclipse.pde.ua.ui (1.0.200.v20120523-1453) "PDE UA UI" [Starting]
org.eclipse.pde.ui (3.7.2.v20130121-093123) "PDE UI" [Active]
org.eclipse.pde.ui.templates (3.4.500.v20120523-2012) "PDE Templates" [Starting]
org.eclipse.persistence.antlr (3.2.0.v201206041011) "EclipseLink ANTLR" [Resolved]
org.eclipse.persistence.asm (3.3.1.v201206041142) "EclipseLink ASM" [Resolved]
org.eclipse.persistence.core (2.4.2.v20121206-a9d0e8d) "EclipseLink Core" [Resolved]
org.eclipse.persistence.dbws (2.4.2.v20121206-a9d0e8d) "EclipseLink DBWS" [Resolved]
org.eclipse.persistence.dbws.builder (2.4.2.v20121206-a9d0e8d) "EclipseLink DBWS Builder" [Resolved]
org.eclipse.persistence.jpa (2.4.2.v20121206-a9d0e8d) "EclipseLink JPA" [Resolved]
org.eclipse.persistence.jpa.jpql (2.0.1.v20121206-a9d0e8d) "EclipseLink Hermes Parser" [Resolved]
org.eclipse.persistence.moxy (2.4.2.v20121206-a9d0e8d) "EclipseLink MOXy" [Resolved]
org.eclipse.platform (4.2.2.v201302041200) "Eclipse Platform" [Resolved]
org.eclipse.platform.doc.user (4.2.2.v20130121-200410) "Eclipse Workbench User Guide" [Resolved]
org.eclipse.rcp (4.2.1.v201302041200) "Eclipse RCP" [Starting]
org.eclipse.rse (3.4.0.201205061956) "Remote System Explorer End-User Runtime" [Resolved]
org.eclipse.rse.connectorservice.dstore (3.1.301.201209211856) "RSE DStore Connector Service" [Starting]
org.eclipse.rse.connectorservice.local (2.1.400.201205062159) "RSE Local Connector Service" [Active]
org.eclipse.rse.connectorservice.ssh (2.1.300.201205062159) "RSE SSH Connector Service" [Starting]
org.eclipse.rse.connectorservice.telnet (1.2.300.201205071750) "RSE Telnet Connector Service" [Starting]
org.eclipse.rse.core (3.3.2.201301152246) "RSE Core" [Active]
org.eclipse.rse.doc.user (3.4.0.201205301213) "RSE User Guide" [Resolved]
org.eclipse.rse.dstore.security (3.0.400.201205062159) "RSE DStore SSL Support" [Starting]
org.eclipse.rse.efs (2.1.401.201301141950) "RSE Eclipse Filesystem (EFS) Provider" [Starting]
org.eclipse.rse.efs.ui (2.1.400.201205062159) "RSE Eclipse Filesystem (EFS) Provider UI Support" [Resolved]
org.eclipse.rse.files.ui (3.2.101.201302012126) "RSE Files UI" [Active]
org.eclipse.rse.importexport (1.2.300.201205241511) "RSE Import/Export" [Starting]
org.eclipse.rse.processes.ui (3.0.400.201205062159) "RSE Processes UI" [Starting]
org.eclipse.rse.services (3.2.200.201211090626) "RSE Services Framework" [Active]
org.eclipse.rse.services.dstore (3.2.1.201212201804) "RSE DStore Services" [Starting]
org.eclipse.rse.services.files.ftp (3.0.401.201302062102) "RSE FTP Service" [Starting]
org.eclipse.rse.services.local (2.1.401.201302062104) "RSE Local Services" [Active]
org.eclipse.rse.services.ssh (3.2.0.201205022057) "RSE SSH Services" [Starting]
org.eclipse.rse.services.telnet (2.0.300.201205241511) "RSE Telnet Service" [Starting]
org.eclipse.rse.shells.ui (3.0.401.201212171813) "RSE Shells UI" [Starting]
org.eclipse.rse.subsystems.files.core (3.3.1.201211140039) "RSE Files Core" [Active]
org.eclipse.rse.subsystems.files.dstore (2.1.300.201205241511) "RSE DStore Files" [Starting]
org.eclipse.rse.subsystems.files.ftp (2.1.400.201205071750) "RSE FTP Files" [Starting]
org.eclipse.rse.subsystems.files.local (2.1.300.201205062159) "RSE Local Files" [Active]
org.eclipse.rse.subsystems.files.ssh (2.1.300.201205062159) "RSE SSH Files" [Starting]
org.eclipse.rse.subsystems.processes.core (3.1.300.201205062159) "RSE Processes Core" [Starting]
org.eclipse.rse.subsystems.processes.dstore (2.1.400.201205062159) "RSE DStore Processes" [Starting]
org.eclipse.rse.subsystems.processes.local (2.1.400.201205062159) "RSE Local Processes" [Starting]
org.eclipse.rse.subsystems.processes.shell.linux (1.1.400.201205062159) "RSE Linux Shell Processes" [Starting]
org.eclipse.rse.subsystems.shells.core (3.1.300.201205141739) "RSE Shells Core" [Active]
org.eclipse.rse.subsystems.shells.dstore (2.1.400.201205062159) "RSE DStore Shells" [Starting]
org.eclipse.rse.subsystems.shells.local (2.1.400.201205062159) "RSE Local Shells" [Active]
org.eclipse.rse.subsystems.shells.ssh (2.1.400.201205062159) "RSE SSH Shells" [Starting]
org.eclipse.rse.subsystems.shells.telnet (1.2.300.201205062159) "RSE Telnet Shells" [Starting]
org.eclipse.rse.subsystems.terminals.core (1.0.300.201205062159) "RSE Terminals Core" [Resolved]
org.eclipse.rse.subsystems.terminals.ssh (1.0.200.201205062159) "RSE SSH Terminals" [Starting]
org.eclipse.rse.terminals.ui (1.2.0.201205071638) "RSE Terminals UI" [Starting]
org.eclipse.rse.ui (3.3.3.201302122026) "RSE UI" [Active]
org.eclipse.rse.useractions (1.1.400.201205062159) "Remote System Explorer User Actions" [Starting]
org.eclipse.search (3.8.0.v20120523-1540) "Search Support" [Active]
org.eclipse.swt (3.100.1.v4236b) "Standard Widget Toolkit" [Resolved]
org.eclipse.swt.gtk.linux.x86_64 (3.100.1.v4236b) "Standard Widget Toolkit for GTK 2.0" [Resolved]
org.eclipse.team.core (3.6.100.v20120524-0627) "Team Support Core" [Active]
org.eclipse.team.cvs.core (3.3.500.v20120522-1148) "CVS Team Provider Core" [Active]
org.eclipse.team.cvs.ssh2 (3.2.300.v20120522-1148) "CVS SSH2" [Starting]
org.eclipse.team.cvs.ui (3.3.500.v20120522-1148) "CVS Team Provider UI" [Active]
org.eclipse.team.ui (3.6.201.v20130125-135424) "Team Support UI" [Active]
org.eclipse.text (3.5.200.v20120523-1310) "Text" [Resolved]
org.eclipse.tm.terminal (3.2.2.201301071106) "Target Management Terminal Widget" [Starting]
org.eclipse.tm.terminal.ssh (2.1.200.201301080822) "Target Management Terminal SSH Connector" [Starting]
org.eclipse.tm.terminal.telnet (2.1.200.201301080822) "Target Management Terminal Telnet Connector" [Resolved]
org.eclipse.tm.terminal.view (2.4.1.201301031142) "Target Management Terminal View" [Starting]
org.eclipse.ui (3.104.0.v20121024-145224) "Eclipse UI" [Active]
org.eclipse.ui.browser (3.4.2.v20130123-162658) "Browser Support" [Starting]
org.eclipse.ui.cheatsheets (3.4.200.v20120521-2344) "Cheat Sheets" [Starting]
org.eclipse.ui.console (3.5.100.v20120521-2012) "Console" [Active]
org.eclipse.ui.editors (3.8.0.v20120523-1540) "Default Text Editor" [Active]
org.eclipse.ui.externaltools (3.2.100.v20120530-1753) "External Tools" [Starting]
org.eclipse.ui.forms (3.5.200.v20120705-114351) "Eclipse Forms" [Active]
org.eclipse.ui.ide (3.8.2.v20121106-165923) "Eclipse IDE UI" [Active]
org.eclipse.ui.ide.application (1.0.400.v20120523-1955) "Eclipse IDE UI Application" [Resolved]
org.eclipse.ui.intro (3.4.200.v20120521-2344) "Welcome Framework" [Active]
org.eclipse.ui.intro.universal (3.2.600.v20120912-155524) "Universal Welcome" [Active]
org.eclipse.ui.navigator (3.5.200.v20120705-114103) "Common Navigator View" [Active]
org.eclipse.ui.navigator.resources (3.4.400.v20120705-114010) "Navigator Workbench Components" [Starting]
org.eclipse.ui.net (1.2.101.v20120914-093638) "Internet Connection Management UI" [Active]
org.eclipse.ui.trace (1.0.1.v20121204-224553) "Equinox Dynamic Tracing Enablement UI" [Active]
org.eclipse.ui.views (3.6.100.v20120705-114010) "Views" [Active]
org.eclipse.ui.views.log (1.0.300.v20120530-1435) "Log View" [Active]
org.eclipse.ui.views.properties.tabbed (3.5.300.v20120912-132807) "Tabbed Properties View" [Starting]
org.eclipse.ui.workbench (3.104.0.v20130204-164612) "Eclipse Workbench" [Active]
org.eclipse.ui.workbench.texteditor (3.8.0.v20120523-1310) "Text Editor Framework" [Active]
org.eclipse.update.configurator (3.3.200.v20120912-144026) "Install/Update Configurator" [Active]
org.eclipse.wb.core (1.5.2.r42x201302111859) "WindowBuilder Core" [Active]
org.eclipse.wb.core.databinding (1.5.2.r42x201302111907) "WindowBuilder Databinding Core" [Active]
org.eclipse.wb.core.databinding.xml (1.5.2.r42x201302111919) "WindowBuilder Databinding XML Core" [Starting]
org.eclipse.wb.core.java (1.5.2.r42x201302111907) "WindowBuilder Core for Java GUI's" [Active]
org.eclipse.wb.core.lib (1.5.2.r42x201302111859) "WindowBuilder Core Libraries" [Active]
org.eclipse.wb.core.ui (1.5.2.r42x201302111927) "WindowBuilder Core UI" [Starting]
org.eclipse.wb.core.xml (1.5.2.r42x201302111919) "WindowBuilder Core for XML GUI's" [Active]
org.eclipse.wb.discovery.core (1.5.2.r42x201302111927) "WindowBuilder Discovery Core" [Active]
org.eclipse.wb.discovery.ui (1.5.2.r42x201302111927) "WindowBuilder Discovery UI" [Active]
org.eclipse.wb.doc.user (1.5.2.r42x201302111931) "WindowBuilder User Guide" [Starting]
org.eclipse.wb.layout.group (1.5.2.r42x201302111942) "WindowBuilder GroupLayout Support" [Active]
org.eclipse.wb.os (1.5.2.r42x201302111859) "WindowBuilder Cross-Platform Support" [Active]
org.eclipse.wb.os.linux (1.5.2.r42x201302111859) "WindowBuilder Linux OS Support" [Active]
org.eclipse.wb.rcp (1.5.2.r42x201302112047) "SWT Designer" [Active]
org.eclipse.wb.rcp.databinding (1.5.2.r42x201302112047) "SWT Designer Databinding Support" [Active]
org.eclipse.wb.rcp.databinding.emf (1.5.2.r42x201302112047) "SWT Designer Databinding EMF Support" [Starting]
org.eclipse.wb.rcp.databinding.xwt (1.5.2.r42x201302112106) "XWT Databinding Support" [Starting]
org.eclipse.wb.rcp.nebula (1.5.2.r42x201302112047) "SWT Designer Nebula Widgets Support" [Active]
org.eclipse.wb.rcp.swing2swt (1.5.2.r42x201302112047) "SWT Designer Swing2SWT Layouts Support" [Active]
org.eclipse.wb.rcp.SWT_AWT (1.5.2.r42x201302112057) "WindowBuilder SWT_AWT Support" [Starting]
org.eclipse.wb.runtime (1.5.2.r42x201302111859) "WindowBuilder Runtime" [Starting]
org.eclipse.wb.runtime.lib (1.5.2.r42x201302111859) "WindowBuilder Runtime Libraries" [Active]
org.eclipse.wb.swing (1.5.2.r42x201302112024) "Swing Designer" [Active]
org.eclipse.wb.swing.databinding (1.5.2.r42x201302112024) "Swing Designer Databinding Support" [Active]
org.eclipse.wb.swing.FormLayout (1.5.2.r42x201302112024) "Swing Designer JGoodies FormLayout Support" [Active]
org.eclipse.wb.swing.FormLayout.lib (1.5.2.r42x201302112024) "Swing Designer JGoodies FormLayout Library" [Starting]
org.eclipse.wb.swing.java6 (1.5.2.r42x201302112024) "Swing Designer Java6 Support" [Active]
org.eclipse.wb.swing.jsr296 (1.5.2.r42x201302112024) "Swing Designer JSR-296 Support" [Active]
org.eclipse.wb.swing.MigLayout (1.5.2.r42x201302112024) "Swing Designer MigLayout Support" [Active]
org.eclipse.wb.swing.MigLayout.lib (1.5.2.r42x201302112024) "Swing Designer MigLayout Library" [Active]
org.eclipse.wb.swt (1.5.2.r42x201302112017) "SWT Designer Core" [Active]
org.eclipse.wb.swt.widgets.baseline (1.5.2.r42x201302112047) "SWT Baseline Support" [Starting]
org.eclipse.wb.xwt (1.5.2.r42x201302112106) "SWT Designer XWT Support" [Active]
org.eclipse.wst.command.env (1.0.409.v201004211805) "Environment Command Framework (headless)" [Active]
org.eclipse.wst.command.env.core (1.0.205.v201004211805) "Environment Command Framework (core)" [Resolved]
org.eclipse.wst.command.env.doc.user (1.5.300.v201005192225) "Web services Axis Ant task documentation" [Starting]
org.eclipse.wst.command.env.infopop (1.0.100.v200805301544) "Web services UI" [Starting]
org.eclipse.wst.command.env.ui (1.1.103.v201102260635) "Environment Command Framework (GUI)" [Starting]
org.eclipse.wst.common.core (1.2.0.v200908252030) "WST Common Core Plug-in" [Active]
org.eclipse.wst.common.emf (1.2.100.v201101101900) "EMF Utilities" [Active]
org.eclipse.wst.common.emfworkbench.integration (1.2.101.v201107140600) "EMF Workbench Edit Plug-in" [Active]
org.eclipse.wst.common.environment (1.0.400.v200912181832) "Environment Plug-in" [Starting]
org.eclipse.wst.common.frameworks (1.2.200.v201203141800) "Common Frameworks" [Active]
org.eclipse.wst.common.frameworks.ui (1.2.201.v201208292200) "WTP UI Plug-in" [Active]
org.eclipse.wst.common.infopop (1.0.300.v201004280700) "Common WST infopops" [Starting]
org.eclipse.wst.common.modulecore (1.2.201.v201301092200) "Modulecore Plug-in" [Active]
org.eclipse.wst.common.modulecore.ui (1.0.201.v201208241600) "Modulecore UI Plug-in" [Starting]
org.eclipse.wst.common.project.facet.core (1.4.300.v201111030424) "Eclipse Faceted Project Framework" [Active]
org.eclipse.wst.common.project.facet.ui (1.4.300.v201111030424) "Eclipse Faceted Project Framework UI" [Starting]
org.eclipse.wst.common.snippets (1.2.200.v201204260225) "Snippets View" [Starting]
org.eclipse.wst.common.ui (1.1.500.v200911190730) "Eclipse Base UI extensions" [Starting]
org.eclipse.wst.common.uriresolver (1.2.0.v201203071939) "Common URI Resolver Framework" [Starting]
org.eclipse.wst.css.core (1.1.602.v201210091733) "Structured Source CSS Model" [Starting]
org.eclipse.wst.css.ui (1.0.702.v201211262010) "SSE CSS Source Editor" [Starting]
org.eclipse.wst.doc.user (1.2.0.v200806052254) "Master User Doc TOC" [Starting]
org.eclipse.wst.dtd.core (1.1.600.v201205171933) "Structured Source DTD Core" [Starting]
org.eclipse.wst.dtd.ui (1.0.700.v201203081826) "SSE DTD Source Editor" [Starting]
org.eclipse.wst.dtd.ui.infopop (1.0.400.v201008112018) "DTD Editor infopops" [Resolved]
org.eclipse.wst.dtdeditor.doc.user (1.0.700.v201008112018) "DTD Editor documentation" [Resolved]
org.eclipse.wst.html.core (1.1.602.v201301032305) "Structured Source HTML Model" [Starting]
org.eclipse.wst.html.ui (1.0.702.v201211262010) "HTML UI Source Editor" [Starting]
org.eclipse.wst.html.ui.infopop (1.0.200.v201004150328) "HTML editor infopops" [Resolved]
org.eclipse.wst.internet.cache (1.0.600.v201203071939) "Cache URI Resolver Plug-in" [Starting]
org.eclipse.wst.internet.monitor.core (1.0.505.v20110419) "Monitor" [Starting]
org.eclipse.wst.internet.monitor.ui (1.0.606.v20120306_1603) "TCP/IP Monitor" [Starting]
org.eclipse.wst.jsdt.core (1.1.202.v201208171701) "JavaScript Development Tools Core" [Active]
org.eclipse.wst.jsdt.debug.core (3.1.1.v201208171701) "JavaScript Debug Core" [Starting]
org.eclipse.wst.jsdt.debug.crossfire (1.0.301.v201208171701) "Crossfire JavaScript Debug" [Starting]
org.eclipse.wst.jsdt.debug.rhino (1.0.201.v201208171701) "Rhino JavaScript Debug" [Starting]
org.eclipse.wst.jsdt.debug.rhino.debugger (1.0.301.v201208171701) "Rhino Debugger" [Resolved]
org.eclipse.wst.jsdt.debug.rhino.ui (1.0.101.v201208171701) "Rhino Debug UI" [Starting]
org.eclipse.wst.jsdt.debug.transport (1.0.101.v201208171701) "Debug Transport" [Resolved]
org.eclipse.wst.jsdt.debug.ui (1.0.201.v201208241832) "JavaScript Debug UI" [Starting]
org.eclipse.wst.jsdt.doc (1.4.0.v201202031526) "JavaScript Development Tools Documentation" [Resolved]
org.eclipse.wst.jsdt.manipulation (1.0.400.v201204261600) "JavaScript Code Manipulation Functionality" [Active]
org.eclipse.wst.jsdt.support.firefox (1.0.402.v201208171701) "JSDT support for Mozilla FireFox" [Starting]
org.eclipse.wst.jsdt.support.ie (1.0.402.v201208171701) "JSDT support for Microsoft Internet Explorer" [Resolved]
org.eclipse.wst.jsdt.ui (1.1.202.v201208171701) "Eclipse JavaScript Development Tools" [Active]
org.eclipse.wst.jsdt.web.core (1.0.502.v201301101836) "JSDT Web Support Core" [Starting]
org.eclipse.wst.jsdt.web.support.jsp (1.0.500.v201204260100) "JSDT support for JSP Plug-in" [Starting]
org.eclipse.wst.jsdt.web.ui (1.0.502.v201208171701) "JSDT Web Support UI" [Starting]
org.eclipse.wst.server.core (1.4.100.v20130117_1140) "Server Core" [Active]
org.eclipse.wst.server.discovery (1.0.300.v20120403_0949) "Plug-in Discovery Plug-in" [Starting]
org.eclipse.wst.server.http.core (1.0.200.v20090429) "HTTP Server Support" [Starting]
org.eclipse.wst.server.http.ui (1.0.300.v20120821_1517) "HTTP Server UI Support" [Starting]
org.eclipse.wst.server.preview (1.1.102.v20130123_1813) "Preview Server Support" [Starting]
org.eclipse.wst.server.preview.adapter (1.1.101.v20121107_1651) "HTTP Preview Support" [Starting]
org.eclipse.wst.server.ui (1.4.100.v20121112_1718) "Server UI" [Active]
org.eclipse.wst.server.ui.doc.user (1.1.500.v20120830_2252) "Server Tools documentation for Web Standard Tools" [Starting]
org.eclipse.wst.server.ui.infopop (1.1.100.v201005192130) "Server Tools infopops for Web Standard Tools" [Resolved]
org.eclipse.wst.sse.core (1.1.702.v201301241617) "Structured Source Model" [Starting]
org.eclipse.wst.sse.doc.user (1.1.100.v201005192212) "Structured text editor and snippets documentation" [Resolved]
org.eclipse.wst.sse.ui (1.3.102.v201301162301) "Structured Source Editor" [Active]
org.eclipse.wst.sse.ui.infopop (1.0.300.v201004150328) "SSE infopops" [Resolved]
org.eclipse.wst.standard.schemas (1.0.501.v201301091615) "Standard Schemas and DTDs" [Resolved]
org.eclipse.wst.validation (1.2.402.v201212031633) "Validation Framework" [Active]
org.eclipse.wst.validation.infopop (1.0.300.v200806041506) "WST validation infopop plug-in" [Resolved]
org.eclipse.wst.validation.ui (1.2.400.v201204260100) "Validation Framework UI" [Starting]
org.eclipse.wst.web (1.1.600.v201204190200) "Simple Web Plug-in" [Active]
org.eclipse.wst.web.ui (1.1.600.v201109220400) "Eclipse Web Developer Tools" [Starting]
org.eclipse.wst.web.ui.infopop (1.0.300.v200805140415) "Static Web infopop" [Starting]
org.eclipse.wst.webtools.doc.user (1.0.500.v201005192212) "Web tools documentation" [Starting]
org.eclipse.wst.ws (1.1.300.v201204181727) "Web Services" [Active]
org.eclipse.wst.ws.explorer (1.0.700.v201203072334) "Web Services Explorer" [Starting]
org.eclipse.wst.ws.infopop (1.0.300.v200805140230) "Web Services UI" [Starting]
org.eclipse.wst.ws.parser (1.0.500.v201210042315) "Web Services Description Parser" [Starting]
org.eclipse.wst.ws.service.policy (1.0.303.v201009221810) "Service Policy - Core" [Active]
org.eclipse.wst.ws.service.policy.ui (1.0.400.v201201111717) "Service Policy - UI" [Active]
org.eclipse.wst.ws.ui (1.1.200.v201004211805) "Web Services UI" [Starting]
org.eclipse.wst.wsdl (1.2.300.v201109010430) "WSDL Model" [Starting]
org.eclipse.wst.wsdl.ui (1.2.500.v201108240518) "WSDL UI" [Starting]
org.eclipse.wst.wsdl.ui.doc.user (1.0.800.v201008122303) "WSDL Editor Documentation" [Starting]
org.eclipse.wst.wsdl.validation (1.1.600.v201203081939) "WSDL Validator" [Starting]
org.eclipse.wst.wsi (1.0.500.v201203081939) "WSI Conformance Tools" [Starting]
org.eclipse.wst.wsi.ui (1.0.502.v201104071820) "Soap Monitor" [Starting]
org.eclipse.wst.wsi.ui.doc.user (1.0.700.v201008122303) "WS-I Validation Documentation" [Resolved]
org.eclipse.wst.xml.core (1.1.702.v201301101836) "Structured Source XML Model" [Active]
org.eclipse.wst.xml.ui (1.1.302.v201301172222) "Eclipse XML Editors and Tools" [Starting]
org.eclipse.wst.xml.ui.infopop (1.0.400.v201004292007) "XML infopops" [Resolved]
org.eclipse.wst.xml.xpath.core (1.3.0.v201108312136) "XPath Core" [Starting]
org.eclipse.wst.xml.xpath.ui (1.1.101.v201204260040) "XPath UI" [Starting]
org.eclipse.wst.xml.xpath2 (1.1.0.v200910101444) "Eclipse XPath 2 Developers Tools" [Resolved]
org.eclipse.wst.xml.xpath2.processor (2.1.2.v201212060048) "PsychoPath XPath 2.0 Processor" [Resolved]
org.eclipse.wst.xml.xpath2.processor.doc.user (2.0.0.v201105190326) "XPath 2.0 (PsychoPath) User Documentation" [Resolved]
org.eclipse.wst.xml.xpath2.wtptypes (2.0.0.v201103212215) "XPath2 WTP ContentModel TypeModel Bridge" [Starting]
org.eclipse.wst.xmleditor.doc.user (1.0.700.v201005192212) "XML editor" [Resolved]
org.eclipse.wst.xsd.core (1.1.700.v201204102147) "XSD Core Plugin" [Starting]
org.eclipse.wst.xsd.ui (1.2.500.v201203081826) "XML Schema Editor" [Starting]
org.eclipse.wst.xsdeditor.doc.user (1.0.800.v201005192212) "XML schema editor" [Resolved]
org.eclipse.wst.xsl (1.2.0.v201009121641) "Eclipse XSL Developer Tools" [Resolved]
org.eclipse.wst.xsl.core (1.1.100.v201102270516) "XSL Core" [Starting]
org.eclipse.wst.xsl.debug.ui (1.0.200.v201101281837) "XSL Debugger UI" [Active]
org.eclipse.wst.xsl.doc (1.0.100.v201004292007) "XSL User Documentation (Incubating)" [Resolved]
org.eclipse.wst.xsl.exslt.core (1.0.0.v201005240426) "EXSLT UI Extensions" [Starting]
org.eclipse.wst.xsl.exslt.ui (1.0.0.v201006012005) "EXSLT Core Extensions" [Starting]
org.eclipse.wst.xsl.jaxp.debug (1.0.200.v201103081922) "XSL JAXP Debugger" [Resolved]
org.eclipse.wst.xsl.jaxp.debug.ui (1.0.200.v201103081922) "XSL JAXP Debug UI" [Starting]
org.eclipse.wst.xsl.jaxp.launching (1.0.200.v201103081922) "XSL JAXP Launching" [Starting]
org.eclipse.wst.xsl.launching (1.0.200.v201103081922) "XSL Transform Launching" [Starting]
org.eclipse.wst.xsl.saxon (1.0.200.v201103081922) "XSL Saxon Support" [Resolved]
org.eclipse.wst.xsl.ui (1.1.300.v201204101539) "XSL Editor and Validation" [Starting]
org.eclipse.wst.xsl.xalan (1.0.100.v201103081922) "XSL Xalan Support" [Resolved]
org.eclipse.wtp.epp.package.capabilities (1.3.0.v201005102000) "Eclipse IDE for Java EE Capabilities" [Resolved]
org.eclipse.wtp.epp.package.jee.intro (1.3.0.v201006142040) "Eclipse IDE for Java EE Introduction" [Starting]
org.eclipse.wtp.javascript.capabilities (1.0.100.v201005102000) "JavaScript Capabilities" [Resolved]
org.eclipse.wtp.jee.capabilities (1.0.100.v201005102000) "Java EE Capabilities" [Resolved]
org.eclipse.wtp.web.capabilities (1.0.100.v201005102000) "Web Capabilities" [Resolved]
org.eclipse.wtp.xml.capabilities (1.0.100.v201005102000) "XML Capabilities" [Resolved]
org.eclipse.xsd (2.8.1.v20130125-0826) "XSD Model" [Starting]
org.eclipse.xsd.edit (2.6.0.v20130125-0826) "XSD Edit" [Starting]
org.hamcrest.core (1.1.0.v20090501071000) "Hamcrest Core Library of Matchers" [Starting]
org.jdom (1.0.0.v201005080400) "JDOM" [Resolved]
org.jdom (1.1.1.v201101151400) "JDOM" [Resolved]
org.jsoup (1.6.1.v201201201356) "jsoup: Java HTML Parser" [Resolved]
org.junit (3.8.2.v3_8_2_v20100427-1100) "JUnit Testing Framework" [Resolved]
org.junit (4.10.0.v4_10_0_v20120426-0900) "JUnit Testing Framework" [Resolved]
org.junit4 (4.8.1.v20120523-1257) "JUnit Testing Framework Version 4" [Resolved]
org.kohsuke.args4j (2.0.12.v200910131500) "Args4j" [Resolved]
org.mozilla.javascript (1.7.2.v201005080400) "Mozilla Rhino" [Resolved]
org.objectweb.asm (3.3.1.v201105211655) "ASM" [Resolved]
org.sat4j.core (2.3.0.v20110329) "SAT4J Core" [Resolved]
org.sat4j.pb (2.3.0.v20110329) "SAT4J Pseudo" [Resolved]
org.swtchart (0.7.0.v201201201914) "SWTChart Plug-in" [Resolved]
org.uddi4j (2.0.5.v200805270300) "UDDI4J" [Resolved]
org.w3c.css.sac (1.3.1.v200903091627) "W3C CSS SAC" [Resolved]
org.w3c.dom.smil (1.0.0.v200806040011) "W3C SMIL DOM" [Resolved]
org.w3c.dom.svg (1.1.0.v201011041433) "W3C SVG DOM" [Resolved]

*** User Preferences:
#Sun Sep 25 17:47:38 EDT 2016
/bundle_defaults/org.eclipse.cdt.ui/asm_directive=127,0,85
/bundle_defaults/org.eclipse.ui.editors/isErrorGoToPreviousNavigationTarget=true
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.verticalruler=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.tabulation.size=4
/bundle_defaults/org.eclipse.ui.editors/showLeadingSpaces=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.number.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_private_constructors=true
/bundle_defaults/org.eclipse.ui.editors/Accessibility.UseSaturatedColors=false
/bundle_defaults/org.eclipse.jdt.ui/highlightBracketAtCaretLocation=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_keyword_bold=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.cdt.ui/closeAngularBrackets=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_enumerator_list=48
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.visibility.order=B,V,R,D
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_for=insert
/bundle_defaults/org.eclipse.ui.editors/linked.focus.text=true
/bundle_defaults/org.eclipse.wb.swing/GridBagLayout.enableRightAlignment=true
/bundle_defaults/org.eclipse.ui.editors/revisionRulerRenderingMode=Age
/bundle_defaults/org.eclipse.ui.editors/isRevisionAnnotationGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/sourceHoverBackgroundColor.SystemDefault=true
/bundle_defaults/org.eclipse.ui.editors/secondaryIPOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_colon_in_labeled_statement=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.classpath.multipleOutputLocations=enabled
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.gettersetter.use.is=true
/bundle_defaults/org.eclipse.jdt.ui/smartIndentAfterNewline=true
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.all_references_max_count=100
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_before_method=1
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.namespace.italic=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariableDeclaration.color=128,0,0
/bundle_defaults/org.eclipse.egit.ui/decorator_foldertext_decoration={dirty\:>} {name}
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedMethodInvocation.color=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_try=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticFinalField.italic=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_conditional_expression_chain=18
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_after_package=1
@org.eclipse.rse.ui=3.3.3.201302122026
/bundle_defaults/org.eclipse.ui.editors/lineNumberColor=120,120,120
/bundle_defaults/org.eclipse.ui.editors/taskTextStyle=SQUIGGLES
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_in_empty_block=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_parameters_in_method_declaration=16
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.text.style=BOX
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.enum.bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.format_line_comment_starting_on_first_column=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.method.wordDelimiter=
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.functionDeclaration.strikethrough=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indentation.size=4
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.globalVariable.bold=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.overloadedOperator.color=200,100,0
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.editor.CElementHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.ui/VIEW_MINIMUM_CHARACTERS=1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocComments=ignore
/bundle_defaults/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.corecDebug.default_expression_format=0
/instance/org.eclipse.debug.core//org.eclipse.debug.core.PREFERRED_DELEGATES/org.eclipse.cdt.launch.attachLaunchType=org.eclipse.cdt.dsf.gdb.launch.attachCLaunch,debug
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_before_package=0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.autoboxing.bold=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.visibility.order=B,V,R,D
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.brace_position_for_array_initializer=end_of_line
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_value=42,0,255
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.put_empty_statement_on_new_line=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedLocal=warning
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariableDeclaration.strikethrough=false
/bundle_defaults/org.eclipse.debug.ui/org.eclispe.debug.ui.Debug_view.mode=Debug_view.mode.auto
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.externalSDK.enabled=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.looseVarDecleration=warning
/bundle_defaults/org.eclipse.jdt.ui/content_assist_add_import=true
/bundle_defaults/org.eclipse.ui.editors/indexResultIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.ui/ENABLE_32_STICKY_CLOSE_BEHAVIOR=false
/bundle_defaults/org.eclipse.pde.core/org.eclipse.pde.ui.ws=gtk
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_for=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.deprecatedMember.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_postfix_operator=do not insert
/bundle_defaults/org.eclipse.debug.ui/Console.console_tab_width=8
/bundle_defaults/org.eclipse.wb.rcp/stubName=do_${component_name}_${event_name}
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.continuation_indentation_for_array_initializer=2
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_unary_operator=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.uninitializedLocalVariable=warning
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.detail_pane_word_wrap=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_after_comma_in_objlit_initializer=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_allocation_expression=insert
/bundle_defaults/org.eclipse.egit.ui/show_home_drive_warning=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.internal.ui.propertiesfileeditor.PropertyKeyHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_semicolon=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.taskPriorities=NORMAL,HIGH,NORMAL
/bundle_defaults/org.eclipse.ui.editors/errorIndicationInVerticalRuler=true
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.shownewconnection=false
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_enabled=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotation.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/markMethodExitPoints=true
/bundle_defaults/org.eclipse.ui.workbench/MULTI_KEY_ASSIST=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticMethod.bold=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_allow_empty_commit_comment=prompt
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_prefix_operator=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_switch=end_of_line
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_before_identifier_in_function_declaration=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_template_arguments=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.globalVariable.strikethrough=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_cvs_rsh=ssh
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.parameterVariable.italic=false
/instance/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.core.cDebug.default_source_containers=<?xml version\="1.0" encoding\="UTF-8" standalone\="no"?>\n<sourceLookupDirector>\n<sourceContainers duplicates\="false">\n<container memento\="AbsolutePath" typeId\="org.eclipse.cdt.debug.core.containerType.absolutePath"/>\n<container memento\="programRelativePath" typeId\="org.eclipse.cdt.debug.core.containerType.programRelativePath"/>\n<container memento\="&lt;?xml version\=&quot;1.0&quot; encoding\=&quot;UTF-8&quot; standalone\=&quot;no&quot;?&gt;&\#10;&lt;project referencedProjects\=&quot;true&quot;/&gt;&\#10;" typeId\="org.eclipse.cdt.debug.core.containerType.project"/>\n</sourceContainers>\n</sourceLookupDirector>\n
/bundle_defaults/org.eclipse.jdt.ui/JavaEditor.SyncOutlineOnCursorMove=true
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.classpathVariable.JRE_LIB=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/jre/lib/rt.jar
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.methodDeclarationName.bold=true
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_details=DETAIL_PANE
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.brace_position_for_block_in_case=end_of_line
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_argument=127,0,85
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_after_opening_brace_in_objlit_initializer=insert
/bundle_defaults/org.eclipse.jdt.ui/java_doc_link=63,63,191
/bundle_defaults/org.eclipse.ui.editors/linked.slave.navigation.dropdown=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.add_default_serial_version_id=true
/bundle_defaults/org.eclipse.jdt.ui/markOccurrences=true
/bundle_defaults/org.eclipse.ui.editors/revisionAnnotationIndicationColor=88,88,22
/bundle_defaults/org.eclipse.wb.swing/P_APPLY_IN_MAIN=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeParameter.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_enum_declarations=insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_annotate_promptforbinary=prompt
/bundle_defaults/org.eclipse.ui.editors/spellingEngine=
/bundle_defaults/org.eclipse.cdt.dsf.gdb/enablePrettyPrinting=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.rse.core/logging_level=0
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_show_visible_proposals=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.always_use_this_for_non_static_field_access=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_if=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.enumIdentifier=warning
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_argument_bold=true
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.ui.editor.showSegments=false
/bundle_defaults/org.eclipse.cdt.ui/content_assist_autoactivation_trigger_doublecolon=true
/bundle_defaults/org.eclipse.debug.ui/Console.highWaterMark=100000
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.annotation.missingNonNullByDefaultAnnotation=ignore
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_digits=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariableDeclaration.italic=false
/bundle_defaults/org.eclipse.wb.rcp/layout.inheritLayoutOfParent=false
/bundle_defaults/org.eclipse.jdt.ui/java_doc_default=63,95,191
/bundle_defaults/org.eclipse.jdt.ui/content_assist_completion_replacement_foreground=255,0,0
/bundle_defaults/org.eclipse.wst.jsdt.ui/Refactoring.savealleditors=false
/bundle_defaults/org.eclipse.ui.editors/showTrailingIdeographicSpaces=true
/bundle_defaults/org.eclipse.cdt.core/build.all.configs.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_array_initializer=insert
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_annotation=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.continuation_indentation=2
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_method_declaration_throws=do not insert
/bundle_defaults/org.eclipse.ui.editors/linked.slave.navigation.previous=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_default_serial_version_id=true
/bundle_defaults/org.eclipse.cdt.ui/content_assist_parameters_foreground=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_angle_bracket_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.taskTags=TODO,FIXME,XXX
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_favorite_static_members=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.staticFieldPrefixes=
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroSubstitution.color=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedLabel=warning
/bundle_defaults/org.eclipse.wst.jsdt.ui/PackagesView.pkgNamePatternForPackagesView=
/bundle_defaults/org.eclipse.ui.editors/warningIndicationHighlighting=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_bracket_in_array_type_reference=do not insert
/instance/org.eclipse.ui.ide/platformState=1474750481229
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.view_syncinfo_in_label=false
/bundle_defaults/org.eclipse.wb.swing/nls.prefixOfPropertyValueToSpecifyThatItIsKey=*
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.sort_members_all=false
/bundle_defaults/org.eclipse.ui.editors/occurrenceIndicationColor=212,212,212
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroDefinition.bold=false
/instance/org.eclipse.jdt.launching/org.eclipse.jdt.launching.PREF_VM_XML=<?xml version\="1.0" encoding\="UTF-8" standalone\="no"?>\n<vmSettings defaultVM\="57,org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType13,1474749971717" defaultVMConnector\="">\n<vmType id\="org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType">\n<vm id\="1474749971717" name\="java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64" path\="/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64"/>\n</vmType>\n</vmSettings>\n
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.writeOccurrenceIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.use_this_for_non_static_method_access=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/markImplementors=true
/bundle_defaults/org.eclipse.ui.editors/textDragAndDropEnabled=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_method_declaration_throws=do not insert
/bundle_defaults/org.eclipse.cdt.ui/scalability.parserBasedContentAssist=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_bracket_in_array_allocation_expression=do not insert
/bundle_defaults/org.eclipse.ui.workbench/SELECT_ON_HOVER=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.invalidJavadoc=ignore
/bundle_defaults/org.eclipse.core.resources/description.snapshotinterval=300000
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.uncheckedTypeOperation=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_superclass_in_type_declaration=16
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_value=42,0,255
/bundle_defaults/org.eclipse.cdt.dsf.gdb/useInspectorHover=true
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Color.FindScope=185,176,180
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.methodDeclarationName.color=0,0,0
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.memory.paddedStr=??
/bundle_defaults/org.eclipse.jdt.ui/cleanup.use_this_for_non_static_field_access_only_if_necessary=true
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.classpathVariable.JRE_SRCROOT=
/bundle_defaults/org.eclipse.ui/OPEN_NEW_PERSPECTIVE=OPEN_PERSPECTIVE_REPLACE
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enumerator.enabled=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractClass.strikethrough=false
/bundle_defaults/org.eclipse.cdt.ui/c_numbers_italic=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.functionDeclaration.bold=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unclosedCloseable=warning
/bundle_defaults/org.eclipse.ui.editors/breakpointIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_opening_brace_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.wb.rcp/P_COMPONENT_GAP_RIGHT=6
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_tags=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.overloadedOperator.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.classpath.outputOverlappingAnotherSource=error
/bundle_defaults/org.eclipse.pde.core/org.eclipse.pde.ui.os=linux
/bundle_defaults/org.eclipse.wb.core/editor.layout=0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.field.enabled=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.use_this_for_non_static_method_access_only_if_necessary=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/closeStrings=true
/bundle_defaults/org.eclipse.jdt.ui/markImplementors=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_revision_mode=0
/instance/org.eclipse.jdt.ui/content_assist_number_of_computers=21
/bundle_defaults/org.eclipse.cdt.ui/scalability.contentAssistAutoActivation=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.browsing.memberstoeditor=true
/bundle_defaults/org.eclipse.ui.editors/revisionAnnotationIndication=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_enum_declarations=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_between_empty_parens_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/closeBraces=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_base_types=do not insert
/bundle_defaults/org.eclipse.cdt.ui/pp_header_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_between_import_groups=1
/bundle_defaults/org.eclipse.pde.core/org.eclipse.pde.ui.nl=en_US
/bundle_defaults/org.eclipse.debug.ui/Console.lowWaterMark=80000
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_arguments_in_enum_constant=16
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_trailing_whitespaces=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.emptyStatement=ignore
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unnecessaryTypeCheck=ignore
/bundle_defaults/org.eclipse.ui.editors/breakpointIndicationColor=0,0,255
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.brace_position_for_switch=end_of_line
/bundle_defaults/org.eclipse.jdt.ui/cleanup_profile=org.eclipse.jdt.ui.default.eclipse_clean_up_profile
/bundle_defaults/org.eclipse.wb.swing/nls.renameKeysWithVariables=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.browsing.typestoeditor=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_annotation_type_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_before_finally_in_try_statement=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariable.bold=false
/bundle_defaults/org.eclipse.ui.editors/javaScriptOverrideIndicator=false
/instance/org.eclipse.mylyn.tasks.ui/org.eclipse.mylyn.tasks.ui.filters.nonmatching.encouraged=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.use_tabs_only_for_leading_indentations=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.clear_blank_lines_in_javadoc_comment=false
/bundle_defaults/org.eclipse.ui.ide/SWITCH_PERSPECTIVE_ON_PROJECT_CREATION=prompt
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.navigation.next=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.activate_workbench=true
/configuration/org.eclipse.ui.ide/SHOW_WORKSPACE_SELECTION_DIALOG=false
/bundle_defaults/org.eclipse.ui.ide/OPEN_REQUIRED_PROJECTS=prompt
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.continuation_indentation=2
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_after_opening_brace_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_closing_brace_in_block=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_array_initializer=insert
/bundle_defaults/org.eclipse.ui.editors/revisionAnnotationIndicationHighlighting=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_before_catch_in_try_statement=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.format_html=true
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.reuse_open_compare_editors=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.mylyn.tasks.ui.hyperlinks.detectors.task.multiple_stateMask=262144
/bundle_defaults/org.eclipse.ui.editors/isSearchResultGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_conditional_expression=80
/bundle_defaults/org.eclipse.team.cvs.ui/pref_prune_empty_directories=true
/bundle_defaults/org.eclipse.cdt.ui/Refactoring.savealleditors=false
/bundle_defaults/org.eclipse.cdt.ui/c_comment_task_tag=127,159,191
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_prefix_operator=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_assignment=0
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.parameterVariable.underline=false
/bundle_defaults/org.eclipse.jdt.ui/editor_folding_default_imports=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.browsing.memberstoeditor=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_use_font_decorators=false
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_key=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.fieldPrefixes=
/bundle_defaults/org.eclipse.jdt.ui/java_bracket_italic=false
/bundle_defaults/org.eclipse.cdt.core/indexer/skipTypeReferences=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_bracket=do not insert
/bundle_defaults/org.eclipse.cdt.ui/scalability.syntaxColor=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/sourceHoverBackgroundColor.SystemDefault=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unused_private_types=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocCommentsOverriding=disabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_multiple_field_declarations=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_method_invocation_arguments=insert
/bundle_defaults/org.eclipse.ui.editors/searchResultIndicationInVerticalRuler=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enumerator.italic=true
/bundle_defaults/org.eclipse.wb.swing/nls.automaticallyExternalize=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedParameterWhenOverridingConcrete=disabled
@org.eclipse.mylyn.context.core=3.8.3.v20130107-0100
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariableDeclaration.bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_ellipsis=do not insert
@org.eclipse.cdt.ui=5.5.0.201302132326
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.debug.ui.ExpressionView.org.eclipse.jdt.debug.ui.show_constants=false
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debug.show_references_in_var_view=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.track_views=true
/bundle_defaults/org.eclipse.jdt.ui/java_doc_keyword_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.format_line_comments=true
/bundle_defaults/org.eclipse.ui.editors/isAdditionGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_annotation=do not insert
/bundle_defaults/org.eclipse.jdt.ui/handleTemporaryProblems=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_empty_brackets_in_array_allocation_expression=do not insert
/bundle_defaults/org.eclipse.jdt.ui/content_assist_favorite_static_members=
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.occurrenceHighlighting=true
/bundle_defaults/org.eclipse.egit.ui/decorator_show_staged_icon=true
/bundle_defaults/org.eclipse.ui.editors/indexResultIndication=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.deprecatedMember.strikethrough=true
/bundle_defaults/org.eclipse.ui.editors/isIndexResultGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.typedef.color=0,80,50
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeParameter.strikethrough=false
/bundle_defaults/org.eclipse.ui.workbench/EDITOR_TAB_WIDTH=3
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.new_lines_at_block_boundaries=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_consider_contents=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_bracket=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_multiple_local_declarations=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingDeprecatedAnnotation=ignore
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.highlight=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_if=do not insert
/bundle_defaults/org.eclipse.jdt.ui/java_doc_default_italic=false
/bundle_defaults/org.eclipse.wb.rcp/formLayout.mode=auto
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_type_declaration=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticFinalField.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.taskCaseSensitive=enabled
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_comment=63,127,95
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.exception.name=e
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.code_formatter=org.eclipse.cdt.core.defaultCodeFormatter
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.invalidJavadocTagsVisibility=default
/bundle_defaults/org.eclipse.jdt.ui/spelling_proposal_threshold=20
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_empty_parens_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.label.bold=false
/bundle_defaults/org.eclipse.wb.rcp/property.events.codeType=0
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.percentOffset.horizontal=6
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.field.strikethrough=false
/bundle_defaults/org.eclipse.ui.editors/spellingIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.inColor=0,200,125
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.deadCodeInTrivialIfStatement=disabled
/bundle_defaults/org.eclipse.ui.editors/isTaskGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_label=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_try=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeParameter.italic=false
/bundle_defaults/org.eclipse.cdt.ui/autoOpenConsole=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.comment.never_indent_line_comments_on_first_column=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.missingJavadocComments=ignore
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.methodreturntype=false
/bundle_defaults/org.eclipse.cdt.ui/c_keyword_bold=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_brace_in_array_initializer=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.undocumentedEmptyBlock=ignore
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.setter.capitalization=3
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.validate_edit_with_no_context=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.template.format=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.variable.capitalization=4
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_for=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_angle_bracket_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_added_flag=*
/instance/org.eclipse.jdt.ui/spelling_locale_initialized=true
/bundle_defaults/org.eclipse.wb.swing/general.topBoundsDefaultHeight=300
/bundle_defaults/org.eclipse.jdt.ui/cleanup.showwizard=true
/bundle_defaults/org.eclipse.ui.editors/rulerContributions=
/bundle_defaults/org.eclipse.ui.editors/javaScriptOccurrenceIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_constructor_initializer_list=0
/bundle_defaults/org.eclipse.ui.workbench/EDITORLIST_PULLDOWN_ACTIVE=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedParameter=ignore
/bundle_defaults/org.eclipse.wb.swing/innerClassName=${Component_name}${Listener_className}
/instance/org.eclipse.jdt.ui/org.eclipse.jface.textfont=1|Monospace|10.0|0|GTK|1|;
/bundle_defaults/org.eclipse.cdt.ui/c_comment_task_tag_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/autoFormatJavaDocs=false
/bundle_defaults/org.eclipse.wb.rcp/textVariable.mode=1
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticMethodInvocation.color=0,0,0
/instance/org.eclipse.ui.workbench//org.eclipse.ui.commands/state/org.eclipse.wst.xml.views.XPathView.processor.xpathprocessor/org.eclipse.ui.commands.radioState=xpath10
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_between_empty_brackets=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_exception_specification=do not insert
/bundle_defaults/org.eclipse.egit.ui/refesh_only_when_active=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_while=do not insert
/bundle_defaults/org.eclipse.ui.ide/LIMIT_TASKS=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_semicolon=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_question_in_conditional=insert
/bundle_defaults/org.eclipse.ui.editors/additionIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.cdt.core/indexer/indexOnOpen=false
/bundle_defaults/org.eclipse.jdt.ui/java_method_name_bold=false
/bundle_defaults/org.eclipse.ui.editors/showWarningInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.format_source_code=true
/instance/org.eclipse.mylyn.context.core/mylyn.attention.migrated=true
/bundle_defaults/org.eclipse.ui.workbench/REUSE_DIRTY_EDITORS=true
/bundle_defaults/org.eclipse.cdt.ui/contentAssist.showCamelCaseMatches=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.fatalOptionalError=enabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.nonExternalizedStringLiteral=ignore
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.javaDebug.alertHCRFailed=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_missing_override_annotations=true
/bundle_defaults/org.eclipse.ui.workbench/REUSE_OPEN_EDITORS=8
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_multiple_fields=16
/bundle_defaults/org.eclipse.cdt.ui/c_single_line_comment_bold=false
/bundle_defaults/org.eclipse.jdt.ui/editor_folding_default_headers=true
/bundle_defaults/org.eclipse.ui.editors/showEnclosedIdeographicSpaces=true
/bundle_defaults/org.eclipse.egit.ui/CloneWizard_StoreInSecureStore=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.templateParameter.enabled=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indentation.size=4
/bundle_defaults/org.eclipse.ui.editors/currentIPIndication=false
/bundle_defaults/org.eclipse.ui.editors/undoHistorySize=200
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.wizards.srcBinFoldersSrcName=src
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_colon_in_case=do not insert
/instance/org.eclipse.jdt.ui/fontPropagated=true
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_default_structures=false
/bundle_defaults/org.eclipse.cdt.core/indexer/indexAllFiles=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_expressions_in_array_initializer=16
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.overrideannotation=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_base_clause_in_type_declaration=80
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.exception.name=e
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedWarningToken=warning
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.5
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.all_instances_max_count=100
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.RemoveFromLaunchHistory=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_semicolon_in_for=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_catch=do not insert
/bundle_defaults/org.eclipse.ui.editors/showTaskInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/hoverModifierMasks=org.eclipse.wst.jsdt.ui.BestMatchHover;0;org.eclipse.wst.jsdt.ui.JavaSourceHover;131072;org.eclipse.wst.jsdt.ui.NLSStringHover;327680
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_if=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_for_inits=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.always_use_blocks=true
/bundle_defaults/org.eclipse.ui.editors/printMarginColor=176,180,185
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.comment.min_distance_between_code_and_line_comment=1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_allocation_expression=do not insert
/bundle_defaults/org.eclipse.ui.workbench/DISABLE_DIALOG_FONT=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/matchingBrackets=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_postfix_operator=do not insert
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.LaunchLastIfNotLaunchable=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.lineSplit=80
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_multiple_local_declarations=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_constructor_declaration_parameters=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.add_serial_version_id=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.compliance=1.4
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedField.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.number_of_empty_lines_to_preserve=1
/bundle_defaults/org.eclipse.cdt.ui/spelling_proposal_threshold=20
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroDefinition.underline=false
/bundle_defaults/org.eclipse.egit.ui/show_git_prefix_warning=true
/bundle_defaults/org.eclipse.wb.rcp/P_CONTAINER_GAP_TOP=10
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractMethodInvocation.underline=false
/bundle_defaults/org.eclipse.wb.core/common.acceptNonVisualBeans=true
/bundle_defaults/org.eclipse.cdt.dsf.gdb/autoTerminateGdb=true
/bundle_defaults/org.eclipse.egit.ui/commit_dialog_history_size=10
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_hasremote=true
/bundle_defaults/org.eclipse.ui.editors/quickdiff.nowarn.before.switch=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.argumentPrefixes=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_before_else_in_if_statement=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/subWordNavigation=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_limit_output=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.explicitlyClosedAutoCloseable=ignore
/bundle_defaults/org.eclipse.ui.workbench/EDITORLIST_DISPLAY_FULL_NAME=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.ant.ui.AntElementHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.core.resources/description.defaultbuildorder=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_array_initializer=end_of_line
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.show_run_perspective_default=perspective_none
/bundle_defaults/org.eclipse.jdt.ui/matchingBrackets=true
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_null_entries=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.memory.columnSize=4
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.duplicateLocalVariables=warning
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.sychronizing_default_participant_sec_id=none
/bundle_defaults/org.eclipse.equinox.p2.ui.sdk.scheduler/schedule=on-startup
/bundle_defaults/org.eclipse.ui.editors/currentIPHighlight=true
@org.eclipse.team.ui=3.6.201.v20130125-135424
/bundle_defaults/org.eclipse.ui.workbench/OPEN_VIEW_MODE=0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.continuation_indentation_for_objlit_initializer=1
/bundle_defaults/org.eclipse.ui.ide/IMPORT_FILES_AND_FOLDERS_VIRTUAL_FOLDER_MODE=prompt
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.uncheckedTypeOperation=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_closing_angle_bracket_in_type_arguments=insert
/instance/org.eclipse.jdt.ui/content_assist_disabled_computers=org.eclipse.jdt.ui.textProposalCategory\u0000org.eclipse.jdt.ui.javaAllProposalCategory\u0000org.eclipse.jdt.ui.javaTypeProposalCategory\u0000org.eclipse.jdt.ui.javaNoTypeProposalCategory\u0000
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_enum_declaration=insert
/bundle_defaults/org.eclipse.ui.editors/matchingTagTextStyle=NONE
/instance/org.eclipse.cdt.ui/spelling_locale_initialized=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_arguments_in_explicit_constructor_call=16
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_while=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedDeclaredThrownExceptionWhenOverriding=disabled
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.method.italic=false
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.PathFilter=
/bundle_defaults/org.eclipse.egit.ui/decorator_show_tracked_icon=true
/bundle_defaults/org.eclipse.ui.editors/printMarginColumn=80
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.emptyStatement=ignore
/bundle_defaults/org.eclipse.cdt.ui/asm_label_italic=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.navigation.dropdown=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.remove_all_breakpoints_prompt=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_parameters_in_constructor_declaration=16
/bundle_defaults/org.eclipse.wb.swing/P_USE_JDK_LAYOUT_STYLE=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unresolvedFieldReference=error
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_key_italic=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotation.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_empty_parens_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.auto_remove_old_launches=true
/bundle_defaults/org.eclipse.ui.ide/LIMIT_BOOKMARKS=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.deprecation=warning
/bundle_defaults/org.eclipse.pde.core/target_mode=useThis
/bundle_defaults/org.eclipse.wb.rcp/property.events.stubDelete=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_empty_lines=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_keyword=127,0,85
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_constructor_declaration_throws=insert
/bundle_defaults/org.eclipse.ui.editors/secondaryIPTextStyle=NONE
/bundle_defaults/org.eclipse.ui.editors/occurrenceHighlighting=true
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.qualifyconnectionnames=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.css.ui.internal.hyperlink.CSSHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.compact_else_if=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_catch=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_statements_compare_to_block=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_value_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.debug.lineNumber=generate
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_missing_override_annotations_interface_methods=true
/bundle_defaults/org.eclipse.wb.core/hiddenCode.begin=$hide>>$
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_assignment_operator=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_angle_bracket_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariable.underline=false
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_rev_comment=true
/bundle_defaults/org.eclipse.ui.editors/isInfoGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.setter.suffix=
/bundle_defaults/org.eclipse.ui.editors/overrideIndicator=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.methodDeclarationName.enabled=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.annotation.nullanalysis=disabled
/bundle_defaults/org.eclipse.egit.ui/date_format=yyyy-MM-dd HH\:mm\:ss
/bundle_defaults/org.eclipse.jdt.ui/content_assist_parameters_foreground=0,0,0
/bundle_defaults/org.eclipse.ui.editors/linked.exit.navigation.next=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.add_missing_deprecated_annotations=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_body_declarations_compare_to_access_specifier=true
/bundle_defaults/org.eclipse.ui.editors/matchingTagIndicationColor=212,212,212
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedMethodInvocation.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_default_bold=false
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.internal.ui.text.doctools.doxygen.recognizedTag=127,159,191
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroDefinition.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_arguments_in_allocation_expression=16
/bundle_defaults/org.eclipse.ui/USE_WINDOW_WORKING_SET_BY_DEFAULT=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_annotation_on_method=insert
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.flatPackagesInPackageExplorer=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.staticFieldPrefixes=
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_colon_in_labeled_statement=do not insert
/bundle_defaults/org.eclipse.ui.editors/additionIndicationColor=188,188,222
/bundle_defaults/org.eclipse.jdt.ui/smartPaste=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.objectInitializer.bold=true
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_provider=org.eclipse.cdt.ui.text.defaultFoldingProvider
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocTagsMethodTypeParameters=disabled
/bundle_defaults/org.eclipse.jdt.ui/java_keyword_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/Search.usereducemenu=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_cast=do not insert
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_urls=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.indent_parameter_description=true
/bundle_defaults/org.eclipse.wb.swing/property.events.innerClassPosition=3
/bundle_defaults/org.eclipse.jdt.ui/content_assist_autoactivation_triggers_javadoc=@\#
/bundle_defaults/org.eclipse.wb.swing/P_DISPLAY_GRID=false
/bundle_defaults/org.eclipse.jdt.ui/content_assist_autoactivation=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/markBreakContinueTargets=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_timeout=60
/bundle_defaults/org.eclipse.jdt.ui/java_bracket_bold=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_edit_action=editInBackground
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.comparingIdentical=warning
/bundle_defaults/org.eclipse.team.cvs.ui/pref_commit_files_display_threshold=1000
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.isOverrideIndicatorGoToNextNavigationTarget=false
@org.eclipse.core.net=1.2.200.v20120914-093638
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.classpath.multipleOutputLocations=enabled
/bundle_defaults/org.eclipse.jdt.ui/subWordNavigation=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.format_source_code=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.classpath.exclusionPatterns=enabled
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.number.strikethrough=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_annotation_on_parameter=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_type_parameters=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_before_first_class_body_declaration=0
/bundle_defaults/org.eclipse.core.resources/description.disableLinking=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_anonymous_type_declaration=insert
/bundle_defaults/org.eclipse.jdt.ui/java_default_italic=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_method_invocation_arguments=insert
/bundle_defaults/org.eclipse.ui.editors/taskIndicationInVerticalRuler=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_enable_commit_sets=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_binary_expression=16
/instance/org.eclipse.wst.jsdt.ui/org.eclipse.jface.textfont=1|Monospace|10.0|0|GTK|1|;
/bundle_defaults/org.eclipse.jdt.ui/content_assist_lru_history=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.forbiddenReference=error
/bundle_defaults/org.eclipse.ui.editors/linked.focus.overviewruler=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_newresource=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.indent_root_tags=true
/bundle_defaults/org.eclipse.ui.editors/warningIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_colon_in_labeled_statement=insert
/instance/org.eclipse.jdt.ui/useQuickDiffPrefPage=true
/bundle_defaults/org.eclipse.ui.editors/hyperlinksEnabled=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_bracket=do not insert
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.internal.ui.javaeditor.NLSKeyHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unnecessary_casts=true
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.windowMargin.horizontal=12
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_guess_method_arguments=false
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_upper=true
/bundle_defaults/org.eclipse.ui.editors/isDeletionGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_ext_connection_method_proxy=ext
/bundle_defaults/org.eclipse.jdt.ui/packageview.doubleclick=packageview.doubleclick.expands
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_breaks_compare_to_cases=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_colon_in_conditional=insert
/bundle_defaults/org.eclipse.wb.rcp/P_USE_GRID=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.continuation_indentation_for_array_initializer=2
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.MemoryHistoryUnknownColor=114,119,129
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_method_declaration_throws=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.noImplicitStringConversion=warning
/bundle_defaults/org.eclipse.jdt.ui/Refactor.lightweight=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_body_declarations_compare_to_namespace_header=false
/bundle_defaults/org.eclipse.ui.editors/deletionIndicationColor=0,0,0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_template_arguments=insert
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_single_letters=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.redundantNullAnnotation=warning
/bundle_defaults/org.eclipse.cdt.ui/markOccurrences=true
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.internal.ui.text.doctools.doxygen.single=63,95,191
/bundle_defaults/org.eclipse.ui.workbench/ENABLE_COOL_BARS=true
/bundle_defaults/org.eclipse.egit.ui/findtoolbar_ignore_case=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedMethodInvocation.underline=false
/bundle_defaults/org.eclipse.egit.core/core_streamFileThreshold=52428800
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.AddedLinesRegex=
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.autoboxing.color=171,48,0
/bundle_defaults/org.eclipse.wb.swing/GridBagLayout.gap.row=5
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleProblemWarningBackgroundColor=254,243,218
/bundle_defaults/org.eclipse.wst.jsdt.ui/importsOnPaste=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_after_annotation=insert
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.PREF_CHANGED_VALUE_BACKGROUND=255,255,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.undocumentedEmptyBlock=ignore
/bundle_defaults/org.eclipse.ui.editors/overviewRuler=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/closeJavaDocs=true
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Navigation.SmartHomeEnd=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/markLocalVariableOccurrences=true
/bundle_defaults/org.eclipse.ui.editors/bookmarkIndicationHighlighting=false
/bundle_defaults/org.eclipse.ui.editors/linked.target.highlight=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_in_empty_enum_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_bracket_in_array_reference=do not insert
/bundle_defaults/org.eclipse.ui.ide/BOOKMARKS_FILTERS_MIGRATE=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_base_types=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_parameters_in_constructor_declaration=16
/bundle_defaults/org.eclipse.team.cvs.ui/pref_update_prompt=never
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_annotation_type_member_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.ui/content_assist_guess_method_arguments=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_colon_in_labeled_statement=do not insert
/bundle_defaults/org.eclipse.cdt.dsf.gdb/org.eclipse.cdt.dsf.gdb.useRtti=true
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleErrorStreamColor=255,0,0
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_link_italic=false
/bundle_defaults/org.eclipse.rse.core/useDeferredQueries=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_before_field=0
/bundle_defaults/org.eclipse.jdt.ui/content_assist_autoactivation_delay=200
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.specialParameterHidingField=disabled
/bundle_defaults/org.eclipse.cdt.ui/c_string=42,0,255
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_show_on_message=false
/bundle_defaults/org.eclipse.ui.editors/showEnclosedTabs=true
/bundle_defaults/org.eclipse.ui.editors/showEnclosedSpaces=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_body_declarations_compare_to_type_header=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.brace_position_for_block=end_of_line
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.deprecatedMember.underline=false
/bundle_defaults/org.eclipse.wb.rcp/P_DISPLAY_LOCATION_SIZE_HINTS=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.parameterAssignment=ignore
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_unary_operator=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_namespace_declaration=insert
/bundle_defaults/org.eclipse.wb.rcp/P_CONTAINER_GAP_RIGHT=10
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.text.style=NONE
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.fieldPrefixes=
/bundle_defaults/org.eclipse.ui.editors/hyperlinkColor.SystemDefault=true
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.debug.ui.ExpressionView.org.eclipse.jdt.debug.ui.show_static_variables=false
/bundle_defaults/org.eclipse.ui.editors/linked.focus.navigation.next=false
/bundle_defaults/org.eclipse.pde.core/org.eclipse.pde.ui.arch=x86_64
/bundle_defaults/org.eclipse.equinox.p2.ui.sdk.scheduler/remindElapsedTime=30 minutes
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.overviewruler=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.localVariableHiding=ignore
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.interface.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_multiple_fields=16
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_after_package=1
/bundle_defaults/org.eclipse.ui.editors/linked.slave.verticalruler=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedDeclaredThrownExceptionExemptExceptionAndThrowable=enabled
/bundle_defaults/org.eclipse.jdt.ui/java_single_line_comment=63,127,95
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_while=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_autoactivation_triggers_javadoc=@\#
/bundle_defaults/org.eclipse.cdt.ui/c_numbers_bold=false
/bundle_defaults/org.eclipse.ui.editors/infoIndicationHighlighting=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.enabling_tag=@formatter\:on
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.isOccurrenceGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.methodDeclarationName.bold=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_colon_in_default=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.parameterVariable.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.on_save_profile_id=org.eclipse.wst.jsdt.ui.default.save_participant_clean_up_profile
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.clear_blank_lines_in_block_comment=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_for=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_switchstatements_compare_to_cases=true
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debugdefault_watchpoint_suspend_policy=0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.finalParameterBound=warning
/bundle_defaults/org.eclipse.wst.jsdt.ui/JavaEditor.ShowTemporaryProblem=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_constructor_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_before_while_in_do_statement=do not insert
/bundle_defaults/org.eclipse.jdt.ui/cleanup.organize_imports=false
/bundle_defaults/org.eclipse.ui.editors/isChangeGoToPreviousNavigationTarget=false
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.visibilityCheck=enabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_annotation=do not insert
/bundle_defaults/org.eclipse.cdt.ui/c_type=127,0,85
/bundle_defaults/org.eclipse.cdt.ui/markOverloadedOperatorsOccurrences=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_switch=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_in_empty_method_body=insert
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.max_history_size=10
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticMethod.color=0,0,0
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.reuse_editor=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_assignment_bold=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_missing_annotations=true
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_assignment_italic=false
/instance/org.eclipse.wb.core/design.palette.flyout.width=416
@org.eclipse.cdt.debug.core=7.2.0.201302132326
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.overloadedOperator.enabled=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_block_in_case=end_of_line
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.editor.tab.width=4
/bundle_defaults/org.eclipse.wb.swing/stubName=do_${component_name}_${event_name}
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.wrap_before_binary_operator=true
/bundle_defaults/org.eclipse.ui.editors/showFilteredSearchResultInNextPrevDropdownToolbarAction=false
/bundle_defaults/org.eclipse.cdt.core/indexer/skipImplicitReferences=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_catch=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_objlit_initializer=end_of_line
/bundle_defaults/org.eclipse.cdt.ui/CEditor.ShowTemporaryProblem=false
/bundle_defaults/org.eclipse.wb.rcp/nls.renameKeysWithVariables=false
/bundle_defaults/org.eclipse.ui.editors/printMargin=false
/bundle_defaults/org.eclipse.cdt.ui/removeTrailingWhitespace=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.function.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.format_html=true
/instance/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.editor.tab.width=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_switch=end_of_line
/bundle_defaults/org.eclipse.egit.ui/show_rebase_confirm=true
/bundle_defaults/org.eclipse.jdt.ui/spelling_problems_threshold=100
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.localPrefixes=
/bundle_defaults/org.eclipse.ui.editors/writeOccurrenceIndicationColor=240,216,168
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.generateClassFiles=enabled
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticField.italic=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.possibleAccidentalBooleanAssignment=ignore
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.showSourceFilesInBinaries=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.method.enabled=false
/bundle_defaults/org.eclipse.cdt.ui/pp_directive_italic=false
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_value_italic=false
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Color.Background=255,255,255
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.source=1.3
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.ExpressionView+org.eclipse.debug.ui.ShowTypeNamesAction=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_in_empty_enum_constant=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_keyword_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.always_use_this_for_non_static_method_access=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_method_name_bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_before_member_type=1
/bundle_defaults/org.eclipse.jdt.ui/java_multi_line_comment_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/handleTemporaryProblems=true
/bundle_defaults/org.eclipse.cdt.ui/c_multi_line_comment=63,127,95
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.overviewruler=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_in_empty_annotation_declaration=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_between_empty_parens_in_exception_specification=do not insert
/bundle_defaults/org.eclipse.cdt.core/useStructualParseMode=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_block=end_of_line
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.editor.tab.width=4
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.generateClassFiles=enabled
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_single_line_comment_italic=false
/bundle_defaults/org.eclipse.ui.editors/javaScriptIsOverrideIndicatorGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.ui.editors/warningTextStyle=PROBLEM_UNDERLINE
/bundle_defaults/org.eclipse.ui.workbench/OPEN_AFTER_DELAY=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.objectInitializer.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_annotation=100,100,100
/bundle_defaults/org.eclipse.wb.swing/textVariable.template=${class_acronym}${text}
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_default_italic=false
/bundle_defaults/org.eclipse.cdt.ui/c_type_italic=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.label.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.compresspackagenames=false
/bundle_defaults/org.eclipse.ui.ide/BOOKMARKS_LIMIT=100
/bundle_defaults/org.eclipse.ui.editors/writeOccurrenceHighlighting=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.method.enabled=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.parameterVariable.color=0,0,0
/bundle_defaults/org.eclipse.debug.ui/org.eclispe.debug.ui.memory.pageSize=20
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_after_template_declaration=do not insert
/bundle_defaults/org.eclipse.equinox.p2.ui.sdk/showLatestVersion=true
/bundle_defaults/org.eclipse.debug.core/org.eclipse.debug.core.PREF_BREAKPOINT_MANAGER_ENABLED_STATE=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.never_indent_block_comments_on_first_column=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.pkgNameAbbreviationPatternForPackagesView=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.discouragedReference=warning
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_explicitconstructorcall_arguments=insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.parameterVariable.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_anonymous_type_declaration=insert
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.constant.capitalization=1
/bundle_defaults/org.eclipse.ui.editors/showRevisionAnnotationInNextPrevDropdownToolbarAction=false
/bundle_defaults/org.eclipse.cdt.debug.ui/booleanPreference=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.browsing.packagestoeditor=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.number.color=42,0,255
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_annotation_on_type=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_operator=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.camelCaseMatch=enabled
/bundle_defaults/org.eclipse.jdt.ui/java_keyword_return_bold=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_enum_constants=0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.globalVariable.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.noEffectAssignment=warning
/bundle_defaults/org.eclipse.cdt.ui/c_default=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_enum_constant=end_of_line
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedField.strikethrough=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.externalSDK.underline=false
/bundle_defaults/org.eclipse.cdt.ui/pp_default=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.method.underline=false
/bundle_defaults/org.eclipse.jdt.ui/escapeStrings=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.codegen.inlineJsrBytecode=disabled
/bundle_defaults/org.eclipse.ui.editors/matchingTagVerticalRuler=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_arguments_in_method_invocation=16
/bundle_defaults/org.eclipse.jdt.ui/java_multi_line_comment_italic=false
/instance/org.eclipse.mylyn.tasks.ui/org.eclipse.mylyn.tasks.ui.filters.nonmatching=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.outColor=0,0,0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_template_parameters=insert
/bundle_defaults/org.eclipse.ui.editors/linked.target.text=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_repositories_are_binary=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractClass.enabled=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.color=70,100,165
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariableDeclaration.italic=false
/instance/org.eclipse.wst.jsdt.ui/fontPropagated=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_body_declarations_compare_to_annotation_declaration_header=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_while=do not insert
/bundle_defaults/org.eclipse.core.resources/description.maxfilestatesize=1048576
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_cast=do not insert
/bundle_defaults/org.eclipse.egit.ui/decorator_show_assume_valid_icon=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.method.color=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.wizards.srcBinFoldersInNewProjects=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_while=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_superinterfaces_in_type_declaration=16
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.clear_blank_lines_in_block_comment=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_switchstatements_compare_to_switch=false
/bundle_defaults/org.eclipse.jdt.ui/smart_tab=true
/bundle_defaults/org.eclipse.ui/LINK_NAVIGATOR_TO_EDITOR=false
/bundle_defaults/org.eclipse.cdt.ui/spelling_problems_threshold=100
/bundle_defaults/org.eclipse.ui.editors/showTrailingTabs=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_type_declaration=insert
/bundle_defaults/org.eclipse.wb.swing/GridBagLayout.changeInsets.forGaps=true
/configuration/org.eclipse.core.net/org.eclipse.core.net.hasMigrated=true
/bundle_defaults/org.eclipse.wb.swing/property.events.stubDelete=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_completion_replacement_foreground=255,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_block_in_case=end_of_line
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.namespace.underline=false
/bundle_defaults/org.eclipse.ui.editors/infoIndicationInVerticalRuler=true
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.compress_folders=true
/bundle_defaults/org.eclipse.jdt.ui/spelling_locale=en_US
/bundle_defaults/org.eclipse.ui.editors/linked.exit.navigation.dropdown=false
/bundle_defaults/org.eclipse.cdt.ui/c_default_bold=false
/bundle_defaults/org.eclipse.ui.editors/unchangedIndication=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_postfix_operator=do not insert
/instance/org.eclipse.ui.editors/overviewRuler_migration=migrated_3.1
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.show_debug_perspective_default=org.eclipse.debug.ui.DebugPerspective
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.use_this_for_non_static_field_access_only_if_necessary=true
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Accessibility.UseCustomCarets=true
/bundle_defaults/org.eclipse.ui.editors/errorIndicationColor=255,0,128
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_bracket_italic=false
/bundle_defaults/org.eclipse.wb.core/editor.gotoComponentDefinitionOnSelection=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_throws_clause_in_method_declaration=16
/bundle_defaults/org.eclipse.ui.editors/javaScriptOccurrenceIndicationColor=212,212,212
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariableDeclaration.color=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/c_braces_bold=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticMethodInvocation.enabled=true
/bundle_defaults/org.eclipse.ui.editors/showBookmarkInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_arguments_in_qualified_allocation_expression=16
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_catch=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_method_declaration_parameters=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_before_catch_in_try_statement=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.keep_imple_if_on_one_line=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_synchronized=do not insert
/bundle_defaults/org.eclipse.cdt.ui/function_output_parameters_before_input=false
/bundle_defaults/org.eclipse.ui.editors/changeIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.methodDeclarationName.italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.computeJavaBuildOrder=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.typeParameterHiding=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_catch=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_postfix_operator=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_after_imports=1
/bundle_defaults/org.eclipse.ui.editors/occurrenceIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_enum_constant=insert
/bundle_defaults/org.eclipse.egit.ui/sync_view_changeset_pattern=[{author}] ({date}) {short_message}
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.builder.duplicateResourceTask=warning
/instance/org.eclipse.m2e.discovery/org.eclipse.m2e.discovery.pref.projects=
/bundle_defaults/org.eclipse.team.cvs.ui/pref_dirty_flag=>
/bundle_defaults/org.eclipse.jdt.ui/java_doc_default_bold=false
@org.eclipse.pde.core=3.8.1.v20130115-200504
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.possibleAccidentalBooleanAssignment=ignore
/bundle_defaults/org.eclipse.wb.rcp/P_CONTAINER_GAP_LEFT=10
/bundle_defaults/org.eclipse.ui.editors/spellingIndicationHighlighting=false
/bundle_defaults/org.eclipse.ui.editors/hoverReplaceMode=0
/bundle_defaults/org.eclipse.wb.swing/layout.inheritLayoutOfParent=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_binary_expression=16
/bundle_defaults/org.eclipse.jdt.ui/content_assist_show_visible_proposals=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.make_variable_declarations_final=false
/bundle_defaults/org.eclipse.jdt.ui/java_default=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.invalidJavadocTagsNotVisibleRef=disabled
/bundle_defaults/org.eclipse.cdt.ui/inactiveCodeEnable=true
/bundle_defaults/org.eclipse.ui.editors/linked.exit.navigation.previous=false
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.CappingDisable=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_before_imports=1
/bundle_defaults/org.eclipse.cdt.ui/closeBraces=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingDefaultCase=ignore
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.brace_position_for_method_declaration=end_of_line
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.deprecatedMember.italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.suppressOptionalErrors=disabled
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.SaveAllEditors=false
/bundle_defaults/org.eclipse.wb.rcp/P_CREATION_FLOW=false
/instance/org.eclipse.debug.core//org.eclipse.debug.core.PREFERRED_DELEGATES/org.eclipse.cdt.launch.applicationLaunchType=org.eclipse.cdt.dsf.gdb.launch.localCLaunch,debug;org.eclipse.cdt.cdi.launch.localCLaunch,run
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.argumentPrefixes=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_and_in_type_parameter=insert
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.source=1.5
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.changedDebugElement=255,0,0
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.writeOccurrenceHighlighting=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_expressions_in_array_initializer=16
/bundle_defaults/org.eclipse.ui.ide/USE_MARKER_LIMITS=true
/bundle_defaults/org.eclipse.ui.ide/CLOSE_UNRELATED_PROJECTS=false
/bundle_defaults/org.eclipse.jdt.ui/content_assist_proposals_background=255,255,255
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariable.strikethrough=false
/bundle_defaults/org.eclipse.egit.ui/HistoryView_MaxNumberOfCommmits=10000
/bundle_defaults/org.eclipse.team.cvs.ui/pref_groupbydate_mode=true
/bundle_defaults/org.eclipse.wb.rcp/org.eclipse.wb.rcp.forms\:\ paint\ borders\ for=true
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleProblemHighlightedColor=255,0,0
/bundle_defaults/org.eclipse.ui.workbench/STICKY_CYCLE=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_body_declarations_compare_to_enum_constant_header=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.autoboxing.italic=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_assignment_operator=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_colon_in_conditional=insert
/bundle_defaults/org.eclipse.cdt.debug.ui/org.eclipse.cdt.debug.ui.disassembly.showInstructions=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_angle_bracket_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_declarator_list=do not insert
/bundle_defaults/org.eclipse.wb.rcp/TableWrapLayout.enableGrab=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.format_line_comments=true
/bundle_defaults/org.eclipse.jdt.ui/editor_folding_enabled=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariableDeclaration.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_category_order=org.eclipse.wst.jsdt.ui.spellingProposalCategory\:65545\u0000org.eclipse.wst.jsdt.ui.javaTypeProposalCategory\:65540\u0000org.eclipse.wst.jsdt.ui.javaNoTypeProposalCategory\:65539\u0000org.eclipse.wst.jsdt.ui.textProposalCategory\:65541\u0000org.eclipse.wst.jsdt.ui.templateProposalCategory\:2\u0000
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_colon_in_case=do not insert
/bundle_defaults/org.eclipse.ui.editors/isSearchResultGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_enum_constant=end_of_line
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_angle_bracket_in_template_parameters=do not insert
file_export_version=3.0
/bundle_defaults/org.eclipse.team.cvs.ui/pref_filetext_decoration={outgoing_change_flag}{name}  {revision} {tag}
/bundle_defaults/org.eclipse.egit.ui/HistoryView_MaxTagLength=15
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.openTypeHierarchy=viewPart
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.class.bold=false
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.8
/bundle_defaults/org.eclipse.ui.editors/searchResultIndication=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_compact_if=16
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_default_functions=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.computeJavaBuildOrder=ignore
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.compact_else_if=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_bracket_in_array_reference=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingEnumCaseDespiteDefault=disabled
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.step_thru_filters=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractMethodInvocation.italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedPrivateMember=warning
/bundle_defaults/org.eclipse.debug.ui/Variables.detail.orientation=Variables.detail.orientation.underneath
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.templateParameter.bold=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.deprecatedMember.bold=false
/bundle_defaults/org.eclipse.cdt.ui/c_string_italic=false
/bundle_defaults/org.eclipse.ui.editors/isOccurrenceGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/content_assist_proposal_filter=0;<Default Filter>
/bundle_defaults/org.eclipse.ui.editors/showSearchResultInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.specialParameterHidingField=disabled
/bundle_defaults/org.eclipse.debug.ui/org.eclpise.debug.ui.memory.dynamicLoad=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.ignorelowercasenames=true
/bundle_defaults/org.eclipse.wst.web/org.eclipse.jst.j2ee.preference.staticWebContentName=WebContent
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticMethodInvocation.bold=false
/bundle_defaults/org.eclipse.jdt.ui/JavaUI.update=JavaUI.update.whileEditing
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.browsing.projectstoeditor=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariableDeclaration.italic=false
/bundle_defaults/org.eclipse.ui.editors/indexResultIndicationColor=254,155,0
/bundle_defaults/org.eclipse.team.cvs.ui/pref_save_dirty_editors=2
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.never_use_blocks=false
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_digits=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.max_detail_length=10000
/bundle_defaults/org.eclipse.team.cvs.ui/pref_confirm_move_tag=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_for=do not insert
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.ShowPseudoConflicts=false
/bundle_defaults/org.eclipse.ui.ide/WELCOME_DIALOG=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_for_increments=do not insert
/bundle_defaults/org.eclipse.jdt.ui/content_assist_parameters_background=255,255,255
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariable.bold=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticFinalField.strikethrough=false
/bundle_defaults/org.eclipse.jdt.ui/java_annotation_bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.deadCode=warning
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_for_increments=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.taskCaseSensitive=false
@org.eclipse.wb.core=1.5.2.r42x201302111859
/bundle_defaults/org.eclipse.wb.rcp/general.directEditAfterAdd=true
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.HighlightTokenChanges=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_body_declarations_compare_to_enum_declaration_header=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedLocal=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.taskTags=TODO,FIXME,XXX
/bundle_defaults/org.eclipse.wb.swing/general.showTextPropertySuffix=true
/bundle_defaults/org.eclipse.ui.editors/whitespaceCharacterAlphaValue=80
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Color.Foreground=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/java_comment_task_tag_italic=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticField.underline=false
/bundle_defaults/org.eclipse.ui.editors/javaScriptOccurrenceHighlighting=true
/bundle_defaults/org.eclipse.wb.core/common.addChosenComponentsToPalette=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_switch=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_in_empty_type_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_enum_constant_arguments=do not insert
/instance/org.eclipse.wst.jsdt.ui/useAnnotationsPrefPage=true
/bundle_defaults/org.eclipse.cdt.ui/content_assist_autoactivation_trigger_arrow=true
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
/bundle_defaults/org.eclipse.wb.rcp/org.eclipse.wb.rcp.preferencePage\:\ use\ usual\ code\ generation\ style=false
/bundle_defaults/org.eclipse.ui.editors/warningIndicationColor=244,200,45
/bundle_defaults/org.eclipse.wst.jsdt.ui/closeBrackets=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.keep_imple_if_on_one_line=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_switch=do not insert
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.IgnoreWhitespace=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocTagsVisibility=public
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_bracket_in_array_allocation_expression=do not insert
/instance/org.eclipse.jdt.debug.ui/org.eclipse.debug.ui.VariableView.org.eclipse.jdt.debug.ui.show_null_entries=true
/bundle_defaults/org.eclipse.ui.editors/javaScriptOverrideIndicatorColor=180,207,205
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.staticFieldSuffixes=
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeArgument.underline=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_exception_specification=do not insert
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.percentOffset.vertical=6
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.methodDeclaration.strikethrough=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_at_end_of_file_if_missing=do not insert
/bundle_defaults/org.eclipse.ui.editors/linked.target.overviewruler=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enum.strikethrough=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.function.underline=false
/bundle_defaults/org.eclipse.core.resources/description.maxfilestates=50
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.editor.showSegments=false
/bundle_defaults/org.eclipse.ui.editors/breakpointTextStyle=SQUIGGLES
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_explicitconstructorcall_arguments=do not insert
/bundle_defaults/org.eclipse.ui.editors/additionIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_conditional_expression=80
/bundle_defaults/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.corecDebug.Disassembly.instructionStepOn=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.cdt.ui/c_multi_line_comment_italic=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_member_access=0
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.navigation.previous=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.nullReference=warning
/bundle_defaults/org.eclipse.ui.editors/showDeletionInNextPrevDropdownToolbarAction=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_autoactivation_triggers_java=.
/bundle_defaults/org.eclipse.cdt.debug.ui/org.eclipse.cdt.debug.ui.disassembly.openNoSourceInfo=true
/instance/org.eclipse.mylyn.monitor.ui/org.eclipse.mylyn.monitor.activity.tracking.enabled.checked=true
/bundle_defaults/org.eclipse.ui.editors/additionIndication=false
/bundle_defaults/org.eclipse.ui.editors/linked.exit.highlight=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/packageview.doubleclick=packageview.doubleclick.expands
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_array_initializer=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_operator_bold=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.class.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_before_package=0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroSubstitution.bold=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_binary_operator=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_template_parameters=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.localPrefixes=
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.method.suffix=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.infer.useInitMethod=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.class.underline=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariable.italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_statements_compare_to_body=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.insert_new_line_before_root_tags=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.deprecationCheck=disabled
/bundle_defaults/org.eclipse.jdt.ui/markConstantOccurrences=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_determine_server_version=true
@org.eclipse.jdt.debug.ui=3.6.100.v20120530-1425
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_default_comments=false
/bundle_defaults/org.eclipse.core.resources/encoding=
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_before_colon_in_constructor_initializer_list=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedField.bold=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_commit_with_warning=always
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_between_empty_parens_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.ui.workbench/ENABLE_NEW_MENUS=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.globalVariable.color=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedLabel=warning
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_hex=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.navigation.next=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_binary_operator=insert
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.occurrenceIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.ui/editor_folding_provider=org.eclipse.jdt.ui.text.defaultFoldingProvider
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_constructor_declaration=end_of_line
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_while=insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariable.italic=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_missing_methods=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariable.color=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.methodreturntype=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.qualify_static_member_accesses_through_instances_with_declaring_class=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.format_guardian_clause_on_one_line=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.fieldHiding=ignore
/bundle_defaults/org.eclipse.ui/PROJECT_OPEN_NEW_PERSPECTIVE=OPEN_PERSPECTIVE_REPLACE
/instance/org.eclipse.jdt.ui/org.eclipse.jdt.ui.javadoclocations.migrated=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.overridingPackageDefaultMethod=warning
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.editor.showSegments=false
/bundle_defaults/org.eclipse.ui.editors/javaScriptShowoverrideIndicatorInNextPrevDropdownToolbarAction=false
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_notes=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_closing_angle_bracket_in_template_parameters=insert
/bundle_defaults/org.eclipse.ui.editors/javaScriptIsOccurrenceGoToNextNavigationTarget=false
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.compliance=1.5
/bundle_defaults/org.eclipse.ui.editors/secondaryIPIndication=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.problem.enabled=false
/bundle_defaults/org.eclipse.ui.editors/taskIndicationColor=0,128,255
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_keyword_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.doc.comment.support=enabled
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.label.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.tabulation.char=tab
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.deprecatedMember.enabled=true
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleInfoStreamColor=0,0,255
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.method.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.use_blocks_only_for_return_and_throw=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.writeOccurrenceIndicationColor=240,216,168
@org.eclipse.mylyn.java.ui=3.8.3.v20130107-0100
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enum.color=100,70,50
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_in_empty_block=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.fieldSuffixes=
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_catch=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.enum.enabled=false
/bundle_defaults/org.eclipse.core.resources/snapshots.operations=100
/bundle_defaults/org.eclipse.core.resources/description.applyfilestatepolicy=true
/bundle_defaults/org.eclipse.jdt.ui/java_single_line_comment_bold=false
/bundle_defaults/org.eclipse.jdt.ui/content_assist_disabled_computers=org.eclipse.jdt.ui.textProposalCategory\u0000org.eclipse.jdt.ui.javaTypeProposalCategory\u0000org.eclipse.jdt.ui.javaNoTypeProposalCategory\u0000
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_for_increments=insert
/bundle_defaults/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.corecDebug.non_wide_character_set=UTF-8
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.relaunch_in_debug_mode=never
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariableDeclaration.strikethrough=false
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.suspend_on_compilation_errors=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticMethod.underline=false
/bundle_defaults/org.eclipse.egit.ui/refesh_on_index_change=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_body_declarations_compare_to_enum_declaration_header=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_compact_if=16
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedField.color=0,0,192
/bundle_defaults/org.eclipse.wb.core/editor.layout.syncDelay=1000
/bundle_defaults/org.eclipse.ui.editors/filteredSearchResultIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_lru_history=
/bundle_defaults/org.eclipse.jdt.ui/wrapStrings=true
/bundle_defaults/org.eclipse.jdt.ui/editor_folding_default_methods=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.forbiddenReferenceCheck=enabled
/bundle_defaults/org.eclipse.core.resources/description.autobuilding=true
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.debug.sourceFile=generate
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_bracket_bold=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.cdt.debug.ui/choicePreference=choice2
/bundle_defaults/org.eclipse.core.resources/delta.expiration=2592000000
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_rev_detail=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.parameterVariable.color=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_assignment=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.taskPriorities=NORMAL,HIGH,NORMAL
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_parameters_foreground=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/scalability.numberOfLines=5000
/bundle_defaults/org.eclipse.jdt.ui/importsOnPaste=true
/bundle_defaults/org.eclipse.egit.core/core_autoShareProjects=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.keep_then_statement_on_same_line=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_closing_paren_in_cast=insert
/bundle_defaults/org.eclipse.jdt.ui/content_assist_proposals_foreground=49,55,57
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_superinterfaces_in_enum_declaration=16
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.enable.visibility.order=false
/bundle_defaults/org.eclipse.ui.editors/linked.slave.color=180,215,255
/instance/org.eclipse.pde.core/platform_path=/home/garrett/eclipse
/bundle_defaults/org.eclipse.ui.ide/useSeparator.help.group.updates=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.nonExternalizedStringLiteral=ignore
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.setter.prefix=set
/bundle_defaults/org.eclipse.wb.core/editor.maximizeOnDesignPage=false
/bundle_defaults/org.eclipse.jdt.ui/content_assist_case_sensitivity=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_expression_list=do not insert
/bundle_defaults/org.eclipse.ui.editors/linked.target.navigation.dropdown=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unused_imports=true
/bundle_defaults/org.eclipse.jdt.apt.core/org.eclipse.jdt.apt.reconcileEnabled=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_assignment=16
/bundle_defaults/org.eclipse.jdt.ui/cleanup.qualify_static_field_accesses_with_declaring_class=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_parameterized_type_reference=insert
/bundle_defaults/org.eclipse.wb.rcp/org.eclipse.wb.rcp.forms\:\ adapt\ new\ controls=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotationElementReference.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_key_italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_synchronized=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.forbiddenReference=error
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_assignment_operator=insert
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_mixed=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.reportMethodCanBeStatic=ignore
/instance/org.eclipse.cdt.ui/useAnnotationsPrefPage=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_semicolon_in_for=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_colon_in_object_initializer=insert
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_thread_group_info=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.methodDeclarationName.italic=false
/bundle_defaults/org.eclipse.wb.swing/P_COMPONENT_GAP_RIGHT=6
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.remove_breakpoints_from_container_prompt=true
/bundle_defaults/org.eclipse.ui.editors/showCarriageReturn=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_type_arguments=insert
/bundle_defaults/org.eclipse.cdt.ui/content_assist_autoactivation_trigger_dot=true
/bundle_defaults/org.eclipse.ui.editors/linked.focus.text.style=BOX
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.deprecatedMember.italic=false
/bundle_defaults/org.eclipse.cdt.ui/c_numbers=0,0,0
/instance/org.eclipse.ui.workbench/ENABLED_DECORATORS=org.eclipse.jst.ws.jaxws.dom.integration.navigator.WebServiceDecorator\:true,org.eclipse.wst.server.ui.decorator\:false,org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.DependencyDecoration\:true,org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.ColumnDecoration\:true,org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.ForeignKeyDecoration\:true,org.eclipse.datatools.connectivity.sqm.core.internal.ui.explorer.IndexTriggerDecoration\:true,org.eclipse.datatools.connectivity.internal.core.ui.bookmarkDecoration\:true,org.eclipse.datatools.connectivity.internal.core.ui.FilterNodeDecoration\:true,org.eclipse.datatools.connectivity.ui.decorator.contentextension\:false,org.eclipse.datatools.enablement.ingres.ui.providers.decorators.SynonymDecorationService\:true,org.eclipse.datatools.enablement.ingres.internal.ui.providers.decorators.ParameterDecorationService\:true,org.eclipse.datatools.enablement.sybase.asa.proxytabledecorator\:true,org.eclipse.datatools.enablement.sybase.ase.webservicetabledecorator\:true,org.eclipse.datatools.enablement.sybase.systemtabledecorator\:true,org.eclipse.egit.ui.internal.decorators.GitLightweightDecorator\:true,org.eclipse.jdt.ui.override.decorator\:true,org.eclipse.jdt.ui.interface.decorator\:false,org.eclipse.jdt.ui.buildpath.decorator\:true,org.eclipse.jst.j2ee.internal.ui.util.AnnotationIconDecorator_ejb\:true,org.eclipse.jst.j2ee.navigator.internal.J2EEProjectDecorator\:true,org.eclipse.jst.jee.ui.internal.navigator.ejb.BeanDecorator\:true,org.eclipse.jst.jee.navigator.internal.JEEProjectDecorator\:true,org.eclipse.jst.j2ee.internal.ui.util.AnnotationIconDecorator_servlet\:true,org.eclipse.jst.servlet.ui.Decorator\:true,org.eclipse.mylyn.context.ui.decorator.interest\:true,org.eclipse.mylyn.tasks.ui.decorators.task\:true,org.eclipse.mylyn.team.ui.changeset.decorator\:true,org.eclipse.pde.ui.binaryProjectDecorator\:false,org.eclipse.rse.core.virtualobject.decorator\:true,org.eclipse.rse.core.binary.executable.decorator\:true,org.eclipse.rse.core.script.executable.decorator\:true,org.eclipse.rse.core.java.executable.decorator\:true,org.eclipse.rse.core.library.decorator\:true,org.eclipse.rse.core.link.decorator\:true,org.eclipse.rse.subsystems.error.decorator\:true,org.eclipse.team.cvs.ui.decorator\:true,org.eclipse.ui.LinkedResourceDecorator\:true,org.eclipse.ui.VirtualResourceDecorator\:true,org.eclipse.ui.ContentTypeDecorator\:true,org.eclipse.ui.ResourceFilterDecorator\:false,org.eclipse.wst.jsdt.ui.override.decorator\:true,org.eclipse.wst.server.ui.navigatorDecorator\:true,
/bundle_defaults/org.eclipse.wb.discovery.ui/contributeWizardEntries=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticMethodInvocation.strikethrough=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_array_initializer=end_of_line
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_command_color=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_angle_bracket_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.ui/SHOW_TEXT_ON_PERSPECTIVE_BAR=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_string_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.methodDeclarationName.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_method_name=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticField.bold=false
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.sychronizing_default_participant=none
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.overrideannotation=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticField.strikethrough=false
/bundle_defaults/org.eclipse.ui.editors/linked.target.navigation.previous=false
/bundle_defaults/org.eclipse.ui.editors/searchResultIndicationColor=206,204,247
/bundle_defaults/org.eclipse.ui/DOCK_PERSPECTIVE_BAR=topLeft
/bundle_defaults/org.eclipse.ui.editors/isOverrideIndicatorGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.egit.ui/default_repository_dir=/home/garrett/git
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.maxProblemPerUnit=100
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_colon_in_case=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractClass.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_empty_parens_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.ui.workbench/SINGLE_CLICK_METHOD=0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.keep_empty_array_initializer_on_one_line=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_colon_in_conditional=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_compact_if=16
/bundle_defaults/org.eclipse.debug.ui/DEBUG.consoleOpenOnErr=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_method_declaration_throws=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.path_canonicalization=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.incompatibleJDKLevel=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.classpath.exclusionPatterns=enabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.forceImplicitQualification=disabled
/bundle_defaults/org.eclipse.ui.editors/matchingTagHighlight=true
/bundle_defaults/org.eclipse.ui.workbench/ENABLED_DECORATORS=
/bundle_defaults/org.eclipse.jdt.ui/java_method_name=0,0,0
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.cancel_launch_with_compile_errors=prompt
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.prompt_delete_conditional_breakpoint=true
/bundle_defaults/org.eclipse.ui.editors/searchResultHighlighting=true
/bundle_defaults/org.eclipse.ui.editors/quickdiff.quickDiff=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_binary_expression=16
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.occurrenceIndication=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariable.bold=false
/bundle_defaults/org.eclipse.jdt.ui/java_operator_italic=false
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_argument_italic=false
/bundle_defaults/org.eclipse.debug.core/org.eclipse.debug.core.PREF_ENABLE_STATUS_HANDLERS=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.label.enabled=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_at_in_annotation=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_constructor_declaration_parameters=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotationElementReference.italic=false
/bundle_defaults/org.eclipse.pde.core/target_platform_realization=true
/bundle_defaults/org.eclipse.wb.rcp/formLayout.keepAttachmentsStyle=false
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve
/bundle_defaults/org.eclipse.cdt.ui/spelling_user_dictionary_encoding=UTF-8
/bundle_defaults/org.eclipse.ui.editors/revisionRulerShowAuthor=false
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_java_strings=true
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.abbreviatepackagenames=false
/bundle_defaults/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.corecDebug.max_number_of_instructions=100
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.codegen.targetPlatform=1.2
/bundle_defaults/org.eclipse.ui/ENABLE_DETACHED_VIEWS=true
/bundle_defaults/org.eclipse.cdt.core/indexer/skipReferences=false
/bundle_defaults/org.eclipse.ui.editors/useQuickDiffPrefPage=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.taskTags=TODO,FIXME,XXX
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.SynchronizeScrolling=true
/bundle_defaults/org.eclipse.wb.swing/general.topBoundsDefaultWidth=450
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_angle_bracket_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.jdt.apt.core/org.eclipse.jdt.apt.aptEnabled=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotationElementReference.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.make_parameters_final=false
/bundle_defaults/org.eclipse.cdt.ui/c_single_line_comment_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_annotation_type_member_declaration=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.ui.editors/infoTextStyle=SQUIGGLES
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.keep_then_statement_on_same_line=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.invalidJavadocTags=disabled
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indentation.size=4
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_assignment=0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_angle_bracket_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.incompatibleJDKLevel=ignore
/configuration/org.eclipse.ui.ide/MAX_RECENT_WORKSPACES=5
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_completion_replacement_background=255,255,0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.use_tabs_only_for_leading_indentations=false
/bundle_defaults/org.eclipse.ui.editors/secondaryIPHighlight=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_selector_in_method_invocation=16
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_annotation_type_declaration=end_of_line
/bundle_defaults/org.eclipse.cdt.core/indexer/indexerId=org.eclipse.cdt.core.fastIndexer
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.lineSplit=80
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_statements_compare_to_block=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.keep_then_statement_on_same_line=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.activate_debug_view=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_commit_comments_max_history=10
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_cast=do not insert
/bundle_defaults/org.eclipse.egit.ui/decorator_filetext_decoration={dirty\:>} {name}
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.VariableView+org.eclipse.debug.ui.ShowDetailPaneAction=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.UseContextualLaunch=true
/bundle_defaults/org.eclipse.cdt.ui/subWordNavigation=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.showOccurrenceInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.number_of_blank_lines_at_beginning_of_method_body=0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.finallyBlockNotCompletingNormally=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_bracket_in_array_reference=do not insert
/bundle_defaults/org.eclipse.jdt.ui/java_method_name_italic=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.class.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_keyword=127,159,191
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.header.capitalization=0
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.ondemandthreshold=99
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_superinterfaces=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariableDeclaration.color=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.deprecatedMember.color=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/inactiveCodeColor=224,224,224
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.browsing.stackVertically=false
/bundle_defaults/org.eclipse.wb.swing/general.directEditAfterAdd=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.getter.prefixForBoolean=is
/bundle_defaults/org.eclipse.jdt.ui/autoFormatJavaDocs=false
/bundle_defaults/org.eclipse.ui.ide/IMPORT_FILES_AND_FOLDERS_MODE=prompt
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_additionalrefs=true
/bundle_defaults/org.eclipse.core.net/proxiesEnabled=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_array_initializer=insert
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.javaDebug.alertHCRNotSupported=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticMethod.enabled=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/formatter_profile=org.eclipse.wst.jsdt.ui.default.eclipse_profile
/bundle_defaults/org.eclipse.core.resources/description.filestatelongevity=604800000
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.overrideIndicatorTextStyle=SQUIGGLES
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.sort_members=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.builder.duplicateResourceTask=warning
/bundle_defaults/org.eclipse.cdt.debug.ui/org.eclipse.cdt.debug.ui.cDebug.showHexValues=false
/bundle_defaults/org.eclipse.cdt.ui/spelling_locale=en_US
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_after_opening_brace_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariable.color=0,0,0
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.highlight=false
/bundle_defaults/org.eclipse.wb.swing/textVariable.wordsLimit=3
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_switch=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_synchronized=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.uninitializedGlobalVariable=ignore
/bundle_defaults/org.eclipse.wb.rcp/P_COMPONENT_GAP_BOTTOM=6
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.consoleBackground=255,255,255
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocTagsOverriding=disabled
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.class.color=0,80,50
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.methodDeclarationName.enabled=false
/bundle_defaults/org.eclipse.jdt.ui/java_doc_keyword=127,159,191
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.staticFieldSuffixes=
/bundle_defaults/org.eclipse.ui.editors/bookmarkIndication=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_colon_in_case=insert
/bundle_defaults/org.eclipse.jdt.ui/java_annotation=100,100,100
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.deprecationWhenOverridingDeprecatedMethod=disabled
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.xsd.ui.internal.editor.XSDHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.jdt.ui/cleanup.always_use_blocks=true
/bundle_defaults/org.eclipse.cdt.ui/ensureNewlineAtEOF=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_type_arguments=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.format_source_code=true
/bundle_defaults/org.eclipse.cdt.ui/c_operators=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/java_annotation_italic=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_semicolon=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_colon_in_case=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_bracket_in_array_allocation_expression=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.compact_else_if=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_in_empty_type_declaration=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_disabled_computers=org.eclipse.wst.jsdt.ui.spellingProposalCategory\u0000org.eclipse.wst.jsdt.ui.textProposalCategory\u0000
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.always_use_parentheses_in_expressions=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.internal.ui.javaeditor.JavaElementHyperlinkReturnTypeDetector_stateMask=-1
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_angle_bracket_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.staticAccessReceiver=warning
/bundle_defaults/org.eclipse.jdt.ui/markFieldOccurrences=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.autoboxing.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.qualify_static_member_accesses_through_subtypes_with_declaring_class=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.line_length=80
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.header.suffix=.h
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_while=insert
/bundle_defaults/org.eclipse.ui/ENABLE_ANIMATIONS=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.align_type_members_on_columns=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.new_lines_at_javadoc_boundaries=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_multiple_field_declarations=do not insert
/bundle_defaults/org.eclipse.team.cvs.core/cvs.watch.on.edit=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.methodtypeparametesr=true
/bundle_defaults/org.eclipse.ui.editors/isIndexResultInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.infer.docLocation=1
/bundle_defaults/org.eclipse.ui.editors/errorTextStyle=PROBLEM_UNDERLINE
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_declarator_list=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_annotation=do not insert
/bundle_defaults/org.eclipse.jdt.ui/editor_annotation_roll_over=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_superinterfaces=insert
/bundle_defaults/org.eclipse.core.net/proxyData/SOCKS/port=-1
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.class.color=0,80,50
/bundle_defaults/org.eclipse.jdt.ui/java_doc_tag_italic=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.make_private_fields_final=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_constructor_declaration_parameters=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeParameter.enabled=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.wrap_before_or_operator_multicatch=true
/bundle_defaults/org.eclipse.ui.editors/revisionAnnotationIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.ui.editors/taskIndicationHighlighting=false
/bundle_defaults/org.eclipse.jdt.ui/stickyOccurrences=true
/bundle_defaults/org.eclipse.ui.editors/bookmarkIndicationInVerticalRuler=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.deprecation=warning
/bundle_defaults/org.eclipse.ui.editors/deletionIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_colon_in_for=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.continuation_indentation_for_array_initializer=2
/bundle_defaults/org.eclipse.ui.editors/searchResultTextStyle=NONE
/bundle_defaults/org.eclipse.cdt.ui/scalability.enableAll=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.always_use_this_for_non_static_method_access=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.incompleteClasspath=error
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedImport=warning
/bundle_defaults/org.eclipse.wb.rcp/general.topBoundsDefaultHeight=300
/bundle_defaults/org.eclipse.cdt.ui/scalability.semanticHighlight=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/JavaScriptUI.update=JavaScriptUI.update.whileEditing
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticField.color=0,0,192
/bundle_defaults/org.eclipse.ui/SHOW_OPEN_ON_PERSPECTIVE_BAR=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_before_closing_brace_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_empty_parens_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_prompt_on_mixed_tags=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_angle_bracket_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.wb.swing/P_CONTAINER_GAP_LEFT=10
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_semicolon_in_try_resources=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticFinalField.color=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.debug.localVariable=generate
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeParameter.bold=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.field.strikethrough=false
/bundle_defaults/org.eclipse.jdt.ui/content_assist_fill_method_arguments=true
/bundle_defaults/org.eclipse.wb.core/common.showDebugInfo=false
/bundle_defaults/org.eclipse.ui.editors/spellingIndication=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.debug.ui.hyperlinkdetector.stepIntoSelection_stateMask=327680
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.active_filters=java.lang.ClassLoader
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.debug.lineNumber=generate
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariableDeclaration.enabled=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_added=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_catch=insert
/instance/org.eclipse.ui.ide/TASKS_FILTERS_MIGRATE=true
/bundle_defaults/org.eclipse.ui.editors/hyperlinkKeyModifierMask=262144
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.errorColor=255,0,0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeArgument.color=13,100,0
/bundle_defaults/org.eclipse.wb.rcp/nls.prefixOfPropertyValueToSpecifyThatItIsKey=*
/bundle_defaults/org.eclipse.ui/presentationFactoryId=org.eclipse.ui.presentations.default
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.use_blocks=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeArgument.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.indirectStaticAccess=ignore
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.methodDeclaration.bold=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_autoinsert=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticField.underline=false
/bundle_defaults/org.eclipse.ui/ALTERNATE_OPEN_NEW_PERSPECTIVE=OPEN_PERSPECTIVE_REPLACE
/bundle_defaults/org.eclipse.ui.editors/showChangeInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.flatPackagesInPackageExplorer=true
/bundle_defaults/org.eclipse.ui.editors/unchangedIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.build_before_launch=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.use_blocks_only_for_return_and_throw=false
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Color.SelectionForeground.SystemDefault=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_commit_with_errors=prompt
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_if=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.enum.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_enum_constant_arguments=do not insert
/bundle_defaults/org.eclipse.pde.core/checkedVersionPlugins=[savedNone]
/bundle_defaults/org.eclipse.debug.core/org.eclipse.debug.core.USE_STEP_FILTERS=false
/bundle_defaults/org.eclipse.jdt.ui/formatter_profile=org.eclipse.jdt.ui.default.eclipse_profile
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.builder.invalidClasspath=abort
/instance/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.javadoclocations.migrated=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/markExceptionOccurrences=true
/bundle_defaults/org.eclipse.egit.ui/decorator_show_dirty_icon=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_for=insert
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.verticalruler=false
/bundle_defaults/org.eclipse.ui.editors/errorIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.timeoutForParameterNameFromAttachedJavadoc=50
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.default_layout=org.eclipse.team.ui.compressed_layout
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.number.bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.field.italic=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticField.italic=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.fieldSuffixes=
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.keep_else_statement_on_same_line=false
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_sentence=true
/bundle_defaults/org.eclipse.egit.ui/decorator_show_conflicts_icon=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_folding_default_imports=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.camelCaseMatch=enabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_method_declaration_parameters=insert
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.debug.ui.VariableView.org.eclipse.jdt.debug.ui.show_constants=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unnecessaryElse=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_colon_in_labeled_statement=insert
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.assertIdentifier=error
/bundle_defaults/org.eclipse.jdt.ui/cleanup.qualify_static_member_accesses_with_declaring_class=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.packages.cuchildren=true
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_key_bold=false
/instance/org.eclipse.debug.ui/pref_state_memento.org.eclipse.debug.ui.VariableView=<?xml version\="1.0" encoding\="UTF-8"?>\n<VariablesViewMemento org.eclipse.debug.ui.SASH_DETAILS_PART\="159" org.eclipse.debug.ui.SASH_VIEW_PART\="818">\n<PRESENTATION_CONTEXT_PROPERTIES IMemento.internal.id\="org.eclipse.debug.ui.VariableView"/>\n</VariablesViewMemento>
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.source.capitalization=0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.keep_imple_if_on_one_line=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.internal.ui.javaeditor.JavaElementHyperlinkSuperImplementationDetector_stateMask=-1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_question_in_wildcard=do not insert
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.sensitivity=5
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_before_finally_in_try_statement=do not insert
/instance/org.eclipse.wst.jsdt.ui/proposalOrderMigrated=true
/bundle_defaults/org.eclipse.ui.ide/TASKS_LIMIT=100
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_after_imports=1
/bundle_defaults/org.eclipse.wb.swing/GridBagLayout.gap.column=5
/bundle_defaults/org.eclipse.jdt.launching/org.eclipse.jdt.launching.PREF_STRICTLY_COMPATIBLE_JRE_NOT_AVAILABLE=warning
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.widgetOffset.horizontal=6
/bundle_defaults/org.eclipse.core.net/nonProxiedHosts=localhost|127.0.0.1
/bundle_defaults/org.eclipse.jdt.ui/content_assist_prefix_completion=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.parameterVariable.strikethrough=false
/bundle_defaults/org.eclipse.cdt.ui/scalability.reconciler=true
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.navigation.previous=false
/bundle_defaults/org.eclipse.wb.swing/P_DEFAULT_LAF=Metal
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_empty_parens_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.field.bold=false
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_relative_date=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.nullAnnotationInferenceConflict=error
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.occurrenceTextStyle=NONE
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.tabulation.size=4
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.namespace.enabled=false
/bundle_defaults/org.eclipse.ui.editors/showTextHoverAffordance=true
/bundle_defaults/org.eclipse.jdt.ui/linkedPositionColor=121,121,121
/bundle_defaults/org.eclipse.wst.jsdt.ui/markConstantOccurrences=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.staticondemandthreshold=99
/bundle_defaults/org.eclipse.ui.editors/isFilteredSearchResultGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_multi_line_comment_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.wizards.srcBinFoldersSrcName=script
/bundle_defaults/org.eclipse.ui.editors/isBreakpointIndicationGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_comment_bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_between_import_groups=1
/bundle_defaults/org.eclipse.ui.editors/overrideIndicatorInVerticalRuler=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_keyword_bold=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.internal.ui.javaeditor.JavaElementHyperlinkImplementationDetector_stateMask=-1
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.deprecationCheck=disabled
/bundle_defaults/org.eclipse.ui/SHIFT_OPEN_NEW_PERSPECTIVE=OPEN_PERSPECTIVE_REPLACE
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.forceImplicitQualification=disabled
/bundle_defaults/org.eclipse.ui.editors/isUnchangedGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.field.capitalization=4
/bundle_defaults/org.eclipse.ui.editors/writeOccurrenceIndicationInVerticalRuler=false
/profile/file\:\\2fhome\\2fgarrett\\2feclipse\\2fconfiguration\\2f..\\2fp2\\2f/_SELF_/org.eclipse.equinox.p2.ui.sdk.scheduler/migrated34Prefs=true
/instance/org.eclipse.debug.ui/org.eclipse.debug.ui.PREF_LAUNCH_PERSPECTIVES=<?xml version\="1.0" encoding\="UTF-8" standalone\="no"?>\n<launchPerspectives/>\n
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_comment_wrap=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_binary_operator=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_folding_provider=org.eclipse.wst.jsdt.ui.text.defaultFoldingProvider
@org.eclipse.wst.jsdt.ui=1.1.202.v201208171701
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticMethod.italic=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_enum_declarations=do not insert
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.restoreStateFromCache=true
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_preprocessor_enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.never_use_parentheses_in_expressions=true
/bundle_defaults/org.eclipse.cdt.ui/consoleOnTop=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.source.prefix=
/bundle_defaults/org.eclipse.cdt.ui/content_assist_prefix_completion=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.never_indent_line_comments_on_first_column=false
/bundle_defaults/org.eclipse.ui.editors/currentIPColor=198,219,174
/bundle_defaults/org.eclipse.jdt.ui/java_string=42,0,255
/bundle_defaults/org.eclipse.ui.workbench/RECENT_FILES=4
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_comment_italic=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.text=true
/bundle_defaults/org.eclipse.cdt.ui/closeStrings=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.typedef.enabled=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.use_parentheses_in_expressions=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_sorter=org.eclipse.wst.jsdt.ui.RelevanceSorter
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_allocation_expression=insert
/bundle_defaults/org.eclipse.wb.core/editor.dblClickOnWidgetInTreeAction=0
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.wait_for_build=always
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.brace_position_for_type_declaration=end_of_line
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedParameterWhenImplementingAbstract=disabled
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_rev_split=700,300
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_switchstatements_compare_to_cases=true
/bundle_defaults/org.eclipse.egit.ui/show_initial_config_dialog=true
/bundle_defaults/org.eclipse.cdt.ui/closeBrackets=true
/bundle_defaults/org.eclipse.ui.editors/showLeadingIdeographicSpaces=true
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.classpathVariable.JUNIT_HOME=/home/garrett/eclipse/plugins/org.junit_3.8.2.v3_8_2_v20100427-1100/
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.MemoryHistoryKnownColor=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroSubstitution.italic=false
/bundle_defaults/org.eclipse.ui.editors/changeIndicationColor=204,163,205
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.use_tabs_only_for_leading_indentations=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.packages.cuchildren=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotationElementReference.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.methodDeclarationName.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocTagDescription=return_tag
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.templateParameter.strikethrough=false
/bundle_defaults/org.eclipse.ui.ide/PROBLEMS_LIMIT=100
/bundle_defaults/org.eclipse.wst.jsdt.ui/spacesForTabs=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_empty_lines=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unqualifiedFieldAccess=ignore
/bundle_defaults/org.eclipse.ui.editors/hyperlinkColor=0,0,255
/bundle_defaults/org.eclipse.ui.editors/linked.exit.verticalruler=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.clear_blank_lines_in_javadoc_comment=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_at_end_of_file_if_missing=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_colon_in_labeled_statement=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.taskPriorities=normal
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enumerator.underline=false
/bundle_defaults/org.eclipse.wb.swing/nls.useQualifiedTypeNameForKey=false
/bundle_defaults/org.eclipse.cdt.ui/pp_default_italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_arguments_in_annotation=0
/bundle_defaults/org.eclipse.wb.rcp/P_CONTAINER_GAP_BOTTOM=10
/bundle_defaults/org.eclipse.jdt.ui/content_assist_insert_completion=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_folding_default_headers=true
/bundle_defaults/org.eclipse.wb.swing/GridBagLayout.enableGrab=true
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.show_author_in_compare_editor=false
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.ui.editor.CUChildren=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_use_project_name_on_checkout=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.source.suffix=.cpp
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_unary_operator=do not insert
/instance/org.eclipse.debug.ui/org.eclipse.debug.ui.save_dirty_editors_before_launch=always
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariableDeclaration.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.deprecatedMember.bold=false
/bundle_defaults/org.eclipse.ui.editors/currentIPVerticalRuler=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.LaunchParentProject=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.invalidJavadocTagsDeprecatedRef=disabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_constructor_declaration_parameters=do not insert
/bundle_defaults/org.eclipse.cdt.ui/clearConsole=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_checkout_read_only=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.methodDeclaration.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.maxProblemPerUnit=100
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.label.color=0,0,0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_access_specifier_extra_spaces=0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_colon_in_assert=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_statements_compare_to_block=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_parameters_background=255,255,255
/bundle_defaults/org.eclipse.cdt.ui/smart_tab=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.use_this_for_non_static_field_access=false
/instance/org.eclipse.jdt.ui/proposalOrderMigrated=true
/bundle_defaults/org.eclipse.ui/PROMPT_WHEN_SAVEABLE_STILL_OPEN=true
/bundle_defaults/org.eclipse.wb.rcp/property.events.innerClassPosition=3
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_ellipsis=insert
/bundle_defaults/org.eclipse.cdt.core/build.proj.ref.configs.enabled=false
/bundle_defaults/org.eclipse.jdt.ui/smart_backspace=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedParameterWhenOverridingConcrete=disabled
/bundle_defaults/org.eclipse.egit.ui/StagingView_FileNameMode=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/addJavaDocTags=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.jsdt.web.ui.JSDTHyperlinkDetector.SCRIPT.events_stateMask=-1
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractClass.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_arguments_in_explicit_constructor_call=16
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.nullUncheckedConversion=warning
@org.eclipse.team.cvs.ui=3.3.500.v20120522-1148
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.argumentSuffixes=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_angle_bracket_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.objectInitializer.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.parameterAssignment=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.infer.saveArgumentComments=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.getter.wordDelimiter=
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.make_private_fields_final=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.workspaceLanguageMappings=
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_argument=127,0,85
/bundle_defaults/org.eclipse.jdt.ui/java_keyword_bold=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_enum_declaration=end_of_line
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.wizards.jre.index=0
/bundle_defaults/org.eclipse.ui.editors/linked.focus.highlight=false
/bundle_defaults/org.eclipse.jdt.ui/markMethodExitPoints=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_brackets_in_array_type_reference=do not insert
/bundle_defaults/org.eclipse.ui.editors/searchResultIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.ui.editors/javaScriptOverrideIndicatorInVerticalRuler=true
/bundle_defaults/org.eclipse.ui.editors/spellingTextStyle=PROBLEM_UNDERLINE
/bundle_defaults/org.eclipse.cdt.ui/content_assist_current_file_search_scope=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_body_declarations_compare_to_annotation_declaration_header=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_constructor_declaration=end_of_line
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.verticalruler=false
/bundle_defaults/org.eclipse.jdt.ui/java_keyword_return_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_default=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_annotation=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_expression_list=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.parameterVariable.italic=false
/bundle_defaults/org.eclipse.cdt.dsf.gdb/defaultNonStop=false
/bundle_defaults/org.eclipse.wb.swing/P_CONTAINER_GAP_RIGHT=10
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.overridingMethodWithoutSuperInvocation=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_postfix_operator=do not insert
/bundle_defaults/org.eclipse.cdt.dsf.gdb/org.eclipse.cdt.dsf.gdb.hideRunningThreads=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.finalParameterBound=warning
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unavoidableGenericTypeProblems=enabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_annotation=insert
/bundle_defaults/org.eclipse.ui.ide/useSeparator.help.group.main=true
/bundle_defaults/org.eclipse.jdt.apt.core/org.eclipse.jdt.apt.processorOptions=
/bundle_defaults/org.eclipse.ui.editors/errorIndication=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_closing_brace_in_block=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariableDeclaration.underline=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroSubstitution.enabled=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractClass.color=139,136,22
/bundle_defaults/org.eclipse.ui.editors/breakpointIndication=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.use_parentheses_in_expressions=false
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.UseOutlineView=false
/profile/file\:\\2fhome\\2fgarrett\\2feclipse\\2fconfiguration\\2f..\\2fp2\\2f/_SELF_/org.eclipse.equinox.p2.ui.sdk/allowNonOKPlan=prompt
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.qualify_static_member_accesses_with_declaring_class=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_multiple_field_declarations=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_method_invocation_arguments=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.circularClasspath=error
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.navigation.dropdown=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.namespace.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.never_indent_line_comments_on_first_column=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedTypeArgumentsForMethodInvocation=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_throws_clause_in_constructor_declaration=16
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticField.enabled=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.PREF_FILTER_WORKING_SETS=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.problem.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_angle_bracket_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.ui.workbench/OPEN_PERSPECTIVE_MODE=0
/bundle_defaults/org.eclipse.jdt.ui/closeJavaDocs=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_try=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.number.enabled=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_for=do not insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_auto_refresh_tags_in_tag_selection_dialog=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.rse.core/DEFAULT_PERSISTENCE_PROVIDER=org.eclipse.rse.persistence.MetadataPropertyFileProvider
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enumerator.strikethrough=false
/bundle_defaults/org.eclipse.ui.editors/errorIndicationHighlighting=false
@org.eclipse.ui.workbench=3.104.0.v20130204-164612
/bundle_defaults/org.eclipse.ui.workbench/MULTI_KEY_ASSIST_TIME=1000
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_in_empty_enum_declaration=insert
/instance/org.eclipse.jdt.ui/org.eclipse.jdt.ui.formatterprofiles.version=12
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.compliance=1.4
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedMethodInvocation.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_expressions_in_array_initializer=16
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.method.prefix=
/bundle_defaults/org.eclipse.wb.rcp/useResourceManager=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.qualify_static_method_accesses_with_declaring_class=false
/bundle_defaults/org.eclipse.ui.editors/warn_if_input_derived=true
/bundle_defaults/org.eclipse.ui.editors/javaScriptIsOccurrenceGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_trailing_whitespaces_ignore_empty=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_throws_clause_in_constructor_declaration=16
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.number_of_empty_lines_to_preserve=1
/instance/org.eclipse.wst.ws.service.policy/org.eclipse.wst.ws.service.policy.ui.servicepols.wsiprofilecomp.wsiap.defaultProtocol=http\://schemas.xmlsoap.org/wsdl/soap/
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.use_this_for_non_static_method_access=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingHashCodeMethod=ignore
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.functionDeclaration.color=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedField.enabled=false
/bundle_defaults/org.eclipse.rse.core/CREATE_LOCAL_CONNECTION=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_for=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.field.enabled=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_wrap_comments=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.sort_members_all=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/smart_backspace=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.debug.sourceFile=generate
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_breaks_compare_to_cases=true
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.highlight=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_cvs_rsh_parameters=-l {user} {host}
/bundle_defaults/org.eclipse.rse.ui/MNEMONICS_POLICY=3
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_unsigned=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_for_inits=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_method_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_while=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_method_declaration_parameters=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractMethodInvocation.bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.methodWithConstructorName=warning
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debug.PREF_HCR_WITH_COMPILATION_ERRORS=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_enum_declarations=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.visibilityCheck=disabled
/bundle_defaults/org.eclipse.debug.core/org.eclipse.debug.core.PREF_DELETE_CONFIGS_ON_PROJECT_DELETE=false
/bundle_defaults/org.eclipse.ui.editors/secondaryIPVerticalRuler=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_between_empty_braces_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_before_else_in_if_statement=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticMethodInvocation.underline=false
/bundle_defaults/org.eclipse.ui/SHOW_FILTERED_TEXTS=true
/bundle_defaults/org.eclipse.ui/SHOW_MULTIPLE_EDITOR_TABS=true
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.text=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractClass.italic=false
/bundle_defaults/org.eclipse.ui.editors/isBookmarkGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.ui.editors/occurrenceTextStyle=NONE
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.enum.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_throws_clause_in_method_declaration=16
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractMethodInvocation.strikethrough=false
/bundle_defaults/org.eclipse.wb.rcp/styleProperty.cascadePopup=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticMethod.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_method_name_italic=false
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.RemovedLinesRegex=
/bundle_defaults/org.eclipse.jdt.launching/org.eclipse.jdt.launching.PREF_CONNECT_TIMEOUT=20000
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.add_missing_annotations=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_synchronized=do not insert
/bundle_defaults/org.eclipse.wb.swing/general.importantPropertiesAfterAdd=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.overridingMethodWithoutSuperInvocation=ignore
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedParameterIncludeDocCommentReference=enabled
/bundle_defaults/org.eclipse.cdt.ui/class_member_ascending_visibility_order=false
/bundle_defaults/org.eclipse.egit.ui/findtoolbar_find_in=2
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_angle_bracket_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.wb.swing/P_COMPONENT_GAP_TOP=6
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.history.folder=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_if=insert
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.ui.editor.linkToEditor=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.format_header=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.builder.resourceCopyExclusionFilter=
/bundle_defaults/org.eclipse.ui.editors/showLineFeed=true
/instance/org.eclipse.debug.ui/preferredTargets=default\:default|
/bundle_defaults/org.eclipse.jdt.ui/java_keyword_return=127,0,85
/bundle_defaults/org.eclipse.cdt.ui/matchingBracketsColor=170,170,170
/bundle_defaults/org.eclipse.team.cvs.ui/pref_replace_unmanaged=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariable.underline=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.externalSDK.strikethrough=false
/bundle_defaults/org.eclipse.wb.rcp/P_USE_FREE_MODE=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_before_method=1
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleBackgroundColor=255,255,255
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_single_letters=true
/bundle_defaults/org.eclipse.cdt.ui/c_type_bold=true
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.wizards.srcBinFoldersBinName=bin
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_catch=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.overloadedOperator.strikethrough=false
/bundle_defaults/org.eclipse.egit.ui/decorator_show_untracked_icon=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.join_wrapped_lines=true
/bundle_defaults/org.eclipse.ui.editors/matchingTagIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.ui/java_comment_task_tag_bold=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_serial_version_id=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotation.bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_angle_bracket_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.cdt.dsf.gdb/org.eclipse.cdt.dsf.gdb.commandTimeoutValue=10000
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.discouragedReferenceCheck=disabled
/bundle_defaults/org.eclipse.ui.editors/show_range_indicator=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_annotation_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unresolvedTypeReference=error
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unused_private_types=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.redundantSuperinterface=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.missingJavadocTagsVisibility=default
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.deprecationInDeprecatedCode=disabled
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.methodDeclaration.enabled=true
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_mixed=true
/bundle_defaults/org.eclipse.ui.editors/othersIndication=false
/bundle_defaults/org.eclipse.equinox.p2.ui.sdk.scheduler/remindOnSchedule=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeArgument.italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_parameters_in_method_declaration=16
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.keywordthis=false
/instance/org.eclipse.jdt.ui/org.eclipse.jdt.ui.text.templates_migrated=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.header.wordDelimiter=
/bundle_defaults/org.eclipse.wst.jsdt.ui/JavaEditor.SyncOutlineOnCursorMove=true
/bundle_defaults/org.eclipse.ui.editors/breakpointHighlight=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_auto_share_on_import=true
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.navigation.next=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.memory.rowSize=16
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariableDeclaration.bold=false
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Accessibility.WideCaret=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.method.capitalization=4
/bundle_defaults/org.eclipse.ui.editors/hyperlinkKeyModifier=Ctrl
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedField.italic=false
/bundle_defaults/org.eclipse.ui.editors/isWarningGoToPreviousNavigationTarget=true
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debug._all_references_max_count=100
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.function.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/smart_tab=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.format_javadoc_comments=true
/bundle_defaults/org.eclipse.cdt.ui/pp_directive=127,0,85
/bundle_defaults/org.eclipse.cdt.ui/pp_directive_bold=true
/bundle_defaults/org.eclipse.jdt.ui/sourceHoverBackgroundColor.SystemDefault=true
/bundle_defaults/org.eclipse.cdt.core/indexer/useHeuristicIncludeResolution=true
/bundle_defaults/org.eclipse.ui/EDITOR_TAB_POSITION=128
/bundle_defaults/org.eclipse.cdt.dsf.gdb/initialChildCountLimitForCollections=100
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_arguments_in_enum_constant=16
/bundle_defaults/org.eclipse.ui/disableNewFastView=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.getter.suffix=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_and_in_type_parameter=insert
/bundle_defaults/org.eclipse.jdt.ui/markTypeOccurrences=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.line_length=80
/bundle_defaults/org.eclipse.wb.core/editor.highlightVisitedLines=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.method.italic=false
/bundle_defaults/org.eclipse.ui.editors/linked.exit.text=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_annotation_on_local_variable=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.use_this_for_non_static_method_access_only_if_necessary=true
/bundle_defaults/org.eclipse.ui.editors/unchangedIndicationColor=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_binary_operator=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.format_source_code=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.join_lines_in_comments=true
/bundle_defaults/org.eclipse.core.net/proxyData/SOCKS/hasAuth=false
/bundle_defaults/org.eclipse.cdt.ui/c_operators_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unnecessaryElse=ignore
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.staticondemandthreshold=99
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedObjectAllocation=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unqualifiedFieldAccess=ignore
/bundle_defaults/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.corecDebug.character_set=UTF-32
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_default_italic=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.never_use_parentheses_in_expressions=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.convert_to_enhanced_for_loop=false
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Color.SelectionBackground.SystemDefault=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingSerialVersion=warning
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.brace_position_for_namespace_declaration=end_of_line
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_all_branches=false
/bundle_defaults/org.eclipse.cdt.ui/c_braces_italic=false
/bundle_defaults/org.eclipse.jdt.ui/editor_folding_default_javadoc=false
/bundle_defaults/org.eclipse.ui/EDITOR_MINIMUM_CHARACTERS=-1
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.lineSplit=80
/bundle_defaults/org.eclipse.cdt.ui/hoverModifierMasks=org.eclipse.cdt.ui.BestMatchHover;0;org.eclipse.cdt.ui.CSourceHover;131072
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.overloadedOperator.italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_resources_in_try=80
/bundle_defaults/org.eclipse.jdt.ui/java_operator=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_before_imports=1
/bundle_defaults/org.eclipse.ui.editors/matchingTagIndication=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.wrap_outer_expressions_when_nested=true
/instance/org.eclipse.jdt.ui/org.eclipse.jdt.ui.text.custom_code_templates=<?xml version\="1.0" encoding\="UTF-8" standalone\="no"?><templates/>
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_closing_paren_in_cast=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_synchronized=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_bracket_in_array_allocation_expression=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.format_guardian_clause_on_one_line=false
/bundle_defaults/org.eclipse.wb.rcp/P_GRID_STEP_Y=5
/bundle_defaults/org.eclipse.wb.rcp/P_GRID_STEP_X=5
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.writeOccurrenceIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_unary_operator=do not insert
@org.eclipse.ui.ide=3.8.2.v20121106-165923
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.deprecationWhenOverridingDeprecatedMethod=disabled
/bundle_defaults/org.eclipse.team.cvs.ui/pref_include_change_sets=never
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debug.all_instances_max_count=100
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.keep_empty_objlit_initializer_on_one_line=false
/bundle_defaults/org.eclipse.wb.rcp/TableWrapLayout.enableRightAlignment=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.templateParameter.italic=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.label.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.invalidJavadocTags=disabled
/bundle_defaults/org.eclipse.team.cvs.ui/pref_lineend=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.autoboxing.underline=false
/bundle_defaults/org.eclipse.jdt.ui/content_assist_sorter=org.eclipse.jdt.ui.RelevanceSorter
/bundle_defaults/org.eclipse.wb.rcp/nls.automaticallyExternalize=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.annotationSuperInterface=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_unary_operator=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.localSuffixes=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.fallthroughCase=ignore
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_parenthesized_expression_in_return=insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_high_water_mark=500000
/bundle_defaults/org.eclipse.wb.swing/P_CREATION_FLOW=false
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.enumIdentifier=error
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.variable.suffix=
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.problem.italic=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unnecessary_nls_tags=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_link_bold=false
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_tooltips=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_colon_in_assert=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedPrivateMember=warning
/bundle_defaults/org.eclipse.jdt.ui/cleanup.convert_to_enhanced_for_loop=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_annotation=do not insert
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.text.style=BOX
/bundle_defaults/org.eclipse.ui.editors/taskIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.qualify_static_member_accesses_through_instances_with_declaring_class=true
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.classpathVariable.ECLIPSE_HOME=/home/garrett/eclipse
/bundle_defaults/org.eclipse.jdt.ui/cleanup.use_this_for_non_static_field_access=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.qualify_static_method_accesses_with_declaring_class=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_constructor_declaration=insert
/bundle_defaults/org.eclipse.wb.swing/P_COMPONENT_GAP_BOTTOM=6
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.staticFinalFieldPrefixes=
/bundle_defaults/org.eclipse.team.cvs.ui/pref_calculate_dirty=true
/bundle_defaults/org.eclipse.jdt.ui/Refactoring.savealleditors=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.ui.internal.editors.text.URLHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotation.color=100,100,100
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.maxIndexDBCacheSizeMB=64
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_empty_lines=false
/bundle_defaults/org.eclipse.ui.workbench/OPEN_ON_SINGLE_CLICK=false
/configuration/org.eclipse.ui.ide/RECENT_WORKSPACES_PROTOCOL=3
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariable.strikethrough=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.disabling_tag=@formatter\:off
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.uijavaDebug.alertObsoleteMethods=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.method.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.objectInitializer.color=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enum.bold=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.setter.wordDelimiter=
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.overrideIndicator=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.PREF_FILTER_LAUNCH_CLOSED=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_bracket_in_array_reference=do not insert
/bundle_defaults/org.eclipse.cdt.ui/asm_directive_bold=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_overloaded_left_shift_chain=16
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotation.underline=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.class.enabled=false
@org.eclipse.jdt.core=3.8.3.v20130121-145325
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unnecessaryTypeCheck=ignore
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.codeReaderCache=64
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.xml.ui.internal.hyperlink.XMLHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.pde.core/checkedPlugins=[savedAll]
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.method.strikethrough=false
/bundle_defaults/org.eclipse.ui.editors/isBreakpointIndicationGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.nullSpecViolation=error
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.redundantNullCheck=ignore
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.ExpressionView+org.eclipse.debug.ui.ShowDetailPaneAction=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.typedef.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_proposals_foreground=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.infer.useAssignments=true
/bundle_defaults/org.eclipse.cdt.dsf.gdb/maxGdbTraces=500000
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_tag_italic=false
/bundle_defaults/org.eclipse.egit.ui/sync_view_fetch_before_launch=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_parenthesized_expression_in_throw=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_before_closing_brace_in_objlit_initializer=insert
/bundle_defaults/org.eclipse.jdt.ui/spelling_user_dictionary=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.builder.cleanOutputFolder=clean
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_in_empty_block=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_annotation=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.ignorelowercasenames=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_in_empty_annotation_declaration=insert
/bundle_defaults/org.eclipse.ui.workbench/FVB_HIDE=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_switch=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.method.underline=false
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.open_inspect_popup_on_exception=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enumerator.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/stickyOccurrences=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.method.strikethrough=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.save_dirty_editors_before_launch=prompt
/bundle_defaults/org.eclipse.cdt.ui/c_keyword=127,0,85
/bundle_defaults/org.eclipse.ui.editors/filteredSearchResultTextStyle=SQUIGGLES
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_declaration_compare_to_template_header=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.interface.italic=false
/bundle_defaults/org.eclipse.egit.core/core_packedGitMMAP=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/smartPaste=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jst.jsp.ui.internal.hyperlink.XMLJavaHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.wb.rcp/property.events.decorateIcon=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.debug.lineNumber=generate
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_constructor_declaration_throws=do not insert
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.text=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_type_declaration=end_of_line
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingOverrideAnnotation=ignore
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_multi_line_comment_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_selector_in_method_invocation=16
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_before_while_in_do_statement=do not insert
/instance/org.eclipse.team.cvs.ui/pref_first_startup=false
/bundle_defaults/org.eclipse.ui.ide/EXIT_PROMPT_ON_CLOSE_LAST_WINDOW=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_empty_braces_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingSynchronizedOnInheritedMethod=ignore
/bundle_defaults/org.eclipse.debug.ui/Breakpoints.detail.orientation=Variables.detail.orientation.underneath
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_at_in_annotation_type_declaration=insert
/bundle_defaults/org.eclipse.core.net/proxyData/HTTP/hasAuth=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.fieldHiding=ignore
/bundle_defaults/org.eclipse.ui.editors/linked.slave.overviewruler=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_colon_in_conditional=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.showSourceRootsAtTopLevelOfProject=true
/bundle_defaults/org.eclipse.ui.editors/linked.target.color=70,100,165
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.isOccurrenceGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.wb.rcp/GridLayout.enableGrab=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_angle_bracket_in_template_arguments=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_if=do not insert
/instance/org.eclipse.jdt.ui/useAnnotationsPrefPage=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_before_closing_brace_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.ui.editors/isIndexResultGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.ui.editor.UseStructuralMode=false
/bundle_defaults/org.eclipse.ui.editors/spellingEnabled=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/matchingBracketsColor=192,192,192
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_declarator_list=16
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.indexDBCacheSizePct=10
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.doc.comment.support=enabled
/bundle_defaults/org.eclipse.wb.core/common.showVersionWarning=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_empty_braces_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.nullReference=ignore
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_colon_in_for=insert
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.run_import_in_background_=false
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleTabWith=4
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.header.prefix=
/bundle_defaults/org.eclipse.wb.rcp/general.showTextPropertySuffix=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_switch=do not insert
/bundle_defaults/org.eclipse.ui.editors/occurrenceIndication=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.potentialNullReference=ignore
/bundle_defaults/org.eclipse.ui.editors/spellingIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeArgument.enabled=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.externalSDK.italic=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.jsdt.debug.ui.hyperlink.detector_stateMask=327680
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_at_in_annotation=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_annotation=do not insert
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.navigation.next=false
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_monitor_thread_info=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticField.strikethrough=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.parameterVariable.strikethrough=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_in_empty_enum_constant=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_fill_method_arguments=true
/instance/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.formatterprofiles.version=11
/bundle_defaults/org.eclipse.team.cvs.ui/pref_first_startup=true
/bundle_defaults/org.eclipse.ui.ide/REFRESH_WORKSPACE_ON_STARTUP=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.correct_indentation=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.test.suffix=_test.cpp
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.keep_else_statement_on_same_line=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.browsing.projectstoeditor=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_switch=do not insert
/bundle_defaults/org.eclipse.jdt.ui/java_comment_task_tag=127,159,191
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_prefix_operator=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.parameterVariable.bold=false
/bundle_defaults/org.eclipse.egit.core/core_deltaBaseCacheLimit=10485760
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_superinterfaces_in_enum_declaration=16
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Color.Background.SystemDefault=true
/bundle_defaults/org.eclipse.ui.editors/javaScriptOccurrenceIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.suppressWarnings=enabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_method_declaration=0
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_annotation_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.suggestStaticImports=enabled
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_operator_italic=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.format_block_comments=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_colon_in_base_clause=do not insert
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_trailing_whitespaces_all=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_method_declaration_parameters=do not insert
/instance/org.eclipse.jdt.ui/content_assist_proposals_foreground=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.namespace.color=0,0,0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_angle_bracket_in_template_arguments=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_brace_in_array_initializer=insert
/bundle_defaults/org.eclipse.ui.editors/isSpellingGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroSubstitution.underline=false
/bundle_defaults/org.eclipse.jdt.ui/closeBrackets=true
/bundle_defaults/org.eclipse.ui.editors/isUnchangedGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.potentiallyUnclosedCloseable=ignore
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_colon_in_for=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_before_else_in_if_statement=do not insert
/bundle_defaults/org.eclipse.jdt.ui/Search.usereducemenu=true
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.remove_from_view_without_prompt=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.enum.color=100,70,50
/bundle_defaults/org.eclipse.wst.jsdt.ui/linkedPositionColor=121,121,121
/bundle_defaults/org.eclipse.jdt.ui/hoverModifierMasks=org.eclipse.jdt.ui.BestMatchHover;0;org.eclipse.jdt.ui.JavaSourceHover;131072;org.eclipse.jdt.ui.NLSStringHover;327680;org.eclipse.jdt.ui.JavadocHover;393216
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.interface.bold=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariable.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.importorder=java;javax;org;com
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.varargsArgumentNeedCast=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.argumentSuffixes=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_synchronized=insert
/bundle_defaults/org.eclipse.ui.editors/filteredSearchResultHighlighting=false
/bundle_defaults/org.eclipse.ui.editors/quickdiff.characterMode=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.browsing.stackVertically=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.compresspackagenames=false
/bundle_defaults/org.eclipse.ui/SHOW_OTHER_IN_PERSPECTIVE_MENU=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_cast=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_prefix_operator=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_link=63,63,191
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_method_invocation_arguments=do not insert
/bundle_defaults/org.eclipse.egit.ui/HistoryView_ShowTagSequence=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.field.suffix=
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.overviewruler=false
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.first_time=true
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleLines=500
/instance/org.eclipse.team.ui/org.eclipse.team.ui.first_time=false
@org.eclipse.wst.ws.service.policy=1.0.303.v201009221810
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.circularClasspath=error
/bundle_defaults/org.eclipse.ui.editors/linked.exit.text.style=IBEAM
/bundle_defaults/org.eclipse.wb.rcp/P_COMPONENT_GAP_LEFT=6
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.qualify_static_field_accesses_with_declaring_class=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.discouragedReference=warning
/bundle_defaults/org.eclipse.jdt.ui/markBreakContinueTargets=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_constructor_declaration_throws=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.deprecationInDeprecatedCode=disabled
/bundle_defaults/org.eclipse.ui.editors/filteredSearchResultIndication=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.noEffectAssignment=warning
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debug.PREF_REQUEST_TIMEOUT=3000
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.fatalOptionalError=disabled
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.prompt_unable_to_install_breakpoint=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_angle_bracket_in_template_parameters=do not insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_debug_protocol=false
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_non_letters=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.html.ui.internal.hyperlink.AnchorHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.ui.workbench/HeapStatus.showMax=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.keep_empty_array_initializer_on_one_line=false
/bundle_defaults/org.eclipse.ui.editors/showAdditionInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/Refactor.lightweight=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.overrideIndicatorInVerticalRuler=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.remove_all_expressions_prompt=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.hiddenCatchBlock=warning
/bundle_defaults/org.eclipse.cdt.dsf.gdb/defaultGdbCommand=gdb
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.method.color=0,0,0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.class.underline=false
/bundle_defaults/org.eclipse.team.cvs.ui/enableModelSync=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.missingJavadocTagsOverriding=disabled
/bundle_defaults/org.eclipse.ui.editors/bookmarkIndicationColor=34,164,99
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.typefilter.enabled=
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_method_invocation_arguments=do not insert
/bundle_defaults/org.eclipse.cdt.debug.ui/stringPreference=Default value
/bundle_defaults/org.eclipse.cdt.ui/stickyOccurrences=true
/bundle_defaults/org.eclipse.ui/USE_COLORED_LABELS=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.constant.suffix=
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_autoactivation_delay=300
/bundle_defaults/org.eclipse.jdt.ui/java_doc_tag=127,127,159
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.redundantSpecificationOfTypeArguments=ignore
/instance/org.eclipse.mylyn.java.ui/org.eclipse.mylyn.java.ui.run.count.3_1_0=1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedDeclaredThrownExceptionIncludeDocCommentReference=enabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_binary_operator=insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_team_update_handling=traditionalUpdate
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.color=70,100,165
/bundle_defaults/org.eclipse.ui.editors/showOccurrenceInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.navigation.dropdown=false
/bundle_defaults/org.eclipse.jdt.ui/addJavaDocTags=true
/instance/org.eclipse.wst.jsdt.ui/useQuickDiffPrefPage=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_if=do not insert
/bundle_defaults/org.eclipse.wb.core/editor.recognizeSourceGUI=false
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.percents.vertical=20 80
/bundle_defaults/org.eclipse.ui.editors/overrideIndicatorInOverviewRuler=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_constructor_declaration_throws=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_colon_in_for=insert
/instance/org.eclipse.rse.core/org.eclipse.rse.systemtype.local.systemType.defaultUserId=garrett
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_single_line_comment=63,127,95
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.navigation.previous=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_colon_in_case=do not insert
/bundle_defaults/org.eclipse.ui.editors/writeOccurrenceIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_history_view_linking=false
/bundle_defaults/org.eclipse.wb.swing/P_CONTAINER_GAP_BOTTOM=10
/bundle_defaults/org.eclipse.jdt.ui/CallHierarchy.defaultExpandWithConstructorsMembers=java.lang.Runnable.run;java.util.concurrent.Callable.call;org.eclipse.swt.widgets.Listener.handleEvent
/bundle_defaults/org.eclipse.core.resources/description.maxbuilditerations=10
/bundle_defaults/org.eclipse.jdt.ui/java_doc_link_italic=false
/bundle_defaults/org.eclipse.debug.ui/Console.width=80
/bundle_defaults/org.eclipse.jdt.ui/java_string_italic=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariable.color=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_before_new_chunk=1
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_comments=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unresolvedMethodReference=error
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.enum.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.organize_imports=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.qualify_static_member_accesses_through_subtypes_with_declaring_class=true
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_graph_split=500,500
/bundle_defaults/org.eclipse.cdt.ui/content_assist_autoactivation_delay=500
/bundle_defaults/org.eclipse.ui.editors/isOccurrenceGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.wb.rcp/textVariable.wordsLimit=3
/bundle_defaults/org.eclipse.wb.core/hiddenCode.end=$hide<<$
/bundle_defaults/org.eclipse.ui.editors/isBookmarkGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.manage_view_perspectives=DEFAULT
/bundle_defaults/org.eclipse.wst.jsdt.ui/markFieldOccurrences=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.keep_else_statement_on_same_line=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.problem.color=224,0,0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.parameterVariable.enabled=false
/bundle_defaults/org.eclipse.cdt.ui/formatter_profile=org.eclipse.cdt.ui.default.kandr_profile
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.uda.cascade=false
/bundle_defaults/org.eclipse.ui.editors/infoIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.overloadedOperator.bold=false
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_sentence=true
/bundle_defaults/org.eclipse.debug.ui/Console.limitConsoleOutput=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.format_guardian_clause_on_one_line=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.source=1.3
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_urls=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticMethodInvocation.italic=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_at_in_annotation_type_declaration=do not insert
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.internal.ui.javaeditor.JavaElementHyperlinkDeclaredTypeDetector_stateMask=-1
/bundle_defaults/org.eclipse.egit.core/core_packedGitWindowSize=8192
/bundle_defaults/org.eclipse.ui.editors/linked.slave.text=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.enable.visibility.order=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.wizards.srcBinFoldersInNewProjects=false
/bundle_defaults/org.eclipse.ui.workbench/COLOR_ICONS=true
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled
/bundle_defaults/org.eclipse.team.cvs.ui/pref_compression_level=0
/bundle_defaults/org.eclipse.ui.ide/TASKS_FILTERS_MIGRATE=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_keyword_return_italic=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotation.enabled=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.reset_memory_block=org.eclipse.debug.uiresetMemoryBlock.visible
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.2
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_missing_nls_tags=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_width=80
/bundle_defaults/org.eclipse.ui.editors/isChangeGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_exception_specification=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_assignment_operator=insert
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleProblemInfoBackgroundColor=244,247,254
/bundle_defaults/org.eclipse.ui.editors/revisionRulerShowRevision=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_anonymous_type_declaration=end_of_line
/bundle_defaults/org.eclipse.team.cvs.core/cvs.read.only=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.color=0,180,0
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_non_letters=true
/bundle_defaults/org.eclipse.ui.editors/showUnchangedInNextPrevDropdownToolbarAction=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_closing_brace_in_block=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_value_italic=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unused_private_fields=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.autoboxing=ignore
/instance/org.eclipse.cdt.ui/useQuickDiffPrefPage=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_colon_in_assert=insert
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.highlight=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/outlinesortoption=T,F,I,C,M
/bundle_defaults/org.eclipse.ui.ide/SHOW_WORKSPACE_SELECTION_DIALOG=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.localSuffixes=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_multiple_local_declarations=do not insert
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.filterpools.show=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_switchstatements_compare_to_switch=false
/bundle_defaults/org.eclipse.debug.ui/Console.wrap=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_case_sensitivity=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.fallthroughCase=ignore
/bundle_defaults/org.eclipse.ui.editors/taskIndication=false
/bundle_defaults/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.corecDebug.default_register_format=0
/bundle_defaults/org.eclipse.cdt.ui/Refactor.lightweight=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unused_local_variables=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.parameterVariable.color=0,0,0
/bundle_defaults/org.eclipse.ui.workbench/REUSE_OPEN_EDITORS_BOOLEAN=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.enumIdentifier=warning
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_method_declaration_throws=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_autoactivation=true
/bundle_defaults/org.eclipse.jdt.ui/Refactoring.ErrorPage.severityThreshold=2
/bundle_defaults/org.eclipse.egit.ui/CloneWizard_ShowDetailedFailureDialog=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.writeOccurrenceTextStyle=NONE
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.problem.bold=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.tabulation.char=tab
/bundle_defaults/org.eclipse.jdt.ui/CallHierarchy.anonymousExpandWithConstructors=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.parameterVariable.bold=false
/bundle_defaults/org.eclipse.wb.core/editor.formatOnSave=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.defaultEbcdicCodePage=CP037
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.templateParameter.color=100,70,50
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.wsdl.ui.internal.text.WSDLHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_search=false
/bundle_defaults/org.eclipse.core.net/proxyData/HTTPS/hasAuth=false
/instance/org.eclipse.core.net/org.eclipse.core.net.hasMigrated=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.namespace.bold=false
/bundle_defaults/org.eclipse.cdt.debug.ui/org.eclipse.cdt.debug.ui.disassembly.openSourceNotFound=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.incompleteEnumSwitch=warning
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.typedef.underline=false
/bundle_defaults/org.eclipse.ui.editors/changeIndication=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroDefinition.strikethrough=false
/instance/org.eclipse.pde.api.tools/knownEEFragments=
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_colon_in_conditional=insert
/instance/org.eclipse.pde.core/workspace_target_handle=local\:1474751812878.target
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_enum_constant_arguments=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_angle_bracket_in_template_parameters=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.field.color=0,0,192
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_private_constructors=true
/bundle_defaults/org.eclipse.rse.core/activeuserprofiles=Team;localhost
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_default_headers=true
/bundle_defaults/org.eclipse.jdt.ui/content_assist_category_order=org.eclipse.jdt.ui.spellingProposalCategory\:65545\u0000org.eclipse.jdt.ui.javaTypeProposalCategory\:65540\u0000org.eclipse.jdt.ui.javaNoTypeProposalCategory\:65539\u0000org.eclipse.jdt.ui.textProposalCategory\:65541\u0000org.eclipse.jdt.ui.javaAllProposalCategory\:65542\u0000org.eclipse.jdt.ui.templateProposalCategory\:2\u0000org.eclipse.jdt.ui.swtProposalCategory\:3\u0000
/bundle_defaults/org.eclipse.ui.editors/javaScriptOverrideIndicatorInOverviewRuler=false
/bundle_defaults/org.eclipse.ui.editors/linked.focus.verticalruler=false
/bundle_defaults/org.eclipse.jdt.ui/java_bracket=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_before_closing_brace_in_array_initializer=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_switch=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_expression_list=0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_enum_declarations=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_keyword_return_bold=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unused_local_variables=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.objectInitializer.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/hoverModifiers=org.eclipse.wst.jsdt.ui.BestMatchHover;0;org.eclipse.wst.jsdt.ui.JavaSourceHover;Shift;org.eclipse.wst.jsdt.ui.NLSStringHover;Ctrl+Alt
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.timeoutForParameterNameFromAttachedJavadoc=50
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_statements_compare_to_body=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.continuation_indentation=2
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_block=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.invalidJavadoc=ignore
/bundle_defaults/org.eclipse.wb.swing/templateConstraintsName=${constraintsAcronym}_${componentName}
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedParameterIncludeDocCommentReference=enabled
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.externalSDK.bold=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_colon_in_object_initializer=insert
/bundle_defaults/org.eclipse.ui.editors/showLeadingTabs=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.gettersetter.use.is=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.annotation.nullable=org.eclipse.jdt.annotation.Nullable
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariable.strikethrough=false
/bundle_defaults/org.eclipse.cdt.ui/asm_directive_italic=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_parameters_in_method_declaration=16
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_arguments_in_qualified_allocation_expression=16
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.parameterVariable.enabled=false
/bundle_defaults/org.eclipse.ui.editors/othersIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariable.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.parameterVariable.enabled=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_semicolon_in_for=do not insert
/bundle_defaults/org.eclipse.ui.editors/isWarningGoToNextNavigationTarget=true
/instance/org.eclipse.ui.ide/quickStart=false
/bundle_defaults/org.eclipse.ui.ide/SAVE_ALL_BEFORE_BUILD=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_binary_operator=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.potentialNullReference=ignore
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.percents.horizontal=20 80
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.indent_access_specifier_compare_to_type_header=false
/bundle_defaults/org.eclipse.ui/SHOW_TRADITIONAL_STYLE_TABS=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_parameterized_type_reference=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_switch=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_array_initializer=insert
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.test.capitalization=0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_before_catch_in_try_statement=do not insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_enable_watch_on_edit=false
/bundle_defaults/org.eclipse.cdt.ui/asm_label_bold=true
/bundle_defaults/org.eclipse.ui.editors/warningIndication=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.field.color=0,0,192
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.debug.localVariable=generate
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_switch=do not insert
/bundle_defaults/org.eclipse.egit.ui/Blame_IgnoreWhitespace=false
/bundle_defaults/org.eclipse.equinox.p2.ui.sdk/allowNonOKPlan=prompt
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_anonymous_type_declaration=end_of_line
/bundle_defaults/org.eclipse.core.net/proxyData/HTTPS/port=-1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_for=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_folding_enabled=true
/bundle_defaults/org.eclipse.cdt.ui/c_comment_task_tag_bold=true
/bundle_defaults/org.eclipse.ui.editors/currentLine=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.make_local_variable_final=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.jsdt.web.ui.JSDTHyperlinkDetector.HTML_stateMask=-1
/bundle_defaults/org.eclipse.cdt.ui/wrapStrings=true
/bundle_defaults/org.eclipse.ui.editors/infoIndication=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_empty_parens_in_annotation_type_member_declaration=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enabled=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_union_type_in_multicatch=16
/bundle_defaults/org.eclipse.cdt.ui/c_keyword_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_enum_declarations=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_keyword_return=127,0,85
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_folding_default_methods=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_if=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.builder.invalidClasspath=abort
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_arguments_in_method_invocation=16
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.inactive_filters=com.ibm.*,com.sun.*,java.*,javax.*,jrockit.*,org.omg.*,sun.*,sunw.*
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.UseSingleLine=true
/bundle_defaults/org.eclipse.jdt.ui/outlinesortoption=T,SF,SI,SM,F,I,C,M
/bundle_defaults/org.eclipse.jdt.apt.core/org.eclipse.jdt.apt.genSrcDir=.apt_generated
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.field.wordDelimiter=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_in_empty_anonymous_type_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.processAnnotations=disabled
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.debug.ui/org.eclispe.debug.ui.memory.postBufferSize=20
/bundle_defaults/org.eclipse.ui.editors/AbstractTextEditor.Color.Foreground.SystemDefault=true
/instance/org.eclipse.jdt.ui/org.eclipse.jdt.ui.text.code_templates_migrated=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.reportMethodCanBePotentiallyStatic=ignore
/instance/org.eclipse.jdt.ui/org.eclipse.jdt.ui.editor.tab.width=
/bundle_defaults/org.eclipse.cdt.ui/c_default_italic=false
/bundle_defaults/org.eclipse.cdt.ui/c_operators_italic=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.mylyn.tasks.ui.hyperlinks.detectors.task_stateMask=-1
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.align_type_members_on_columns=false
@org.eclipse.mylyn.monitor.ui=3.8.3.v20130107-0100
/bundle_defaults/org.eclipse.cdt.core/indexer/indexUnusedHeadersWithAlternateLang=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroSubstitution.strikethrough=false
/bundle_defaults/org.eclipse.wb.swing/P_DISPLAY_LOCATION_SIZE_HINTS=true
/bundle_defaults/org.eclipse.jdt.ui/content_assist_autoinsert=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocTags=ignore
/bundle_defaults/org.eclipse.ui.editors/javaScriptOverrideIndicatorHighlighting=false
/bundle_defaults/org.eclipse.cdt.ui/autoIndent=true
/bundle_defaults/org.eclipse.jdt.ui/matchingBracketsColor=192,192,192
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debug.default_breakpoint_suspend_policy=2
/bundle_defaults/org.eclipse.wst.jsdt.ui/wrapStrings=true
/bundle_defaults/org.eclipse.core.net/proxyData/HTTP/port=-1
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_question_in_conditional=insert
/bundle_defaults/org.eclipse.ui.editors/showBreakpointIndicationInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeParameter.color=100,70,50
/bundle_defaults/org.eclipse.wb.rcp/innerClassName=${Component_name}${Listener_className}
/bundle_defaults/org.eclipse.wb.rcp/templateLayoutName=${layoutAcronym}_${compositeName}
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.builder.resourceCopyExclusionFilter=
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticField.bold=false
/instance/org.eclipse.ui.ide/tipsAndTricks=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.use_blocks=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_between_type_declarations=1
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.test.wordDelimiter=
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_compare_mode=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_brace_in_array_initializer=insert
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.showoverrideIndicatorInNextPrevDropdownToolbarAction=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_assignment_italic=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.class.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_colon_in_assert=insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_prompt_on_saving_in_sync=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.builder.recreateModifiedClassFileInOutputFolder=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_for_increments=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.interface.enabled=false
/bundle_defaults/org.eclipse.cdt.ui/matchingBrackets=true
/bundle_defaults/org.eclipse.ui.editors/overrideIndicatorTextStyle=SQUIGGLES
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.never_indent_block_comments_on_first_column=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_between_type_declarations=0
/bundle_defaults/org.eclipse.wst.jsdt.ui/markTypeOccurrences=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.staticFinalFieldSuffixes=
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_trailing_whitespaces_ignore_empty=false
/bundle_defaults/org.eclipse.wb.rcp/P_COMPONENT_GAP_TOP=6
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_annotation_on_field=insert
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_generated_serial_version_id=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.builder.recreateModifiedClassFileInOutputFolder=ignore
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enumerator.color=0,0,192
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unnecessary_casts=true
/bundle_defaults/org.eclipse.ui/initialFastViewBarLocation=bottom
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.source=1.8
/bundle_defaults/org.eclipse.wst.jsdt.ui/markMethodOccurrences=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_enum_constant_arguments=insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariableDeclaration.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_comment_task_tag=127,159,191
/instance/org.eclipse.debug.ui/pref_state_memento.org.eclipse.debug.ui.BreakpointView=<?xml version\="1.0" encoding\="UTF-8"?>\n<VariablesViewMemento org.eclipse.debug.ui.SASH_DETAILS_PART\="315" org.eclipse.debug.ui.SASH_VIEW_PART\="684">\n<PRESENTATION_CONTEXT_PROPERTIES IMemento.internal.id\="org.eclipse.debug.ui.BreakpointView">\n<BOOLEAN BOOLEAN\="true" IMemento.internal.id\="org.eclipse.debug.ui.check"/>\n</PRESENTATION_CONTEXT_PROPERTIES>\n</VariablesViewMemento>
/bundle_defaults/org.eclipse.ui.workbench/perspectiveBarVisible=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariable.italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_proposals_background=255,255,255
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.discouragedReferenceCheck=disabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_unary_operator=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_enum_declaration=end_of_line
/bundle_defaults/org.eclipse.ui.editors/linked.focus.color=70,100,165
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_angle_bracket_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariableDeclaration.enabled=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_syncview_regex_filter_pattern=
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotationElementReference.color=0,0,0
/bundle_defaults/org.eclipse.ui.editors/bookmarkTextStyle=SQUIGGLES
/bundle_defaults/org.eclipse.jdt.ui/cleanup.make_variable_declarations_final=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_message_color=0,0,255
/bundle_defaults/org.eclipse.cdt.ui/content_assist_order_proposals=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_superinterfaces_in_type_declaration=16
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_question_in_conditional=insert
/bundle_defaults/org.eclipse.ui.editors/linked.exit.color=0,180,0
/bundle_defaults/org.eclipse.ui.editors/writeOccurrenceIndication=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_tag_bold=false
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.debug.ui.VariableView.org.eclipse.jdt.debug.ui.show_static_variables=false
/bundle_defaults/org.eclipse.egit.ui/commit_dialog_hard_wrap_message=true
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_default_inactive=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.jsdt.web.ui.JSDTHyperlinkDetector.SCRIPT_stateMask=-1
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.verticalruler=false
/bundle_defaults/org.eclipse.ui.ide/useSeparator.help.group.assist=true
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_system_threads=false
/bundle_defaults/org.eclipse.egit.ui/sync_view_show_changeset_model=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_comma_in_method_declaration_throws=insert
/bundle_defaults/org.eclipse.wb.rcp/property.events.stubCreate=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_error_color=255,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.put_empty_statement_on_new_line=true
/bundle_defaults/org.eclipse.cdt.ui/content_assist_proposals_background=255,255,255
/bundle_defaults/org.eclipse.jdt.ui/cleanup.on_save_profile_id=org.eclipse.jdt.ui.default.save_participant_clean_up_profile
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.showwizard=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.preserve_white_space_between_code_and_line_comments=false
/bundle_defaults/org.eclipse.cdt.core/indexer/indexUnusedHeadersWithDefaultLang=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.assertIdentifier=warning
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.field.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_default=63,95,191
/bundle_defaults/org.eclipse.jdt.ui/spelling_ignore_ampersand_in_properties=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_body_declarations_compare_to_type_header=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_cast=do not insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_overlaydirty=false
/bundle_defaults/org.eclipse.cdt.ui/c_multi_line_comment_bold=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.localVariableDeclaration.underline=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.methodDeclarationName.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_comment_task_tag_italic=false
/bundle_defaults/org.eclipse.ui.editors/isTaskGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.ui.workbench/USE_IPERSISTABLE_EDITORS=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.source.wordDelimiter=
/instance/org.eclipse.wst.jsdt.ui/tabWidthPropagated=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.constant.wordDelimiter=_
/bundle_defaults/org.eclipse.jdt.ui/java_multi_line_comment=63,127,95
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_switch=do not insert
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.switch_to_perspective=never
/bundle_defaults/org.eclipse.equinox.p2.ui.sdk.scheduler/download=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractMethodInvocation.color=0,0,0
/bundle_defaults/org.eclipse.debug.ui/Registers.detail.orientation=Variables.detail.orientation.underneath
/bundle_defaults/org.eclipse.ui.editors/tabWidth=4
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.getter.prefix=get
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_argument_italic=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_trailing_whitespaces=false
/bundle_defaults/org.eclipse.ui.editors/writeOccurrenceTextStyle=NONE
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_string_literals=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticField.color=0,0,192
/bundle_defaults/org.eclipse.ui.editors/indexResultIndicationInVerticalRuler=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_after_annotation_on_package=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_brace_in_array_initializer=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.rawTypeReference=warning
/bundle_defaults/org.eclipse.team.cvs.ui/pref_show_compare_revision_in_dialog=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_bracket_in_array_allocation_expression=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_and_in_type_parameter=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_new_line_in_empty_anonymous_type_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.format_javadoc_comments=true
/bundle_defaults/org.eclipse.jdt.ui/editor_folding_default_innertypes=false
/bundle_defaults/org.eclipse.cdt.ui/function_pass_output_parameters_by_pointer=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_closing_angle_bracket_in_template_arguments=insert
/bundle_defaults/org.eclipse.jdt.ui/closeStrings=true
/bundle_defaults/org.eclipse.wb.swing/GridBagLayout.longConstraints=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_enum_declaration=insert
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.mylyn.tasks.ui.hyperlinks.detectors.url_stateMask=-1
/bundle_defaults/org.eclipse.cdt.dsf.gdb/defaultStopAtMain=true
/bundle_defaults/org.eclipse.ui.editors/showTrailingSpaces=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_enum_constants=0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_before_first_class_body_declaration=0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_multiple_field_declarations=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_method_invocation_arguments=do not insert
/bundle_defaults/org.eclipse.wb.core/common.linux.disableScreenshotWorkarounds=false
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_assignment_bold=false
/bundle_defaults/org.eclipse.cdt.ui/content_assist_proposals_timeout=5000
/bundle_defaults/org.eclipse.jdt.ui/cleanup.never_use_blocks=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariableDeclaration.enabled=false
/instance/org.eclipse.jdt.ui/content_assist_proposals_background=255,255,255
/bundle_defaults/org.eclipse.cdt.debug.ui/org.eclipse.cdt.debug.ui.disassembly.showSource=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.mylyn.java.hyperlink.detector.stack_stateMask=-1
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_show_email_addresses=true
/bundle_defaults/org.eclipse.debug.ui/DEBUG.consoleOpenOnOut=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/Refactoring.ErrorPage.severityThreshold=2
/bundle_defaults/org.eclipse.ui.editors/showInfoInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_angle_bracket_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.InitiallyShowAncestorPane=false
/bundle_defaults/org.eclipse.wb.swing/P_USE_GRID=false
\!/=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_prefix_operator=do not insert
/bundle_defaults/org.eclipse.jdt.debug/org.eclipse.jdt.debug.suspend_for_breakpoints_during_evaluation=true
/bundle_defaults/org.eclipse.ui.ide/MARKER_LIMITS_VALUE=100
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_explicitconstructorcall_arguments=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_multiple_local_declarations=insert
/bundle_defaults/org.eclipse.ui.ide/saveInterval=5
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.getter.capitalization=3
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_assignment_operator=insert
/bundle_defaults/org.eclipse.cdt.ui/hoverModifiers=org.eclipse.cdt.ui.BestMatchHover;0;org.eclipse.cdt.ui.CSourceHover;Shift
/bundle_defaults/org.eclipse.jdt.ui/java_doc_tag_bold=false
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleProblemBackgroundColor=254,231,224
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.rememberState=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.functionDeclaration.enabled=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.class.italic=false
/bundle_defaults/org.eclipse.ui/showIntro=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jst.jsf.ui.elhyperlinkdetector_stateMask=-1
/bundle_defaults/org.eclipse.ui.editors/showSpellingInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.occurrenceIndicationColor=212,212,212
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_angle_bracket_in_template_arguments=do not insert
/instance/org.eclipse.wst.ws.service.policy/org.eclipse.wst.ws.service.policy.ui.servicepols.wsiprofilecomp.wsissbp.defaultProtocol=http\://schemas.xmlsoap.org/wsdl/soap/
/bundle_defaults/org.eclipse.cdt.ui/pp_header=42,0,255
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.methodDeclarationName.color=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_assignment=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_allocation_expression=do not insert
/bundle_defaults/org.eclipse.wb.rcp/P_DISPLAY_GRID=false
/bundle_defaults/org.eclipse.ui.editors/changeIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.variable.prefix=
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.make_local_variable_final=true
/bundle_defaults/org.eclipse.wb.swing/templateLayoutName=${layoutAcronym}_${containerName}
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.ui.editors/spacesForTabs=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_for_inits=insert
/bundle_defaults/org.eclipse.ui.editors/occurrenceIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/markOccurrences=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.methodWithConstructorName=warning
/bundle_defaults/org.eclipse.wb.rcp/GridLayout.enableRightAlignment=true
/bundle_defaults/org.eclipse.jdt.ui/PackagesView.pkgNamePatternForPackagesView=
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.redundantNullCheck=ignore
/bundle_defaults/org.eclipse.rse.ui/SHOW_EMPTY_LISTS=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_angle_bracket_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.suppressWarnings=enabled
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_colon_in_default=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.debug.sourceFile=generate
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_block=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.suggestStaticImports=enabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_for_inits=insert
/bundle_defaults/org.eclipse.ui/SHOW_SYSTEM_JOBS=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.PREF_FILTER_LAUNCH_TYPES=false
/instance/org.eclipse.mylyn.tasks.ui/org.eclipse.mylyn.tasks.ui.welcome.message=true
/bundle_defaults/org.eclipse.cdt.ui/content_assist_category_order=org.eclipse.cdt.ui.parserProposalCategory\:65539\u0000org.eclipse.cdt.ui.textProposalCategory\:65541\u0000org.eclipse.cdt.ui.templateProposalCategory\:2\u0000org.eclipse.cdt.ui.helpProposalCategory\:5\u0000
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.invalidJavadocTagsVisibility=public
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_parenthesized_expression_in_return=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.abstractMethodInvocation.enabled=false
/bundle_defaults/org.eclipse.cdt.ui/asm_label=127,0,85
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.widgetOffset.vertical=6
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.wizards.jre.index=0
/bundle_defaults/org.eclipse.ui/RECENTLY_USED_WORKINGSETS_SIZE=5
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.egit.mylyn.ui.commitHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.wb.rcp/formLayout.snap.windowMargin.vertical=12
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.add_missing_override_annotations=true
/instance/org.eclipse.debug.ui/preferredDetailPanes=DefaultDetailPane\:DefaultDetailPane|
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.method.strikethrough=false
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.compliance=1.8
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.slave.color=180,215,255
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_closing_angle_bracket_in_type_arguments=insert
/bundle_defaults/org.eclipse.debug.ui/org.eclispe.debug.ui.memory.preBufferSize=20
/bundle_defaults/org.eclipse.wb.rcp/general.topBoundsDefaultWidth=450
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.tasks=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedDeclaredThrownExceptionWhenOverriding=disabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_closing_angle_bracket_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.jdt.ui/cleanup.make_type_abstract_if_missing_method=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.indent_root_tags=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_brace_in_switch=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_annotation_roll_over=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_ellipsis=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_type_arguments=do not insert
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.PREF_FILTER_LAUNCH_DELETED=true
/bundle_defaults/org.eclipse.team.cvs.ui/openCompareEditorForSingleFile=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_superclass_in_type_declaration=16
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.use_on_off_tags=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.invalidJavadocTagsNotVisibleRef=disabled
/bundle_defaults/org.eclipse.wb.rcp/nls.useQualifiedTypeNameForKey=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.overrideIndicatorHighlighting=false
/bundle_defaults/org.eclipse.ui.editors/showErrorInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.ui.editors/quickdiff.defaultProvider=org.eclipse.ui.internal.editors.quickdiff.LastSaveReferenceProvider
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_comma_in_method_declaration_parameters=do not insert
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.wst.jsdt.internal.ui.javaeditor.JavaElementHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.ui/VIEW_TAB_POSITION=128
/bundle_defaults/org.eclipse.cdt.ui/escapeStrings=false
/bundle_defaults/org.eclipse.ui.ide/IMPORT_FILES_AND_FOLDERS_TYPE=
/bundle_defaults/org.eclipse.jdt.ui/cleanup.make_parameters_final=false
/instance/org.eclipse.jdt.launching/org.eclipse.jdt.launching.PREF_DEFAULT_ENVIRONMENTS_XML=<?xml version\="1.0" encoding\="UTF-8" standalone\="no"?>\n<defaultEnvironments>\n<defaultEnvironment environmentId\="JavaSE-1.6" vmId\="57,org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType13,1474749971717"/>\n<defaultEnvironment environmentId\="JavaSE-1.7" vmId\="57,org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType13,1474749971717"/>\n</defaultEnvironments>\n
/bundle_defaults/org.eclipse.cdt.core/indexer/skipMacroReferences=false
/bundle_defaults/org.eclipse.rse.ui/APPEND_MNEMONICS_PATTERN=zh.*|ja.*|ko.*
/bundle_defaults/org.eclipse.egit.ui/show_detached_head_warning=true
/bundle_defaults/org.eclipse.egit.ui/HistoryView_MaxBranchLength=15
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.method.italic=false
/bundle_defaults/org.eclipse.wb.swing/P_COMPONENT_GAP_LEFT=6
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.parameterVariable.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.hiddenCatchBlock=warning
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.tabulation.size=4
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.globalVariable.enabled=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_brackets_in_array_type_reference=do not insert
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_default_macros=false
/bundle_defaults/org.eclipse.jdt.ui/spacesForTabs=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_at_in_annotation_type_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.codeComplete.visibilityCheck=disabled
/bundle_defaults/org.eclipse.jdt.ui/enclosingBrackets=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unhandledWarningToken=warning
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.insert_new_line_before_root_tags=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.template.format=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_at_end_of_file_if_missing=do not insert
/bundle_defaults/org.eclipse.ui.editors/secondaryIPColor=219,235,204
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_empty_parens_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.OpenStructureCompare=true
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jst.jsp.ui.internal.hyperlink.TaglibHyperlinkDetector_stateMask=-1
/profile/file\:\\2fhome\\2fgarrett\\2feclipse\\2fconfiguration\\2f..\\2fp2\\2f/_SELF_/org.eclipse.equinox.p2.ui.sdk.scheduler/autoUpdateInit=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.deprecatedMember.enabled=true
/configuration/org.eclipse.ui.ide/RECENT_WORKSPACES=/home/garrett/workspace
/bundle_defaults/org.eclipse.ui.editors/breakpointVerticalRuler=true
/bundle_defaults/org.eclipse.egit.ui/resourcehistory_follow_renames=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.overrideIndicatorColor=180,207,205
/bundle_defaults/org.eclipse.cdt.ui/content_assist_project_search_scope=false
@org.eclipse.debug.core=3.7.100.v20120521-2012
/bundle_defaults/org.eclipse.jdt.ui/JavaEditor.ShowTemporaryProblem=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.javadoc=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enum.enabled=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.javadoc=false
/bundle_defaults/org.eclipse.cdt.ui/content_assist_disabled_computers=org.eclipse.cdt.ui.textProposalCategory\u0000
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_method_declaration=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.missingJavadocCommentsVisibility=default
/bundle_defaults/org.eclipse.ui.editors/othersIndicationColor=0,0,0
/bundle_defaults/org.eclipse.team.cvs.ui/pref_update_preview=syncView
/instance/org.eclipse.jdt.ui/tabWidthPropagated=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.incompleteClasspath=error
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_before_field=0
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.number.underline=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.functionDeclaration.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.add_generated_serial_version_id=false
/project/PA1/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.debug.localVariable=generate
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.tabulation.char=tab
/bundle_defaults/org.eclipse.ui.workbench/DISABLE_OPEN_EDITOR_IN_PLACE=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_semicolon_in_for=do not insert
/bundle_defaults/org.eclipse.ui.editors/spellingIndicationColor=255,128,64
/bundle_defaults/org.eclipse.cdt.ui/spelling_user_dictionary=
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup_profile=org.eclipse.wst.jsdt.ui.default.eclipse_clean_up_profile
/bundle_defaults/org.eclipse.ui.editors/linked.focus.navigation.dropdown=false
/bundle_defaults/org.eclipse.wb.swing/property.events.finalParameters=false
/bundle_defaults/org.eclipse.jdt.ui/java_operator_bold=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.text.style=IBEAM
/bundle_defaults/org.eclipse.cdt.ui/content_assist_proposals_foreground=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.cpp.test.prefix=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.format_header=false
/bundle_defaults/org.eclipse.wst.jsdt.core/semanticValidation=enabled
@org.eclipse.mylyn.tasks.ui=3.8.3.v20130107-0100
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.staticAccessReceiver=warning
/bundle_defaults/org.eclipse.wb.swing/general.highlightContainersWithoutBorders=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.function.italic=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.methodtypeparametesr=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_question_in_conditional=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unnecessary_nls_tags=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.blank_lines_before_member_type=1
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_paren_in_cast=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_ellipsis=do not insert
/bundle_defaults/org.eclipse.ui.editors/linked.target.verticalruler=false
/bundle_defaults/org.eclipse.jdt.ui/java_doc_keyword_bold=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_question_in_conditional=insert
/bundle_defaults/org.eclipse.cdt.ui/pp_header_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_prefix_completion=false
/profile/file\:\\2fhome\\2fgarrett\\2feclipse\\2fconfiguration\\2f..\\2fp2\\2f/_SELF_/org.eclipse.equinox.p2.ui.sdk/showLatestVersion=true
/bundle_defaults/org.eclipse.ui.editors/currentIPTextStyle=NONE
@org.eclipse.core.resources=3.8.1.v20121114-124432
/bundle_defaults/org.eclipse.jdt.ui/cleanup.always_use_this_for_non_static_field_access=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_default_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.category=true
/bundle_defaults/org.eclipse.ui.ide/PROJECT_OPEN_NEW_PERSPECTIVE=OPEN_PERSPECTIVE_REPLACE
/bundle_defaults/org.eclipse.wb.swing/property.events.decorateIcon=true
/instance/org.eclipse.jdt.core/org.eclipse.jdt.core.classpathVariable.JRE_SRC=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.102-1.b14.el7_2.x86_64/src.zip
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.localVariableHiding=ignore
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_folding_default_innertypes=false
/bundle_defaults/org.eclipse.ui.workbench/ENABLE_CONFIGURABLE_PROJECT_WIZARD=false
/bundle_defaults/org.eclipse.jdt.ui/content_assist_autoactivation_triggers_java=.
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedMethodInvocation.enabled=false
/bundle_defaults/org.eclipse.jdt.ui/java_single_line_comment_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_block=insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_remember_merges=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_key=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_semicolon_in_for=do not insert
/bundle_defaults/org.eclipse.ui.editors/linked.slave.navigation.next=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.browsing.packagestoeditor=true
/bundle_defaults/org.eclipse.core.resources/description.buildorder=
/bundle_defaults/org.eclipse.wb.core/evaluation.strictMode=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.field.prefix=
/bundle_defaults/org.eclipse.ui.editors/linked.focus.navigation.previous=false
/bundle_defaults/org.eclipse.ui.editors/revisionAnnotationIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.localVariable.enabled=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.incompatibleNonInheritedInterfaceMethod=warning
/bundle_defaults/org.eclipse.ui.editors/bookmarkIndicationInOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.wrap_before_binary_operator=true
/bundle_defaults/org.eclipse.ui.editors/deletionIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.egit.core/core_packedGitLimit=10485760
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_comma_in_explicitconstructorcall_arguments=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.annotation.nonnull=org.eclipse.jdt.annotation.NonNull
/bundle_defaults/org.eclipse.ui/ENABLE_MIN_MAX=true
/bundle_defaults/org.eclipse.jdt.ui/closeBraces=true
/bundle_defaults/org.eclipse.ui.editors/deletionIndication=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticFinalField.bold=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroDefinition.color=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.class.enabled=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_closing_paren_in_cast=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_brace_in_array_initializer=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.put_empty_statement_on_new_line=true
/bundle_defaults/org.eclipse.jdt.ui/markMethodOccurrences=true
/bundle_defaults/org.eclipse.ui.editors/filteredSearchResultIndicationColor=237,237,252
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_postfix_operator=do not insert
/bundle_defaults/org.eclipse.ui/KEY_CONFIGURATION_ID=org.eclipse.ui.defaultAcceleratorConfiguration
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.keywordthis=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.overrideIndicatorInOverviewRuler=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_console_wrap=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.indirectStaticAccess=ignore
/bundle_defaults/org.eclipse.ui.editors/linked.slave.highlight=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.finallyBlockNotCompletingNormally=warning
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_string=42,0,255
/bundle_defaults/org.eclipse.ui.ide/LIMIT_PROBLEMS=true
/bundle_defaults/org.eclipse.cdt.ui/scalability.detect=true
/bundle_defaults/org.eclipse.cdt.debug.core/org.eclipse.cdt.debug.corecDebug.default_variable_format=0
/bundle_defaults/org.eclipse.wb.swing/property.events.codeType=0
/bundle_defaults/org.eclipse.wst.jsdt.ui/escapeStrings=false
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.sychronizing_default_perspective_to_show=prompt
/bundle_defaults/org.eclipse.jdt.ui/spelling_user_dictionary_encoding=UTF-8
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_closing_paren_in_method_declaration=do not insert
/instance/org.eclipse.ui.workbench/PLUGINS_NOT_ACTIVATED_ON_STARTUP=org.eclipse.m2e.discovery;
/bundle_defaults/org.eclipse.wb.swing/P_USE_FREE_MODE=true
/bundle_defaults/org.eclipse.wb.swing/textVariable.mode=1
/bundle_defaults/org.eclipse.jdt.ui/cleanup.format_source_code_changes_only=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.occurrenceIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.wb.core/hiddenCode.singleLine=$hide$
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unused_private_members=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_block=end_of_line
/bundle_defaults/org.eclipse.ui.editors/unchangedIndicationInOverviewRuler=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_type_declaration=end_of_line
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_annotation_type_declaration=insert
/bundle_defaults/org.eclipse.ui.editors/lineNumberRuler=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_paren_in_if=insert
@org.eclipse.pde.api.tools=1.0.400.v20120523-2012
/bundle_defaults/org.eclipse.jdt.ui/java_keyword=127,0,85
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.wb.swing/property.events.stubCreate=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_string_bold=false
/bundle_defaults/org.eclipse.ui/CLOSE_EDITORS_ON_EXIT=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_switchstatements_compare_to_switch=false
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.constant.prefix=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.blank_lines_before_new_chunk=1
/bundle_defaults/org.eclipse.ui.workbench/EDITORLIST_SORT_CRITERIA=0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_breaks_compare_to_cases=true
/bundle_defaults/org.eclipse.cdt.ui/handleTemporaryProblems=true
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_comment=63,127,95
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.browsing.typestoeditor=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.objectInitializer.strikethrough=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_while=do not insert
/bundle_defaults/org.eclipse.wb.rcp/textVariable.template=${class_acronym}${text}
/bundle_defaults/org.eclipse.ui.editors/isAdditionGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_comment_italic=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_insert_completion=true
/bundle_defaults/org.eclipse.ui.editors/isDeletionGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.field.underline=false
/bundle_defaults/org.eclipse.ui.editors/currentLineColor=232,242,254
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.typedef.italic=false
/bundle_defaults/org.eclipse.wb.swing/P_GRID_STEP_Y=5
/bundle_defaults/org.eclipse.cdt.ui/c_single_line_comment=63,127,95
/bundle_defaults/org.eclipse.wb.swing/P_GRID_STEP_X=5
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.templateParameter.underline=false
/bundle_defaults/org.eclipse.jdt.ui/java_string_bold=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unused_private_members=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_statements_compare_to_body=true
/bundle_defaults/org.eclipse.ui.ide/IMPORT_FILES_AND_FOLDERS_RELATIVE=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_single_line_comment_bold=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.navigation.dropdown=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.builder.cleanOutputFolder=clean
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.typeArgument.bold=false
/bundle_defaults/org.eclipse.jdt.ui/hoverModifiers=org.eclipse.jdt.ui.BestMatchHover;0;org.eclipse.jdt.ui.JavaSourceHover;Shift;org.eclipse.jdt.ui.NLSStringHover;Ctrl+Alt;org.eclipse.jdt.ui.JavadocHover;Ctrl+Shift
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.codeComplete.forbiddenReferenceCheck=enabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_empty_brackets_in_array_allocation_expression=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_closing_angle_bracket_in_type_parameters=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.comment.preserve_white_space_between_code_and_line_comments=true
/bundle_defaults/org.eclipse.ui.editors/javaScriptShowOccurrenceInNextPrevDropdownToolbarAction=true
/bundle_defaults/org.eclipse.ui.editors/isErrorGoToNextNavigationTarget=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.indent_body_declarations_compare_to_enum_constant_header=true
/bundle_defaults/org.eclipse.cdt.ui/nameStyle.variable.wordDelimiter=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=disabled
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.indent_parameter_description=true
/bundle_defaults/org.eclipse.cdt.ui/codetemplates.includeGuardGenerationScheme=0
/bundle_defaults/org.eclipse.jdt.ui/java_default_bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_prefix_operator=do not insert
/bundle_defaults/org.eclipse.cdt.dsf.gdb/tracesEnable=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.VariableView+org.eclipse.debug.ui.ShowTypeNamesAction=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.defaultAsciiCodePage=CP1252
/bundle_defaults/org.eclipse.ui.editors/filteredSearchResultIndicationInVerticalRuler=false
/bundle_defaults/org.eclipse.wb.swing/P_CONTAINER_GAP_TOP=10
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.join_wrapped_lines=true
/bundle_defaults/org.eclipse.ui.editors/overrideIndicatorHighlighting=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.annotationElementReference.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_enum_constant=do not insert
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_char=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_paren_in_catch=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_empty_parens_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.jdt.ui/pf_coloring_value_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedParameterWhenImplementingAbstract=disabled
/bundle_defaults/org.eclipse.ui.workbench/SHOW_MEMORY_MONITOR=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.function.color=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.problem.strikethrough=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_text_ksubst=-kkv
@org.eclipse.jdt.ui=3.8.2.v20130107-165834
/bundle_defaults/org.eclipse.egit.ui/decorator_projecttext_decoration={dirty\:>} {name} [{repository} {branch}{ branch_status}]
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unused_private_fields=true
/bundle_defaults/org.eclipse.jdt.ui/cleanup.sort_members=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.autoboxing.strikethrough=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.staticFinalField.enabled=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jdt.internal.ui.javaeditor.JavaElementHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.target.navigation.previous=false
/bundle_defaults/org.eclipse.ui.editors/overrideIndicatorColor=180,207,205
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.jst.jsp.ui.internal.hyperlink.JSPJavaHyperlinkDetector_stateMask=-1
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.interface.color=50,63,112
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_question_in_conditional=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.keep_empty_array_initializer_on_one_line=false
/bundle_defaults/org.eclipse.jdt.ui/java_doc_link_bold=false
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.show_qualified_names=false
/bundle_defaults/org.eclipse.cdt.ui/buildConsoleOutputStreamColor=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_type_declaration=insert
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.internal.ui.text.doctools.doxygen.multi=63,95,191
/bundle_defaults/org.eclipse.cdt.ui/c_string_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.wrongNumberOfArguments=ignore
@org.eclipse.debug.ui=3.8.2.v20130130-171415
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_question_in_wildcard=do not insert
/bundle_defaults/org.eclipse.jdt.ui/cleanup.always_use_parentheses_in_expressions=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unused_imports=true
/bundle_defaults/org.eclipse.ui.editors/showWhitespaceCharacters=false
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.skip_breakpoints_during_run_to_line=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.focus.text=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_method_declaration=end_of_line
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.syntheticAccessEmulation=ignore
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.NavigationEndActionLocal=loop
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_paren_in_constructor_declaration=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_opening_brace_in_array_initializer=insert
@org.eclipse.jdt.launching=3.6.101.v20130111-183046
/bundle_defaults/org.eclipse.ui.editors/linked.target.navigation.next=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.field.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.wizards.srcBinFoldersBinName=
/instance/org.eclipse.ui.ide/PROBLEMS_FILTERS_MIGRATE=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.deprecatedMember.strikethrough=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.brace_position_for_method_declaration=end_of_line
/instance/org.eclipse.ui.workbench//org.eclipse.ui.commands/state/org.eclipse.ui.navigator.resources.nested.changeProjectPresentation/org.eclipse.ui.commands.radioState=false
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_closing_paren_in_method_invocation=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.undefinedField=warning
/bundle_defaults/org.eclipse.ui.workbench/EDITORLIST_SELECTION_SCOPE=1
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_colon_in_conditional=insert
/bundle_defaults/org.eclipse.wb.rcp/templateLayoutDataName=${dataAcronym}_${controlName}
/bundle_defaults/org.eclipse.ui.workbench/shouldPromptForEnablement=true
/bundle_defaults/org.eclipse.cdt.ui/org.eclipse.cdt.ui.add_comments=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_between_empty_parens_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_new_line_before_while_in_do_statement=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.unusedDeclaredThrownException=ignore
/bundle_defaults/org.eclipse.jdt.ui/markLocalVariableOccurrences=true
/bundle_defaults/org.eclipse.wst.jsdt.ui/content_assist_add_import=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_type_parameters=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_bracket_in_array_reference=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_doc_tag=127,127,159
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.number_of_blank_lines_at_beginning_of_method_body=0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.invalidJavadocTagsDeprecatedRef=disabled
/bundle_defaults/org.eclipse.ui.workbench/overridepresentation=false
/bundle_defaults/org.eclipse.rse.ui/org.eclipse.rse.preferences.order.connections=
@org.eclipse.ui.editors=3.8.0.v20120523-1540
/instance/org.eclipse.mylyn.tasks.ui/migrated.task.repositories.secure.store=true
/instance/org.eclipse.core.resources/version=1
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_multi_line_comment=63,127,95
/bundle_defaults/org.eclipse.ui.editors/javaScriptOccurrenceIndication=false
/bundle_defaults/org.eclipse.cdt.ui/pp_default_bold=false
/bundle_defaults/org.eclipse.ui.editors/linked.exit.overviewruler=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.typefilter.disabled=
/bundle_defaults/org.eclipse.ui.workbench/HeapStatus.updateInterval=500
/instance/org.eclipse.rse.ui/org.eclipse.rse.preferences.order.connections=localhost.Local
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.externalSDK.color=100,40,128
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.apply_patch_in_sychronize_view=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_projecttext_decoration={outgoing_change_flag}{name}  {tag} [{host}]
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_semicolon_in_try_resources=do not insert
/bundle_defaults/org.eclipse.ui.ide/PROBLEMS_FILTERS_MIGRATE=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_type_parameters=do not insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_bracket_in_array_reference=do not insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.method.color=0,0,0
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_conditional_expression=34
@org.eclipse.rse.core=3.3.2.201301152246
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_unused_private_methods=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_assignment_operator=insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enum.italic=false
/bundle_defaults/org.eclipse.cdt.core/indexer/indexImportLocation=.settings/cdt-index.zip
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.methodDeclaration.italic=false
/bundle_defaults/org.eclipse.jdt.ui/cleanup.add_missing_deprecated_annotations=true
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.methodDeclarationName.underline=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.typeParameterHiding=warning
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.method.bold=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_opening_paren_in_parenthesized_expression=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.globalVariable.italic=true
/bundle_defaults/org.eclipse.ui.editors/infoIndicationColor=244,200,45
/bundle_defaults/org.eclipse.wb.core/editor.highlightVisitedLines.color=235,255,235
/bundle_defaults/org.eclipse.ui.editors/currentIPOverviewRuler=true
/bundle_defaults/org.eclipse.jdt.ui/content_assist_completion_replacement_background=255,255,0
/bundle_defaults/org.eclipse.wst.jsdt.ui/semanticHighlighting.localVariable.enabled=false
/bundle_defaults/org.eclipse.ui.editors/org.eclipse.cdt.ui.isOverrideIndicatorGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.egit.ui/commit_dialog_signed_off_by=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedDeclaredThrownException=ignore
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.number_of_empty_lines_to_preserve=1
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.typefilter.enabled=
/bundle_defaults/org.eclipse.cdt.ui/content_assist_parameters_background=255,255,255
/bundle_defaults/org.eclipse.cdt.ui/content_assist_autoactivation_trigger_replace_dot_with_arrow=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.staticField.enabled=true
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_before_opening_brace_in_method_declaration=insert
/bundle_defaults/org.eclipse.cdt.dsf.gdb/org.eclipse.cdt.dsf.gdb.commandTimeout=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.inheritedMethodInvocation.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.alignment_for_arguments_in_method_invocation=16
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.annotation.nonnullbydefault=org.eclipse.jdt.annotation.NonNullByDefault
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.parameterVariable.underline=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_argument_bold=true
/bundle_defaults/org.eclipse.cdt.dsf.gdb/defaultGdbInit=.gdbinit
/bundle_defaults/org.eclipse.ui.editors/isOverrideIndicatorGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.function.bold=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_colon_in_default=do not insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.typedef.bold=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.field.italic=false
/instance/org.eclipse.rse.core/useridperkey=localhost.Local\=garrett;
/bundle_defaults/org.eclipse.ui.editors/isSpellingGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_annotation=insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_comma_in_method_declaration_parameters=do not insert
/bundle_defaults/org.eclipse.jdt.ui/cleanup.remove_unused_private_methods=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.comment.insert_new_line_for_parameter=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_parenthesized_expression_in_throw=insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_edit_prompt=only
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.assertIdentifier=warning
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.method.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.optionalSemicolon=warning
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.missingJavadocTags=ignore
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_between_empty_parens_in_annotation_type_member_declaration=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_new_line_in_empty_method_body=insert
/bundle_defaults/org.eclipse.egit.ui/decorator_recompute_ancestors=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.enum.underline=false
/instance/org.eclipse.jdt.ui/org.eclipse.jdt.ui.text.custom_templates=<?xml version\="1.0" encoding\="UTF-8" standalone\="no"?><templates/>
/bundle_defaults/org.eclipse.cdt.ui/c_braces=0,0,0
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.add_missing_nls_tags=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.insert_new_line_for_parameter=insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/org.eclipse.wst.jsdt.ui.ondemandthreshold=99
/bundle_defaults/org.eclipse.ui.editors/warningIndicationInVerticalRuler=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.method.bold=false
/bundle_defaults/org.eclipse.wb.rcp/absoluteLayout.autoSize.onTextImage=false
/bundle_defaults/org.eclipse.ui.editors/jdt.linked.exit.overviewruler=false
/bundle_defaults/org.eclipse.ui.editors/linked.slave.text.style=NONE
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.interface.strikethrough=false
/bundle_defaults/org.eclipse.ui.workbench/coolBarVisible=true
/bundle_defaults/org.eclipse.compare/org.eclipse.compare.NavigationEndAction=prompt
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_key_bold=false
/bundle_defaults/org.eclipse.cdt.ui/removeTrailingWhitespaceEditedLines=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_closing_angle_bracket_in_type_parameters=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_paren_in_method_declaration=do not insert
/bundle_defaults/org.eclipse.jdt.ui/markExceptionOccurrences=true
/bundle_defaults/org.eclipse.jdt.debug.ui/org.eclipse.jdt.debug.ui.javaDebug.SuspendOnUncaughtExceptions=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingJavadocCommentsVisibility=public
/instance/org.eclipse.debug.core//org.eclipse.debug.core.PREFERRED_DELEGATES/org.eclipse.cdt.launch.postmortemLaunchType=org.eclipse.cdt.dsf.gdb.launch.coreCLaunch,debug
/bundle_defaults/org.eclipse.ui.editors/useAnnotationsPrefPage=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_after_opening_angle_bracket_in_parameterized_type_reference=do not insert
/bundle_defaults/org.eclipse.cdt.ui/content_assist_autoinsert=true
/bundle_defaults/org.eclipse.core.net/systemProxiesEnabled=true
/bundle_defaults/org.eclipse.debug.ui/org.eclipse.debug.ui.switch_perspective_on_suspend=prompt
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.typefilter.disabled=
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.includeNullInfoFromAsserts=disabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_opening_bracket_in_array_allocation_expression=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.ui/pf_coloring_comment_bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.problem.missingJavadocCommentsOverriding=disabled
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.rawTypeReference=warning
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_at_in_annotation_type_declaration=insert
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.missingOverrideAnnotationForInterfaceMethodImplementation=enabled
/bundle_defaults/org.eclipse.core.resources/refresh.lightweight.enabled=false
/bundle_defaults/org.eclipse.equinox.p2.ui.sdk.scheduler/enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.indent_switchstatements_compare_to_cases=true
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_brace_in_enum_constant=insert
/bundle_defaults/org.eclipse.ui.editors/javaScriptIsOverrideIndicatorGoToPreviousNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_after_comma_in_superinterfaces=insert
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.methodDeclaration.color=0,0,0
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_semicolon_in_for=insert
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.insert_space_after_colon_in_base_clause=insert
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.deprecatedMember.color=0,0,0
/bundle_defaults/org.eclipse.wb.rcp/general.highlightContainersWithoutBorders=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.functionDeclaration.italic=false
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.wizards.jre.list=JRE+container 5 org.eclipse.jdt.launching.JRE_CONTAINER \# \# false ;JRE_LIB+variable+%28deprecated%29 4 JRE_LIB JRE_SRC JRE_SRCROOT false ;
/bundle_defaults/org.eclipse.cdt.core/indexer/skipFilesLargerThanMB=8
/bundle_defaults/org.eclipse.ui.editors/linked.target.text.style=BOX
/bundle_defaults/org.eclipse.cdt.ui/editor_folding_default_methods=false
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.brace_position_for_annotation_type_declaration=end_of_line
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.class.bold=false
/bundle_defaults/org.eclipse.team.ui/org.eclipse.team.ui.syncview_default_perspective=org.eclipse.team.ui.TeamSynchronizingPerspective
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.processAnnotations=disabled
/bundle_defaults/org.eclipse.cdt.ui/smartPaste=true
/bundle_defaults/org.eclipse.cdt.dsf.gdb/defaultStopAtMainSymbol=main
/bundle_defaults/org.eclipse.core.resources/refresh.enabled=false
/bundle_defaults/org.eclipse.team.cvs.ui/pref_prompt_on_change_granularity=true
/bundle_defaults/org.eclipse.cdt.ui/semanticHighlighting.macroDefinition.enabled=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_bracket=0,0,0
/bundle_defaults/org.eclipse.cdt.ui/spelling_ignore_upper=true
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.taskCaseSensitive=enabled
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.category=true
/bundle_defaults/org.eclipse.jdt.ui/org.eclipse.jdt.ui.importorder=java;javax;org;com
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.compiler.problem.unusedParameter=ignore
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.insert_space_before_comma_in_superinterfaces=do not insert
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.compiler.codegen.unusedLocal=preserve
/bundle_defaults/org.eclipse.jdt.core/org.eclipse.jdt.core.formatter.alignment_for_arguments_in_allocation_expression=16
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.comment.format_block_comments=true
/bundle_defaults/org.eclipse.egit.ui/remote_connection_timeout=30
/bundle_defaults/org.eclipse.ui.workbench/KEYS_PREFERENCE_SELECTED_TAB=0
/bundle_defaults/org.eclipse.wst.jsdt.ui/editor_folding_default_javadoc=false
/bundle_defaults/org.eclipse.wst.jsdt.ui/cleanup.remove_trailing_whitespaces_all=true
/bundle_defaults/org.eclipse.ui.editors/showoverrideIndicatorInNextPrevDropdownToolbarAction=false
/bundle_defaults/org.eclipse.ui.editors/isFilteredSearchResultGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.wb.rcp/property.events.finalParameters=false
/bundle_defaults/org.eclipse.wb.rcp/general.importantPropertiesAfterAdd=false
/bundle_defaults/org.eclipse.ui.editors/isInfoGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.egit.ui/restore_projects_on_checkout=true
/bundle_defaults/org.eclipse.ui.editors/isRevisionAnnotationGoToNextNavigationTarget=false
/bundle_defaults/org.eclipse.jdt.ui/semanticHighlighting.parameterVariable.bold=false
/bundle_defaults/org.eclipse.wst.jsdt.core/org.eclipse.wst.jsdt.core.formatter.insert_space_before_opening_bracket_in_array_type_reference=do not insert
/bundle_defaults/org.eclipse.team.cvs.ui/pref_foldertext_decoration={outgoing_change_flag}{name}  {tag}
/bundle_defaults/org.eclipse.wst.jsdt.ui/java_comment_task_tag_bold=true
/bundle_defaults/org.eclipse.team.cvs.ui/pref_cvs_server=cvs
/bundle_defaults/org.eclipse.cdt.core/org.eclipse.cdt.core.formatter.alignment_for_throws_clause_in_method_declaration=16

*** Current Install Configuration:

Bundles in the system:

Id: com.ibm.icu, Version: 4.4.2.v20110823, Location: reference:file:plugins/com.ibm.icu_4.4.2.v20110823.jar
Id: com.jcraft.jsch, Version: 0.1.46.v201205102330, Location: reference:file:plugins/com.jcraft.jsch_0.1.46.v201205102330.jar
Id: com.sun.el, Version: 2.2.0.v201108011116, Location: reference:file:plugins/com.sun.el_2.2.0.v201108011116.jar
Id: com.sun.syndication, Version: 0.9.0.v200803061811, Location: reference:file:plugins/com.sun.syndication_0.9.0.v200803061811.jar
Id: java_cup.runtime, Version: 0.10.0.v201005080400, Location: reference:file:plugins/java_cup.runtime_0.10.0.v201005080400.jar
Id: javax.activation, Version: 1.1.0.v201108011116, Location: reference:file:plugins/javax.activation_1.1.0.v201108011116.jar
Id: javax.annotation, Version: 1.0.0.v20101115-0725, Location: reference:file:plugins/javax.annotation_1.0.0.v20101115-0725.jar
Id: javax.el, Version: 2.2.0.v201108011116, Location: reference:file:plugins/javax.el_2.2.0.v201108011116.jar
Id: javax.inject, Version: 1.0.0.v20091030, Location: reference:file:plugins/javax.inject_1.0.0.v20091030.jar
Id: javax.jws, Version: 2.0.0.v201005080400, Location: reference:file:plugins/javax.jws_2.0.0.v201005080400.jar
Id: javax.mail, Version: 1.4.0.v201005080615, Location: reference:file:plugins/javax.mail_1.4.0.v201005080615.jar
Id: javax.persistence, Version: 2.0.5.v201212031355, Location: reference:file:plugins/javax.persistence_2.0.5.v201212031355.jar
Id: javax.servlet, Version: 3.0.0.v201112011016, Location: reference:file:plugins/javax.servlet_3.0.0.v201112011016.jar
Id: javax.servlet.jsp, Version: 2.2.0.v201112011158, Location: reference:file:plugins/javax.servlet.jsp_2.2.0.v201112011158.jar
Id: javax.wsdl, Version: 1.5.1.v201012040544, Location: reference:file:plugins/javax.wsdl_1.5.1.v201012040544.jar
Id: javax.wsdl, Version: 1.6.2.v201012040545, Location: reference:file:plugins/javax.wsdl_1.6.2.v201012040545.jar
Id: javax.xml, Version: 1.3.4.v201005080400, Location: reference:file:plugins/javax.xml_1.3.4.v201005080400.jar
Id: javax.xml.bind, Version: 2.1.9.v201005080401, Location: reference:file:plugins/javax.xml.bind_2.1.9.v201005080401.jar
Id: javax.xml.rpc, Version: 1.1.0.v201005080400, Location: reference:file:plugins/javax.xml.rpc_1.1.0.v201005080400/
Id: javax.xml.soap, Version: 1.2.0.v201005080501, Location: reference:file:plugins/javax.xml.soap_1.2.0.v201005080501/
Id: javax.xml.stream, Version: 1.0.1.v201004272200, Location: reference:file:plugins/javax.xml.stream_1.0.1.v201004272200.jar
Id: javax.xml.ws, Version: 2.1.0.v200902101523, Location: reference:file:plugins/javax.xml.ws_2.1.0.v200902101523.jar
Id: net.sourceforge.lpg.lpgjavaruntime, Version: 1.1.0.v201004271650, Location: reference:file:plugins/net.sourceforge.lpg.lpgjavaruntime_1.1.0.v201004271650.jar
Id: org.apache.ant, Version: 1.8.3.v201301120609, Location: reference:file:plugins/org.apache.ant_1.8.3.v201301120609/
Id: org.apache.axis, Version: 1.4.0.v201005080400, Location: reference:file:plugins/org.apache.axis_1.4.0.v201005080400/
Id: org.apache.batik.css, Version: 1.6.0.v201011041432, Location: reference:file:plugins/org.apache.batik.css_1.6.0.v201011041432.jar
Id: org.apache.batik.util, Version: 1.6.0.v201011041432, Location: reference:file:plugins/org.apache.batik.util_1.6.0.v201011041432.jar
Id: org.apache.batik.util.gui, Version: 1.6.0.v201011041432, Location: reference:file:plugins/org.apache.batik.util.gui_1.6.0.v201011041432.jar
Id: org.apache.bcel, Version: 5.2.0.v201005080400, Location: reference:file:plugins/org.apache.bcel_5.2.0.v201005080400.jar
Id: org.apache.commons.codec, Version: 1.3.0.v201101211617, Location: reference:file:plugins/org.apache.commons.codec_1.3.0.v201101211617.jar
Id: org.apache.commons.collections, Version: 3.2.0.v201005080500, Location: reference:file:plugins/org.apache.commons.collections_3.2.0.v201005080500.jar
Id: org.apache.commons.compress, Version: 1.3.0.v201212111400, Location: reference:file:plugins/org.apache.commons.compress_1.3.0.v201212111400.jar
Id: org.apache.commons.discovery, Version: 0.2.0.v201004190315, Location: reference:file:plugins/org.apache.commons.discovery_0.2.0.v201004190315/
Id: org.apache.commons.httpclient, Version: 3.1.0.v201012070820, Location: reference:file:plugins/org.apache.commons.httpclient_3.1.0.v201012070820.jar
Id: org.apache.commons.lang, Version: 2.1.0.v201005080500, Location: reference:file:plugins/org.apache.commons.lang_2.1.0.v201005080500.jar
Id: org.apache.commons.lang, Version: 2.6.0.v201205030909, Location: reference:file:plugins/org.apache.commons.lang_2.6.0.v201205030909.jar
Id: org.apache.commons.logging, Version: 1.0.4.v201101211617, Location: reference:file:plugins/org.apache.commons.logging_1.0.4.v201101211617.jar
Id: org.apache.commons.net, Version: 2.2.0.v201101241833, Location: reference:file:plugins/org.apache.commons.net_2.2.0.v201101241833.jar
Id: org.apache.felix.gogo.command, Version: 0.8.0.v201108120515, Location: reference:file:plugins/org.apache.felix.gogo.command_0.8.0.v201108120515.jar
Id: org.apache.felix.gogo.runtime, Version: 0.8.0.v201108120515, Location: reference:file:plugins/org.apache.felix.gogo.runtime_0.8.0.v201108120515.jar
Id: org.apache.felix.gogo.shell, Version: 0.8.0.v201110170705, Location: reference:file:plugins/org.apache.felix.gogo.shell_0.8.0.v201110170705.jar
Id: org.apache.jasper.glassfish, Version: 2.2.2.v201205150955, Location: reference:file:plugins/org.apache.jasper.glassfish_2.2.2.v201205150955.jar
Id: org.apache.log4j, Version: 1.2.15.v201012070815, Location: reference:file:plugins/org.apache.log4j_1.2.15.v201012070815.jar
Id: org.apache.lucene, Version: 2.9.1.v201101211721, Location: reference:file:plugins/org.apache.lucene_2.9.1.v201101211721.jar
Id: org.apache.lucene.analysis, Version: 2.9.1.v201101211721, Location: reference:file:plugins/org.apache.lucene.analysis_2.9.1.v201101211721.jar
Id: org.apache.lucene.core, Version: 2.9.1.v201101211721, Location: reference:file:plugins/org.apache.lucene.core_2.9.1.v201101211721.jar
Id: org.apache.velocity, Version: 1.5.0.v200905192330, Location: reference:file:plugins/org.apache.velocity_1.5.0.v200905192330.jar
Id: org.apache.ws.commons.util, Version: 1.0.1.v20100518-1140, Location: reference:file:plugins/org.apache.ws.commons.util_1.0.1.v20100518-1140.jar
Id: org.apache.wsil4j, Version: 1.0.0.v200901211807, Location: reference:file:plugins/org.apache.wsil4j_1.0.0.v200901211807.jar
Id: org.apache.xalan, Version: 2.7.1.v201005080400, Location: reference:file:plugins/org.apache.xalan_2.7.1.v201005080400.jar
Id: org.apache.xerces, Version: 2.9.0.v201101211617, Location: reference:file:plugins/org.apache.xerces_2.9.0.v201101211617.jar
Id: org.apache.xml.resolver, Version: 1.2.0.v201005080400, Location: reference:file:plugins/org.apache.xml.resolver_1.2.0.v201005080400.jar
Id: org.apache.xml.serializer, Version: 2.7.1.v201005080400, Location: reference:file:plugins/org.apache.xml.serializer_2.7.1.v201005080400.jar
Id: org.apache.xmlrpc, Version: 3.0.0.v20100427-1100, Location: reference:file:plugins/org.apache.xmlrpc_3.0.0.v20100427-1100.jar
Id: org.eclipse.ant.core, Version: 3.2.401.v20121204-162022, Location: reference:file:plugins/org.eclipse.ant.core_3.2.401.v20121204-162022.jar
Id: org.eclipse.ant.launching, Version: 1.0.200.v20120530-1204, Location: reference:file:plugins/org.eclipse.ant.launching_1.0.200.v20120530-1204.jar
Id: org.eclipse.ant.ui, Version: 3.5.301.v20121210-210948, Location: reference:file:plugins/org.eclipse.ant.ui_3.5.301.v20121210-210948.jar
Id: org.eclipse.cdt, Version: 8.1.1.201302132326, Location: reference:file:plugins/org.eclipse.cdt_8.1.1.201302132326.jar
Id: org.eclipse.cdt.codan.checkers, Version: 1.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.codan.checkers_1.1.0.201302132326.jar
Id: org.eclipse.cdt.codan.checkers.ui, Version: 1.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.codan.checkers.ui_1.1.0.201302132326.jar
Id: org.eclipse.cdt.codan.core, Version: 2.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.codan.core_2.1.0.201302132326.jar
Id: org.eclipse.cdt.codan.core.cxx, Version: 1.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.codan.core.cxx_1.1.0.201302132326.jar
Id: org.eclipse.cdt.codan.ui, Version: 2.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.codan.ui_2.1.0.201302132326.jar
Id: org.eclipse.cdt.codan.ui.cxx, Version: 3.0.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.codan.ui.cxx_3.0.0.201302132326.jar
Id: org.eclipse.cdt.core, Version: 5.4.1.201302132326, Location: reference:file:plugins/org.eclipse.cdt.core_5.4.1.201302132326.jar
Id: org.eclipse.cdt.core.linux, Version: 5.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.core.linux_5.2.0.201302132326.jar
Id: org.eclipse.cdt.core.linux.x86_64, Version: 5.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.core.linux.x86_64_5.2.0.201302132326.jar
Id: org.eclipse.cdt.debug.core, Version: 7.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.debug.core_7.2.0.201302132326.jar
Id: org.eclipse.cdt.debug.mi.core, Version: 7.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.debug.mi.core_7.2.0.201302132326.jar
Id: org.eclipse.cdt.debug.mi.ui, Version: 6.1.1.201302132326, Location: reference:file:plugins/org.eclipse.cdt.debug.mi.ui_6.1.1.201302132326.jar
Id: org.eclipse.cdt.debug.ui, Version: 7.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.debug.ui_7.2.0.201302132326.jar
Id: org.eclipse.cdt.doc.user, Version: 5.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.doc.user_5.2.0.201302132326.jar
Id: org.eclipse.cdt.dsf, Version: 2.3.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.dsf_2.3.0.201302132326.jar
Id: org.eclipse.cdt.dsf.gdb, Version: 4.1.1.201302132326, Location: reference:file:plugins/org.eclipse.cdt.dsf.gdb_4.1.1.201302132326.jar
Id: org.eclipse.cdt.dsf.gdb.ui, Version: 2.3.1.201302132326, Location: reference:file:plugins/org.eclipse.cdt.dsf.gdb.ui_2.3.1.201302132326.jar
Id: org.eclipse.cdt.dsf.ui, Version: 2.3.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.dsf.ui_2.3.0.201302132326.jar
Id: org.eclipse.cdt.gdb, Version: 7.0.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.gdb_7.0.0.201302132326.jar
Id: org.eclipse.cdt.gdb.ui, Version: 7.0.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.gdb.ui_7.0.0.201302132326.jar
Id: org.eclipse.cdt.launch, Version: 7.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.launch_7.1.0.201302132326.jar
Id: org.eclipse.cdt.make.core, Version: 7.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.make.core_7.2.0.201302132326.jar
Id: org.eclipse.cdt.make.ui, Version: 7.2.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.make.ui_7.2.0.201302132326.jar
Id: org.eclipse.cdt.managedbuilder.core, Version: 8.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.managedbuilder.core_8.1.0.201302132326.jar
Id: org.eclipse.cdt.managedbuilder.gnu.ui, Version: 8.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.managedbuilder.gnu.ui_8.1.0.201302132326.jar
Id: org.eclipse.cdt.managedbuilder.ui, Version: 8.1.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.managedbuilder.ui_8.1.0.201302132326.jar
Id: org.eclipse.cdt.ui, Version: 5.5.0.201302132326, Location: reference:file:plugins/org.eclipse.cdt.ui_5.5.0.201302132326.jar
Id: org.eclipse.compare, Version: 3.5.301.v20130125-135424, Location: reference:file:plugins/org.eclipse.compare_3.5.301.v20130125-135424.jar
Id: org.eclipse.compare.core, Version: 3.5.200.v20120522-1148, Location: reference:file:plugins/org.eclipse.compare.core_3.5.200.v20120522-1148.jar
Id: org.eclipse.core.commands, Version: 3.6.2.v20130123-162658, Location: reference:file:plugins/org.eclipse.core.commands_3.6.2.v20130123-162658.jar
Id: org.eclipse.core.contenttype, Version: 3.4.200.v20120523-2004, Location: reference:file:plugins/org.eclipse.core.contenttype_3.4.200.v20120523-2004.jar
Id: org.eclipse.core.databinding, Version: 1.4.1.v20120912-132807, Location: reference:file:plugins/org.eclipse.core.databinding_1.4.1.v20120912-132807.jar
Id: org.eclipse.core.databinding.beans, Version: 1.2.200.v20120523-1955, Location: reference:file:plugins/org.eclipse.core.databinding.beans_1.2.200.v20120523-1955.jar
Id: org.eclipse.core.databinding.observable, Version: 1.4.1.v20120521-2329, Location: reference:file:plugins/org.eclipse.core.databinding.observable_1.4.1.v20120521-2329.jar
Id: org.eclipse.core.databinding.property, Version: 1.4.100.v20120523-1955, Location: reference:file:plugins/org.eclipse.core.databinding.property_1.4.100.v20120523-1955.jar
Id: org.eclipse.core.expressions, Version: 3.4.401.v20120912-155018, Location: reference:file:plugins/org.eclipse.core.expressions_3.4.401.v20120912-155018.jar
Id: org.eclipse.core.externaltools, Version: 1.0.100.v20120521-2012, Location: reference:file:plugins/org.eclipse.core.externaltools_1.0.100.v20120521-2012.jar
Id: org.eclipse.core.filebuffers, Version: 3.5.200.v20120523-1310, Location: reference:file:plugins/org.eclipse.core.filebuffers_3.5.200.v20120523-1310.jar
Id: org.eclipse.core.filesystem, Version: 1.3.200.v20130115-145044, Location: reference:file:plugins/org.eclipse.core.filesystem_1.3.200.v20130115-145044.jar
Id: org.eclipse.core.filesystem.linux.x86_64, Version: 1.2.0.v20120522-1137, Location: reference:file:plugins/org.eclipse.core.filesystem.linux.x86_64_1.2.0.v20120522-1137.jar
Id: org.eclipse.core.jobs, Version: 3.5.300.v20120912-155018, Location: reference:file:plugins/org.eclipse.core.jobs_3.5.300.v20120912-155018.jar
Id: org.eclipse.core.net, Version: 1.2.200.v20120914-093638, Location: reference:file:plugins/org.eclipse.core.net_1.2.200.v20120914-093638.jar
Id: org.eclipse.core.net.linux.x86_64, Version: 1.1.0.v20120522-1148, Location: reference:file:plugins/org.eclipse.core.net.linux.x86_64_1.1.0.v20120522-1148.jar
Id: org.eclipse.core.resources, Version: 3.8.1.v20121114-124432, Location: reference:file:plugins/org.eclipse.core.resources_3.8.1.v20121114-124432.jar
Id: org.eclipse.core.runtime, Version: 3.8.0.v20120912-155025, Location: reference:file:plugins/org.eclipse.core.runtime_3.8.0.v20120912-155025.jar
Id: org.eclipse.core.runtime.compatibility, Version: 3.2.200.v20120521-2346, Location: reference:file:plugins/org.eclipse.core.runtime.compatibility_3.2.200.v20120521-2346.jar
Id: org.eclipse.core.runtime.compatibility.auth, Version: 3.2.300.v20120523-2004, Location: reference:file:plugins/org.eclipse.core.runtime.compatibility.auth_3.2.300.v20120523-2004.jar
Id: org.eclipse.core.runtime.compatibility.registry, Version: 3.5.101.v20130108-163257, Location: reference:file:plugins/org.eclipse.core.runtime.compatibility.registry_3.5.101.v20130108-163257/
Id: org.eclipse.core.variables, Version: 3.2.600.v20120521-2012, Location: reference:file:plugins/org.eclipse.core.variables_3.2.600.v20120521-2012.jar
Id: org.eclipse.cvs, Version: 1.2.1.v201302041200, Location: reference:file:plugins/org.eclipse.cvs_1.2.1.v201302041200.jar
Id: org.eclipse.datatools.common.doc.user, Version: 1.7.0.20090521092446, Location: reference:file:plugins/org.eclipse.datatools.common.doc.user_1.7.0.20090521092446.jar
Id: org.eclipse.datatools.connectivity, Version: 1.2.7.v201302060508, Location: reference:file:plugins/org.eclipse.datatools.connectivity_1.2.7.v201302060508.jar
Id: org.eclipse.datatools.connectivity.apache.derby, Version: 1.0.103.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.apache.derby_1.0.103.v201212070447.jar
Id: org.eclipse.datatools.connectivity.apache.derby.dbdefinition, Version: 1.0.2.v201107221459, Location: reference:file:plugins/org.eclipse.datatools.connectivity.apache.derby.dbdefinition_1.0.2.v201107221459.jar
Id: org.eclipse.datatools.connectivity.apache.derby.ui, Version: 1.0.3.v201107221459, Location: reference:file:plugins/org.eclipse.datatools.connectivity.apache.derby.ui_1.0.3.v201107221459.jar
Id: org.eclipse.datatools.connectivity.console.profile, Version: 1.0.10.v201109250955, Location: reference:file:plugins/org.eclipse.datatools.connectivity.console.profile_1.0.10.v201109250955.jar
Id: org.eclipse.datatools.connectivity.db.generic, Version: 1.0.1.v201107221459, Location: reference:file:plugins/org.eclipse.datatools.connectivity.db.generic_1.0.1.v201107221459.jar
Id: org.eclipse.datatools.connectivity.db.generic.ui, Version: 1.0.2.v201211200622, Location: reference:file:plugins/org.eclipse.datatools.connectivity.db.generic.ui_1.0.2.v201211200622.jar
Id: org.eclipse.datatools.connectivity.dbdefinition.genericJDBC, Version: 1.0.1.v201107221459, Location: reference:file:plugins/org.eclipse.datatools.connectivity.dbdefinition.genericJDBC_1.0.1.v201107221459.jar
Id: org.eclipse.datatools.connectivity.doc.user, Version: 1.7.0.20090521092446, Location: reference:file:plugins/org.eclipse.datatools.connectivity.doc.user_1.7.0.20090521092446.jar
Id: org.eclipse.datatools.connectivity.doc.user.contexts, Version: 1.7.0.20090521092446, Location: reference:file:plugins/org.eclipse.datatools.connectivity.doc.user.contexts_1.7.0.20090521092446.jar
Id: org.eclipse.datatools.connectivity.oda, Version: 3.3.4.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda_3.3.4.v201212070447.jar
Id: org.eclipse.datatools.connectivity.oda.consumer, Version: 3.2.5.v201109151100, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda.consumer_3.2.5.v201109151100.jar
Id: org.eclipse.datatools.connectivity.oda.design, Version: 3.3.6.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda.design_3.3.6.v201212070447.jar
Id: org.eclipse.datatools.connectivity.oda.design.ui, Version: 3.2.8.v201207060816, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda.design.ui_3.2.8.v201207060816.jar
Id: org.eclipse.datatools.connectivity.oda.flatfile, Version: 3.1.4.v201210260850, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda.flatfile_3.1.4.v201210260850.jar
Id: org.eclipse.datatools.connectivity.oda.flatfile.ui, Version: 3.1.5.v201302061811, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda.flatfile.ui_3.1.5.v201302061811.jar
Id: org.eclipse.datatools.connectivity.oda.profile, Version: 3.2.8.v201209080429, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda.profile_3.2.8.v201209080429.jar
Id: org.eclipse.datatools.connectivity.oda.template.ui, Version: 3.2.4.v201301111130, Location: reference:file:plugins/org.eclipse.datatools.connectivity.oda.template.ui_3.2.4.v201301111130.jar
Id: org.eclipse.datatools.connectivity.sqm.core, Version: 1.2.6.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.sqm.core_1.2.6.v201212070447.jar
Id: org.eclipse.datatools.connectivity.sqm.core.ui, Version: 1.2.3.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.sqm.core.ui_1.2.3.v201212070447.jar
Id: org.eclipse.datatools.connectivity.sqm.server.ui, Version: 1.1.101.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.sqm.server.ui_1.1.101.v201212070447.jar
Id: org.eclipse.datatools.connectivity.ui, Version: 1.2.4.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.ui_1.2.4.v201212070447.jar
Id: org.eclipse.datatools.connectivity.ui.dse, Version: 1.1.5.v201212070447, Location: reference:file:plugins/org.eclipse.datatools.connectivity.ui.dse_1.1.5.v201212070447.jar
Id: org.eclipse.datatools.doc.user, Version: 1.7.0.20090521092446, Location: reference:file:plugins/org.eclipse.datatools.doc.user_1.7.0.20090521092446.jar
Id: org.eclipse.datatools.enablement.finfo, Version: 1.5.1.v200906161800, Location: reference:file:plugins/org.eclipse.datatools.enablement.finfo_1.5.1.v200906161800.jar
Id: org.eclipse.datatools.enablement.hsqldb, Version: 1.0.0.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.hsqldb_1.0.0.v201107221502.jar
Id: org.eclipse.datatools.enablement.hsqldb.dbdefinition, Version: 1.0.0.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.hsqldb.dbdefinition_1.0.0.v201107221502.jar
Id: org.eclipse.datatools.enablement.hsqldb.ui, Version: 1.0.0.v201108120600, Location: reference:file:plugins/org.eclipse.datatools.enablement.hsqldb.ui_1.0.0.v201108120600.jar
Id: org.eclipse.datatools.enablement.ibm.db2.iseries, Version: 1.0.2.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.iseries_1.0.2.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.db2.iseries.dbdefinition, Version: 1.0.3.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.iseries.dbdefinition_1.0.3.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.db2.iseries.ui, Version: 1.0.3.v201212120614, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.iseries.ui_1.0.3.v201212120614.jar
Id: org.eclipse.datatools.enablement.ibm.db2.luw, Version: 1.0.2.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.luw_1.0.2.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.db2.luw.dbdefinition, Version: 1.0.4.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.luw.dbdefinition_1.0.4.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.db2.luw.ui, Version: 1.0.4.v201212120614, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.luw.ui_1.0.4.v201212120614.jar
Id: org.eclipse.datatools.enablement.ibm.db2.zseries, Version: 1.0.2.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.zseries_1.0.2.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.db2.zseries.dbdefinition, Version: 1.0.4.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.zseries.dbdefinition_1.0.4.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.db2.zseries.ui, Version: 1.0.2.v201202100836, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.db2.zseries.ui_1.0.2.v201202100836.jar
Id: org.eclipse.datatools.enablement.ibm.informix, Version: 1.0.1.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.informix_1.0.1.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.informix.dbdefinition, Version: 1.0.4.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.informix.dbdefinition_1.0.4.v201107221502.jar
Id: org.eclipse.datatools.enablement.ibm.informix.ui, Version: 1.0.3.v201202100836, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.informix.ui_1.0.3.v201202100836.jar
Id: org.eclipse.datatools.enablement.ibm.ui, Version: 1.0.0.v201107221502, Location: reference:file:plugins/org.eclipse.datatools.enablement.ibm.ui_1.0.0.v201107221502.jar
Id: org.eclipse.datatools.enablement.ingres, Version: 1.0.0.v200906111150, Location: reference:file:plugins/org.eclipse.datatools.enablement.ingres_1.0.0.v200906111150.jar
Id: org.eclipse.datatools.enablement.ingres.dbdefinition, Version: 1.0.0.v200906161800, Location: reference:file:plugins/org.eclipse.datatools.enablement.ingres.dbdefinition_1.0.0.v200906161800.jar
Id: org.eclipse.datatools.enablement.ingres.ui, Version: 1.0.0.v201105270214, Location: reference:file:plugins/org.eclipse.datatools.enablement.ingres.ui_1.0.0.v201105270214.jar
Id: org.eclipse.datatools.enablement.jdt.classpath, Version: 1.0.1.v201107221501, Location: reference:file:plugins/org.eclipse.datatools.enablement.jdt.classpath_1.0.1.v201107221501.jar
Id: org.eclipse.datatools.enablement.msft.sqlserver, Version: 1.0.2.v201212120617, Location: reference:file:plugins/org.eclipse.datatools.enablement.msft.sqlserver_1.0.2.v201212120617.jar
Id: org.eclipse.datatools.enablement.msft.sqlserver.dbdefinition, Version: 1.0.1.v201201240505, Location: reference:file:plugins/org.eclipse.datatools.enablement.msft.sqlserver.dbdefinition_1.0.1.v201201240505.jar
Id: org.eclipse.datatools.enablement.msft.sqlserver.ui, Version: 1.0.3.v201212120617, Location: reference:file:plugins/org.eclipse.datatools.enablement.msft.sqlserver.ui_1.0.3.v201212120617.jar
Id: org.eclipse.datatools.enablement.mysql, Version: 1.0.4.v201212120617, Location: reference:file:plugins/org.eclipse.datatools.enablement.mysql_1.0.4.v201212120617.jar
Id: org.eclipse.datatools.enablement.mysql.dbdefinition, Version: 1.0.4.v201109022331, Location: reference:file:plugins/org.eclipse.datatools.enablement.mysql.dbdefinition_1.0.4.v201109022331.jar
Id: org.eclipse.datatools.enablement.mysql.ui, Version: 1.0.0.v201109022331, Location: reference:file:plugins/org.eclipse.datatools.enablement.mysql.ui_1.0.0.v201109022331.jar
Id: org.eclipse.datatools.enablement.oda.ws, Version: 1.2.4.v201203221631, Location: reference:file:plugins/org.eclipse.datatools.enablement.oda.ws_1.2.4.v201203221631.jar
Id: org.eclipse.datatools.enablement.oda.ws.ui, Version: 1.2.4.v201203221631, Location: reference:file:plugins/org.eclipse.datatools.enablement.oda.ws.ui_1.2.4.v201203221631.jar
Id: org.eclipse.datatools.enablement.oda.xml, Version: 1.2.4.v201301161136, Location: reference:file:plugins/org.eclipse.datatools.enablement.oda.xml_1.2.4.v201301161136.jar
Id: org.eclipse.datatools.enablement.oda.xml.ui, Version: 1.2.4.v201302041603, Location: reference:file:plugins/org.eclipse.datatools.enablement.oda.xml.ui_1.2.4.v201302041603.jar
Id: org.eclipse.datatools.enablement.oracle, Version: 1.0.0.v201107221506, Location: reference:file:plugins/org.eclipse.datatools.enablement.oracle_1.0.0.v201107221506.jar
Id: org.eclipse.datatools.enablement.oracle.dbdefinition, Version: 1.0.103.v201206010214, Location: reference:file:plugins/org.eclipse.datatools.enablement.oracle.dbdefinition_1.0.103.v201206010214.jar
Id: org.eclipse.datatools.enablement.oracle.ui, Version: 1.0.3.v201201131121, Location: reference:file:plugins/org.eclipse.datatools.enablement.oracle.ui_1.0.3.v201201131121.jar
Id: org.eclipse.datatools.enablement.postgresql, Version: 1.1.1.v201205252207, Location: reference:file:plugins/org.eclipse.datatools.enablement.postgresql_1.1.1.v201205252207.jar
Id: org.eclipse.datatools.enablement.postgresql.dbdefinition, Version: 1.0.2.v201110070445, Location: reference:file:plugins/org.eclipse.datatools.enablement.postgresql.dbdefinition_1.0.2.v201110070445.jar
Id: org.eclipse.datatools.enablement.postgresql.ui, Version: 1.0.0.v201107221506, Location: reference:file:plugins/org.eclipse.datatools.enablement.postgresql.ui_1.0.0.v201107221506.jar
Id: org.eclipse.datatools.enablement.sap.maxdb, Version: 1.0.0.v201107221507, Location: reference:file:plugins/org.eclipse.datatools.enablement.sap.maxdb_1.0.0.v201107221507.jar
Id: org.eclipse.datatools.enablement.sap.maxdb.dbdefinition, Version: 1.0.0.v201107221507, Location: reference:file:plugins/org.eclipse.datatools.enablement.sap.maxdb.dbdefinition_1.0.0.v201107221507.jar
Id: org.eclipse.datatools.enablement.sap.maxdb.ui, Version: 1.0.0.v201107221507, Location: reference:file:plugins/org.eclipse.datatools.enablement.sap.maxdb.ui_1.0.0.v201107221507.jar
Id: org.eclipse.datatools.enablement.sqlite, Version: 1.0.0.v201002041100, Location: reference:file:plugins/org.eclipse.datatools.enablement.sqlite_1.0.0.v201002041100.jar
Id: org.eclipse.datatools.enablement.sqlite.dbdefinition, Version: 1.0.2.v201206010441, Location: reference:file:plugins/org.eclipse.datatools.enablement.sqlite.dbdefinition_1.0.2.v201206010441.jar
Id: org.eclipse.datatools.enablement.sqlite.ui, Version: 1.0.0.v201107221507, Location: reference:file:plugins/org.eclipse.datatools.enablement.sqlite.ui_1.0.0.v201107221507.jar
Id: org.eclipse.datatools.enablement.sybase, Version: 1.0.1.v201107221507, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase_1.0.1.v201107221507.jar
Id: org.eclipse.datatools.enablement.sybase.asa, Version: 1.0.2.v201212120618, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.asa_1.0.2.v201212120618.jar
Id: org.eclipse.datatools.enablement.sybase.asa.dbdefinition, Version: 1.0.0.v200906161800, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.asa.dbdefinition_1.0.0.v200906161800.jar
Id: org.eclipse.datatools.enablement.sybase.asa.models, Version: 1.0.0.v201107221507, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.asa.models_1.0.0.v201107221507.jar
Id: org.eclipse.datatools.enablement.sybase.asa.schemaobjecteditor.examples, Version: 2.5.0.200810071, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.asa.schemaobjecteditor.examples_2.5.0.200810071.jar
Id: org.eclipse.datatools.enablement.sybase.asa.ui, Version: 1.0.1.v200906111204, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.asa.ui_1.0.1.v200906111204.jar
Id: org.eclipse.datatools.enablement.sybase.ase, Version: 1.0.3.v201212120618, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.ase_1.0.3.v201212120618.jar
Id: org.eclipse.datatools.enablement.sybase.ase.dbdefinition, Version: 1.0.0.v201107221507, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.ase.dbdefinition_1.0.0.v201107221507.jar
Id: org.eclipse.datatools.enablement.sybase.ase.models, Version: 1.0.1.v201010140307, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.ase.models_1.0.1.v201010140307.jar
Id: org.eclipse.datatools.enablement.sybase.ase.ui, Version: 1.0.1.v200906020900, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.ase.ui_1.0.1.v200906020900.jar
Id: org.eclipse.datatools.enablement.sybase.models, Version: 1.0.0.v201010140307, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.models_1.0.0.v201010140307.jar
Id: org.eclipse.datatools.enablement.sybase.ui, Version: 1.0.0.v200906090452, Location: reference:file:plugins/org.eclipse.datatools.enablement.sybase.ui_1.0.0.v200906090452.jar
Id: org.eclipse.datatools.help, Version: 1.5.0.v200906020553, Location: reference:file:plugins/org.eclipse.datatools.help_1.5.0.v200906020553.jar
Id: org.eclipse.datatools.intro, Version: 1.7.0.v201005281800, Location: reference:file:plugins/org.eclipse.datatools.intro_1.7.0.v201005281800.jar
Id: org.eclipse.datatools.modelbase.dbdefinition, Version: 1.0.2.v201107221519, Location: reference:file:plugins/org.eclipse.datatools.modelbase.dbdefinition_1.0.2.v201107221519.jar
Id: org.eclipse.datatools.modelbase.derby, Version: 1.0.0.v201107221519, Location: reference:file:plugins/org.eclipse.datatools.modelbase.derby_1.0.0.v201107221519.jar
Id: org.eclipse.datatools.modelbase.sql, Version: 1.0.6.v201208230744, Location: reference:file:plugins/org.eclipse.datatools.modelbase.sql_1.0.6.v201208230744.jar
Id: org.eclipse.datatools.modelbase.sql.edit, Version: 1.0.2.v201208230744, Location: reference:file:plugins/org.eclipse.datatools.modelbase.sql.edit_1.0.2.v201208230744.jar
Id: org.eclipse.datatools.modelbase.sql.query, Version: 1.1.4.v201212120619, Location: reference:file:plugins/org.eclipse.datatools.modelbase.sql.query_1.1.4.v201212120619.jar
Id: org.eclipse.datatools.modelbase.sql.query.edit, Version: 1.0.1.v201110151245, Location: reference:file:plugins/org.eclipse.datatools.modelbase.sql.query.edit_1.0.1.v201110151245.jar
Id: org.eclipse.datatools.modelbase.sql.xml.query, Version: 1.0.2.v201201131123, Location: reference:file:plugins/org.eclipse.datatools.modelbase.sql.xml.query_1.0.2.v201201131123.jar
Id: org.eclipse.datatools.oda.cshelp, Version: 1.1.1.v201107221500, Location: reference:file:plugins/org.eclipse.datatools.oda.cshelp_1.1.1.v201107221500.jar
Id: org.eclipse.datatools.sqltools.common.ui, Version: 1.0.1.v201212120623, Location: reference:file:plugins/org.eclipse.datatools.sqltools.common.ui_1.0.1.v201212120623.jar
Id: org.eclipse.datatools.sqltools.data.core, Version: 1.2.3.v201212120623, Location: reference:file:plugins/org.eclipse.datatools.sqltools.data.core_1.2.3.v201212120623.jar
Id: org.eclipse.datatools.sqltools.data.ui, Version: 1.2.2.v201212120623, Location: reference:file:plugins/org.eclipse.datatools.sqltools.data.ui_1.2.2.v201212120623.jar
Id: org.eclipse.datatools.sqltools.db.derby, Version: 1.0.0.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.db.derby_1.0.0.v201107221520.jar
Id: org.eclipse.datatools.sqltools.db.derby.ui, Version: 1.0.0.v200906020900, Location: reference:file:plugins/org.eclipse.datatools.sqltools.db.derby.ui_1.0.0.v200906020900.jar
Id: org.eclipse.datatools.sqltools.db.generic, Version: 1.0.0.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.db.generic_1.0.0.v201107221520.jar
Id: org.eclipse.datatools.sqltools.db.generic.ui, Version: 1.0.0.v200906020900, Location: reference:file:plugins/org.eclipse.datatools.sqltools.db.generic.ui_1.0.0.v200906020900.jar
Id: org.eclipse.datatools.sqltools.ddlgen.ui, Version: 1.0.3.v201211200616, Location: reference:file:plugins/org.eclipse.datatools.sqltools.ddlgen.ui_1.0.3.v201211200616.jar
Id: org.eclipse.datatools.sqltools.debugger.core, Version: 1.0.1.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.debugger.core_1.0.1.v201107221520.jar
Id: org.eclipse.datatools.sqltools.debugger.core.ui, Version: 1.0.0.v201003161000, Location: reference:file:plugins/org.eclipse.datatools.sqltools.debugger.core.ui_1.0.0.v201003161000.jar
Id: org.eclipse.datatools.sqltools.doc.user, Version: 1.7.0.20090521092446, Location: reference:file:plugins/org.eclipse.datatools.sqltools.doc.user_1.7.0.20090521092446.jar
Id: org.eclipse.datatools.sqltools.doc.user.contexts, Version: 1.7.0.20090521092446, Location: reference:file:plugins/org.eclipse.datatools.sqltools.doc.user.contexts_1.7.0.20090521092446.jar
Id: org.eclipse.datatools.sqltools.editor.core, Version: 1.0.3.v201212120623, Location: reference:file:plugins/org.eclipse.datatools.sqltools.editor.core_1.0.3.v201212120623.jar
Id: org.eclipse.datatools.sqltools.editor.core.ui, Version: 1.0.0.v201001150815, Location: reference:file:plugins/org.eclipse.datatools.sqltools.editor.core.ui_1.0.0.v201001150815.jar
Id: org.eclipse.datatools.sqltools.parsers.sql, Version: 1.0.2.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.parsers.sql_1.0.2.v201107221520.jar
Id: org.eclipse.datatools.sqltools.parsers.sql.lexer, Version: 1.0.1.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.parsers.sql.lexer_1.0.1.v201107221520.jar
Id: org.eclipse.datatools.sqltools.parsers.sql.query, Version: 1.2.1.v201201250511, Location: reference:file:plugins/org.eclipse.datatools.sqltools.parsers.sql.query_1.2.1.v201201250511.jar
Id: org.eclipse.datatools.sqltools.parsers.sql.xml.query, Version: 1.0.0.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.parsers.sql.xml.query_1.0.0.v201107221520.jar
Id: org.eclipse.datatools.sqltools.plan, Version: 1.0.0.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.plan_1.0.0.v201107221520.jar
Id: org.eclipse.datatools.sqltools.result, Version: 1.1.6.v201302050842, Location: reference:file:plugins/org.eclipse.datatools.sqltools.result_1.1.6.v201302050842.jar
Id: org.eclipse.datatools.sqltools.result.ui, Version: 1.1.3.v201302061703, Location: reference:file:plugins/org.eclipse.datatools.sqltools.result.ui_1.1.3.v201302061703.jar
Id: org.eclipse.datatools.sqltools.routineeditor, Version: 1.0.0.v201107221520, Location: reference:file:plugins/org.eclipse.datatools.sqltools.routineeditor_1.0.0.v201107221520.jar
Id: org.eclipse.datatools.sqltools.routineeditor.ui, Version: 1.0.3.v201211200616, Location: reference:file:plugins/org.eclipse.datatools.sqltools.routineeditor.ui_1.0.3.v201211200616.jar
Id: org.eclipse.datatools.sqltools.schemaobjecteditor, Version: 1.1.0.v200906022302, Location: reference:file:plugins/org.eclipse.datatools.sqltools.schemaobjecteditor_1.1.0.v200906022302.jar
Id: org.eclipse.datatools.sqltools.schemaobjecteditor.ui, Version: 1.1.1.200810071, Location: reference:file:plugins/org.eclipse.datatools.sqltools.schemaobjecteditor.ui_1.1.1.200810071.jar
Id: org.eclipse.datatools.sqltools.schemaobjecteditor.ui.pages, Version: 1.1.1.200810071, Location: reference:file:plugins/org.eclipse.datatools.sqltools.schemaobjecteditor.ui.pages_1.1.1.200810071.jar
Id: org.eclipse.datatools.sqltools.sql, Version: 1.0.1.v201110050515, Location: reference:file:plugins/org.eclipse.datatools.sqltools.sql_1.0.1.v201110050515.jar
Id: org.eclipse.datatools.sqltools.sql.ui, Version: 1.0.1.v201201270735, Location: reference:file:plugins/org.eclipse.datatools.sqltools.sql.ui_1.0.1.v201201270735.jar
Id: org.eclipse.datatools.sqltools.sqlbuilder, Version: 1.0.5.v201212120623, Location: reference:file:plugins/org.eclipse.datatools.sqltools.sqlbuilder_1.0.5.v201212120623.jar
Id: org.eclipse.datatools.sqltools.sqleditor, Version: 1.0.4.v201212120623, Location: reference:file:plugins/org.eclipse.datatools.sqltools.sqleditor_1.0.4.v201212120623.jar
Id: org.eclipse.datatools.sqltools.sqlscrapbook, Version: 1.0.2.v201205310922, Location: reference:file:plugins/org.eclipse.datatools.sqltools.sqlscrapbook_1.0.2.v201205310922.jar
Id: org.eclipse.datatools.sqltools.tabledataeditor, Version: 1.0.2.v201212120623, Location: reference:file:plugins/org.eclipse.datatools.sqltools.tabledataeditor_1.0.2.v201212120623.jar
Id: org.eclipse.debug.core, Version: 3.7.100.v20120521-2012, Location: reference:file:plugins/org.eclipse.debug.core_3.7.100.v20120521-2012.jar
Id: org.eclipse.debug.ui, Version: 3.8.2.v20130130-171415, Location: reference:file:plugins/org.eclipse.debug.ui_3.8.2.v20130130-171415.jar
Id: org.eclipse.draw2d, Version: 3.9.0.201212170307, Location: reference:file:plugins/org.eclipse.draw2d_3.9.0.201212170307.jar
Id: org.eclipse.dstore.core, Version: 3.3.101.201302071946, Location: reference:file:plugins/org.eclipse.dstore.core_3.3.101.201302071946.jar
Id: org.eclipse.dstore.extra, Version: 2.1.400.201211090626, Location: reference:file:plugins/org.eclipse.dstore.extra_2.1.400.201211090626.jar
Id: org.eclipse.e4.core.commands, Version: 0.10.1.v20120523-1955, Location: reference:file:plugins/org.eclipse.e4.core.commands_0.10.1.v20120523-1955.jar
Id: org.eclipse.e4.core.contexts, Version: 1.2.0.v20121221-192508, Location: reference:file:plugins/org.eclipse.e4.core.contexts_1.2.0.v20121221-192508.jar
Id: org.eclipse.e4.core.di, Version: 1.2.0.v20121024-173149, Location: reference:file:plugins/org.eclipse.e4.core.di_1.2.0.v20121024-173149.jar
Id: org.eclipse.e4.core.di.extensions, Version: 0.11.100.v20121024-182359, Location: reference:file:plugins/org.eclipse.e4.core.di.extensions_0.11.100.v20121024-182359.jar
Id: org.eclipse.e4.core.services, Version: 1.0.0.v20120521-2346, Location: reference:file:plugins/org.eclipse.e4.core.services_1.0.0.v20120521-2346.jar
Id: org.eclipse.e4.ui.bindings, Version: 0.10.3.v20130123-162658, Location: reference:file:plugins/org.eclipse.e4.ui.bindings_0.10.3.v20130123-162658.jar
Id: org.eclipse.e4.ui.css.core, Version: 0.10.2.v20120912-132817, Location: reference:file:plugins/org.eclipse.e4.ui.css.core_0.10.2.v20120912-132817.jar
Id: org.eclipse.e4.ui.css.swt, Version: 0.10.3.v20130123-162658, Location: reference:file:plugins/org.eclipse.e4.ui.css.swt_0.10.3.v20130123-162658.jar
Id: org.eclipse.e4.ui.css.swt.theme, Version: 0.9.4.v20130123-162658, Location: reference:file:plugins/org.eclipse.e4.ui.css.swt.theme_0.9.4.v20130123-162658.jar
Id: org.eclipse.e4.ui.di, Version: 0.10.1.v20120523-1955, Location: reference:file:plugins/org.eclipse.e4.ui.di_0.10.1.v20120523-1955.jar
Id: org.eclipse.e4.ui.model.workbench, Version: 0.10.1.v20120523-1955, Location: reference:file:plugins/org.eclipse.e4.ui.model.workbench_0.10.1.v20120523-1955.jar
Id: org.eclipse.e4.ui.services, Version: 0.10.3.v20130123-162658, Location: reference:file:plugins/org.eclipse.e4.ui.services_0.10.3.v20130123-162658.jar
Id: org.eclipse.e4.ui.widgets, Version: 0.12.3.v20130123-162658, Location: reference:file:plugins/org.eclipse.e4.ui.widgets_0.12.3.v20130123-162658.jar
Id: org.eclipse.e4.ui.workbench, Version: 0.11.0.v20130125-100758, Location: reference:file:plugins/org.eclipse.e4.ui.workbench_0.11.0.v20130125-100758.jar
Id: org.eclipse.e4.ui.workbench.addons.swt, Version: 0.10.3.v20130124-185622, Location: reference:file:plugins/org.eclipse.e4.ui.workbench.addons.swt_0.10.3.v20130124-185622.jar
Id: org.eclipse.e4.ui.workbench.renderers.swt, Version: 0.10.3.v20130124-170312, Location: reference:file:plugins/org.eclipse.e4.ui.workbench.renderers.swt_0.10.3.v20130124-170312.jar
Id: org.eclipse.e4.ui.workbench.swt, Version: 0.10.3.v20130124-133900, Location: reference:file:plugins/org.eclipse.e4.ui.workbench.swt_0.10.3.v20130124-133900.jar
Id: org.eclipse.e4.ui.workbench3, Version: 0.12.0.v20120521-2329, Location: reference:file:plugins/org.eclipse.e4.ui.workbench3_0.12.0.v20120521-2329.jar
Id: org.eclipse.ecf, Version: 3.1.300.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf_3.1.300.v20120610-1946.jar
Id: org.eclipse.ecf.filetransfer, Version: 5.0.0.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf.filetransfer_5.0.0.v20120610-1946.jar
Id: org.eclipse.ecf.identity, Version: 3.1.200.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf.identity_3.1.200.v20120610-1946.jar
Id: org.eclipse.ecf.provider.filetransfer, Version: 3.2.0.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf.provider.filetransfer_3.2.0.v20120610-1946.jar
Id: org.eclipse.ecf.provider.filetransfer.httpclient, Version: 4.0.200.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf.provider.filetransfer.httpclient_4.0.200.v20120610-1946.jar
Id: org.eclipse.ecf.provider.filetransfer.httpclient.ssl, Version: 1.0.0.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf.provider.filetransfer.httpclient.ssl_1.0.0.v20120610-1946.jar
Id: org.eclipse.ecf.provider.filetransfer.ssl, Version: 1.0.0.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf.provider.filetransfer.ssl_1.0.0.v20120610-1946.jar
Id: org.eclipse.ecf.ssl, Version: 1.0.100.v20120610-1946, Location: reference:file:plugins/org.eclipse.ecf.ssl_1.0.100.v20120610-1946.jar
Id: org.eclipse.egit, Version: 2.2.0.201212191850-r, Location: reference:file:plugins/org.eclipse.egit_2.2.0.201212191850-r.jar
Id: org.eclipse.egit.core, Version: 2.2.0.201212191850-r, Location: reference:file:plugins/org.eclipse.egit.core_2.2.0.201212191850-r.jar
Id: org.eclipse.egit.doc, Version: 2.2.0.201212191850-r, Location: reference:file:plugins/org.eclipse.egit.doc_2.2.0.201212191850-r.jar
Id: org.eclipse.egit.mylyn.ui, Version: 2.2.0.201212191850-r, Location: reference:file:plugins/org.eclipse.egit.mylyn.ui_2.2.0.201212191850-r.jar
Id: org.eclipse.egit.ui, Version: 2.2.0.201212191850-r, Location: reference:file:plugins/org.eclipse.egit.ui_2.2.0.201212191850-r.jar
Id: org.eclipse.emf, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.ant, Version: 2.7.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.ant_2.7.0.v20130125-0826.jar
Id: org.eclipse.emf.codegen, Version: 2.8.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.codegen_2.8.0.v20130125-0826.jar
Id: org.eclipse.emf.codegen.ecore, Version: 2.8.2.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.codegen.ecore_2.8.2.v20130125-0826.jar
Id: org.eclipse.emf.codegen.ecore.ui, Version: 2.8.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.codegen.ecore.ui_2.8.0.v20130125-0826.jar
Id: org.eclipse.emf.codegen.ui, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.codegen.ui_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.common, Version: 2.8.0.v20130125-0546, Location: reference:file:plugins/org.eclipse.emf.common_2.8.0.v20130125-0546.jar
Id: org.eclipse.emf.common.ui, Version: 2.7.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.common.ui_2.7.0.v20130125-0826.jar
Id: org.eclipse.emf.converter, Version: 2.5.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.converter_2.5.0.v20130125-0826.jar
Id: org.eclipse.emf.databinding, Version: 1.2.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.databinding_1.2.0.v20130125-0826.jar
Id: org.eclipse.emf.databinding.edit, Version: 1.2.1.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.databinding.edit_1.2.1.v20130125-0826.jar
Id: org.eclipse.emf.ecore, Version: 2.8.3.v20130125-0546, Location: reference:file:plugins/org.eclipse.emf.ecore_2.8.3.v20130125-0546.jar
Id: org.eclipse.emf.ecore.change, Version: 2.8.0.v20130125-0546, Location: reference:file:plugins/org.eclipse.emf.ecore.change_2.8.0.v20130125-0546.jar
Id: org.eclipse.emf.ecore.change.edit, Version: 2.5.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.ecore.change.edit_2.5.0.v20130125-0826.jar
Id: org.eclipse.emf.ecore.edit, Version: 2.8.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.ecore.edit_2.8.0.v20130125-0826.jar
Id: org.eclipse.emf.ecore.editor, Version: 2.8.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.ecore.editor_2.8.0.v20130125-0826.jar
Id: org.eclipse.emf.ecore.xmi, Version: 2.8.1.v20130125-0546, Location: reference:file:plugins/org.eclipse.emf.ecore.xmi_2.8.1.v20130125-0546.jar
Id: org.eclipse.emf.edit, Version: 2.8.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.edit_2.8.0.v20130125-0826.jar
Id: org.eclipse.emf.edit.ui, Version: 2.8.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.edit.ui_2.8.0.v20130125-0826.jar
Id: org.eclipse.emf.exporter, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.exporter_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.importer, Version: 2.7.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.importer_2.7.0.v20130125-0826.jar
Id: org.eclipse.emf.importer.ecore, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.importer.ecore_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.importer.java, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.importer.java_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.importer.rose, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.importer.rose_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping, Version: 2.7.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping_2.7.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping.ecore, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping.ecore_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping.ecore.editor, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping.ecore.editor_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping.ecore2ecore, Version: 2.7.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping.ecore2ecore_2.7.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping.ecore2ecore.editor, Version: 2.5.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping.ecore2ecore.editor_2.5.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping.ecore2xml, Version: 2.7.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping.ecore2xml_2.7.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping.ecore2xml.ui, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping.ecore2xml.ui_2.6.0.v20130125-0826.jar
Id: org.eclipse.emf.mapping.ui, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.emf.mapping.ui_2.6.0.v20130125-0826.jar
Id: org.eclipse.epp.mpc.core, Version: 1.1.1.I20110907-0947, Location: reference:file:plugins/org.eclipse.epp.mpc.core_1.1.1.I20110907-0947.jar
Id: org.eclipse.epp.mpc.help.ui, Version: 1.1.1.I20110907-0947, Location: reference:file:plugins/org.eclipse.epp.mpc.help.ui_1.1.1.I20110907-0947.jar
Id: org.eclipse.epp.mpc.ui, Version: 1.1.1.I20110907-0947, Location: reference:file:plugins/org.eclipse.epp.mpc.ui_1.1.1.I20110907-0947.jar
Id: org.eclipse.epp.package.jee, Version: 1.5.2.20130110-1126, Location: reference:file:plugins/org.eclipse.epp.package.jee_1.5.2.20130110-1126/
Id: org.eclipse.equinox.app, Version: 1.3.100.v20120522-1841, Location: reference:file:plugins/org.eclipse.equinox.app_1.3.100.v20120522-1841.jar
Id: org.eclipse.equinox.bidi, Version: 0.9.100.v20121107-021609, Location: reference:file:plugins/org.eclipse.equinox.bidi_0.9.100.v20121107-021609.jar
Id: org.eclipse.equinox.common, Version: 3.6.100.v20120522-1841, Location: reference:file:plugins/org.eclipse.equinox.common_3.6.100.v20120522-1841.jar
Id: org.eclipse.equinox.concurrent, Version: 1.0.300.v20120912-130548, Location: reference:file:plugins/org.eclipse.equinox.concurrent_1.0.300.v20120912-130548.jar
Id: org.eclipse.equinox.console, Version: 1.0.0.v20120522-1841, Location: reference:file:plugins/org.eclipse.equinox.console_1.0.0.v20120522-1841.jar
Id: org.eclipse.equinox.ds, Version: 1.4.1.v20120926-201320, Location: reference:file:plugins/org.eclipse.equinox.ds_1.4.1.v20120926-201320.jar
Id: org.eclipse.equinox.event, Version: 1.2.200.v20120522-2049, Location: reference:file:plugins/org.eclipse.equinox.event_1.2.200.v20120522-2049.jar
Id: org.eclipse.equinox.frameworkadmin, Version: 2.0.100.v20120913-155515, Location: reference:file:plugins/org.eclipse.equinox.frameworkadmin_2.0.100.v20120913-155515.jar
Id: org.eclipse.equinox.frameworkadmin.equinox, Version: 1.0.400.v20120913-155709, Location: reference:file:plugins/org.eclipse.equinox.frameworkadmin.equinox_1.0.400.v20120913-155709.jar
Id: org.eclipse.equinox.http.jetty, Version: 3.0.1.v20121109-203239, Location: reference:file:plugins/org.eclipse.equinox.http.jetty_3.0.1.v20121109-203239.jar
Id: org.eclipse.equinox.http.registry, Version: 1.1.200.v20120912-130548, Location: reference:file:plugins/org.eclipse.equinox.http.registry_1.1.200.v20120912-130548.jar
Id: org.eclipse.equinox.http.servlet, Version: 1.1.300.v20120912-130548, Location: reference:file:plugins/org.eclipse.equinox.http.servlet_1.1.300.v20120912-130548.jar
Id: org.eclipse.equinox.jsp.jasper, Version: 1.0.400.v20120912-130548, Location: reference:file:plugins/org.eclipse.equinox.jsp.jasper_1.0.400.v20120912-130548.jar
Id: org.eclipse.equinox.jsp.jasper.registry, Version: 1.0.300.v20120912-130548, Location: reference:file:plugins/org.eclipse.equinox.jsp.jasper.registry_1.0.300.v20120912-130548.jar
Id: org.eclipse.equinox.launcher, Version: 1.3.0.v20120522-1813, Location: reference:file:plugins/org.eclipse.equinox.launcher_1.3.0.v20120522-1813.jar
Id: org.eclipse.equinox.launcher.gtk.linux.x86_64, Version: 1.1.200.v20120913-144807, Location: reference:file:plugins/org.eclipse.equinox.launcher.gtk.linux.x86_64_1.1.200.v20120913-144807/
Id: org.eclipse.equinox.p2.artifact.repository, Version: 1.1.200.v20120430-1959, Location: reference:file:plugins/org.eclipse.equinox.p2.artifact.repository_1.1.200.v20120430-1959.jar
Id: org.eclipse.equinox.p2.console, Version: 1.0.300.v20120429-0125, Location: reference:file:plugins/org.eclipse.equinox.p2.console_1.0.300.v20120429-0125.jar
Id: org.eclipse.equinox.p2.core, Version: 2.2.0.v20120430-0525, Location: reference:file:plugins/org.eclipse.equinox.p2.core_2.2.0.v20120430-0525.jar
Id: org.eclipse.equinox.p2.director, Version: 2.2.0.v20120524-0542, Location: reference:file:plugins/org.eclipse.equinox.p2.director_2.2.0.v20120524-0542.jar
Id: org.eclipse.equinox.p2.director.app, Version: 1.0.300.v20120428-0517, Location: reference:file:plugins/org.eclipse.equinox.p2.director.app_1.0.300.v20120428-0517.jar
Id: org.eclipse.equinox.p2.directorywatcher, Version: 1.0.300.v20110808-1657, Location: reference:file:plugins/org.eclipse.equinox.p2.directorywatcher_1.0.300.v20110808-1657.jar
Id: org.eclipse.equinox.p2.discovery, Version: 1.0.200.v20120913-155635, Location: reference:file:plugins/org.eclipse.equinox.p2.discovery_1.0.200.v20120913-155635.jar
Id: org.eclipse.equinox.p2.discovery.compatibility, Version: 1.0.101.v20120913-155635, Location: reference:file:plugins/org.eclipse.equinox.p2.discovery.compatibility_1.0.101.v20120913-155635.jar
Id: org.eclipse.equinox.p2.engine, Version: 2.2.0.v20130121-021919, Location: reference:file:plugins/org.eclipse.equinox.p2.engine_2.2.0.v20130121-021919.jar
Id: org.eclipse.equinox.p2.extensionlocation, Version: 1.2.100.v20110808-1657, Location: reference:file:plugins/org.eclipse.equinox.p2.extensionlocation_1.2.100.v20110808-1657.jar
Id: org.eclipse.equinox.p2.garbagecollector, Version: 1.0.200.v20110808-1657, Location: reference:file:plugins/org.eclipse.equinox.p2.garbagecollector_1.0.200.v20110808-1657.jar
Id: org.eclipse.equinox.p2.jarprocessor, Version: 1.0.200.v20110808-1657, Location: reference:file:plugins/org.eclipse.equinox.p2.jarprocessor_1.0.200.v20110808-1657.jar
Id: org.eclipse.equinox.p2.metadata, Version: 2.1.0.v20120430-2001, Location: reference:file:plugins/org.eclipse.equinox.p2.metadata_2.1.0.v20120430-2001.jar
Id: org.eclipse.equinox.p2.metadata.repository, Version: 1.2.100.v20120524-1717, Location: reference:file:plugins/org.eclipse.equinox.p2.metadata.repository_1.2.100.v20120524-1717.jar
Id: org.eclipse.equinox.p2.operations, Version: 2.2.0.v20130119-010614, Location: reference:file:plugins/org.eclipse.equinox.p2.operations_2.2.0.v20130119-010614.jar
Id: org.eclipse.equinox.p2.publisher, Version: 1.2.0.v20121002-080415, Location: reference:file:plugins/org.eclipse.equinox.p2.publisher_1.2.0.v20121002-080415.jar
Id: org.eclipse.equinox.p2.publisher.eclipse, Version: 1.1.0.v20120913-155635, Location: reference:file:plugins/org.eclipse.equinox.p2.publisher.eclipse_1.1.0.v20120913-155635.jar
Id: org.eclipse.equinox.p2.ql, Version: 2.0.100.v20110808-1657, Location: reference:file:plugins/org.eclipse.equinox.p2.ql_2.0.100.v20110808-1657.jar
Id: org.eclipse.equinox.p2.reconciler.dropins, Version: 1.1.200.v20120301-2145, Location: reference:file:plugins/org.eclipse.equinox.p2.reconciler.dropins_1.1.200.v20120301-2145.jar
Id: org.eclipse.equinox.p2.repository, Version: 2.2.0.v20120524-1945, Location: reference:file:plugins/org.eclipse.equinox.p2.repository_2.2.0.v20120524-1945.jar
Id: org.eclipse.equinox.p2.repository.tools, Version: 2.0.100.v20120501-1314, Location: reference:file:plugins/org.eclipse.equinox.p2.repository.tools_2.0.100.v20120501-1314.jar
Id: org.eclipse.equinox.p2.touchpoint.eclipse, Version: 2.1.100.v20120428-0117, Location: reference:file:plugins/org.eclipse.equinox.p2.touchpoint.eclipse_2.1.100.v20120428-0117.jar
Id: org.eclipse.equinox.p2.touchpoint.natives, Version: 1.1.0.v20130121-021919, Location: reference:file:plugins/org.eclipse.equinox.p2.touchpoint.natives_1.1.0.v20130121-021919.jar
Id: org.eclipse.equinox.p2.transport.ecf, Version: 1.0.100.v20120913-155635, Location: reference:file:plugins/org.eclipse.equinox.p2.transport.ecf_1.0.100.v20120913-155635.jar
Id: org.eclipse.equinox.p2.ui, Version: 2.2.0.v20130119-010614, Location: reference:file:plugins/org.eclipse.equinox.p2.ui_2.2.0.v20130119-010614.jar
Id: org.eclipse.equinox.p2.ui.discovery, Version: 1.0.0.v20120913-155635, Location: reference:file:plugins/org.eclipse.equinox.p2.ui.discovery_1.0.0.v20120913-155635.jar
Id: org.eclipse.equinox.p2.ui.importexport, Version: 1.0.1.v20120913-155635, Location: reference:file:plugins/org.eclipse.equinox.p2.ui.importexport_1.0.1.v20120913-155635.jar
Id: org.eclipse.equinox.p2.ui.sdk, Version: 1.0.200.v20120515-1650, Location: reference:file:plugins/org.eclipse.equinox.p2.ui.sdk_1.0.200.v20120515-1650.jar
Id: org.eclipse.equinox.p2.ui.sdk.scheduler, Version: 1.1.0.v20110815-1744, Location: reference:file:plugins/org.eclipse.equinox.p2.ui.sdk.scheduler_1.1.0.v20110815-1744.jar
Id: org.eclipse.equinox.p2.updatechecker, Version: 1.1.200.v20110808-1657, Location: reference:file:plugins/org.eclipse.equinox.p2.updatechecker_1.1.200.v20110808-1657.jar
Id: org.eclipse.equinox.p2.updatesite, Version: 1.0.400.v20120412-1615, Location: reference:file:plugins/org.eclipse.equinox.p2.updatesite_1.0.400.v20120412-1615.jar
Id: org.eclipse.equinox.preferences, Version: 3.5.1.v20121031-182809, Location: reference:file:plugins/org.eclipse.equinox.preferences_3.5.1.v20121031-182809.jar
Id: org.eclipse.equinox.registry, Version: 3.5.200.v20120522-1841, Location: reference:file:plugins/org.eclipse.equinox.registry_3.5.200.v20120522-1841.jar
Id: org.eclipse.equinox.security, Version: 1.1.100.v20120522-1841, Location: reference:file:plugins/org.eclipse.equinox.security_1.1.100.v20120522-1841.jar
Id: org.eclipse.equinox.security.ui, Version: 1.1.100.v20120522-2049, Location: reference:file:plugins/org.eclipse.equinox.security.ui_1.1.100.v20120522-2049.jar
Id: org.eclipse.equinox.simpleconfigurator, Version: 1.0.301.v20120914-163612, Location: initial@reference:file:plugins/org.eclipse.equinox.simpleconfigurator_1.0.301.v20120914-163612.jar
Id: org.eclipse.equinox.simpleconfigurator.manipulator, Version: 2.0.0.v20110808-1657, Location: reference:file:plugins/org.eclipse.equinox.simpleconfigurator.manipulator_2.0.0.v20110808-1657.jar
Id: org.eclipse.equinox.util, Version: 1.0.400.v20120917-192807, Location: reference:file:plugins/org.eclipse.equinox.util_1.0.400.v20120917-192807.jar
Id: org.eclipse.gef, Version: 3.9.0.201212170307, Location: reference:file:plugins/org.eclipse.gef_3.9.0.201212170307.jar
Id: org.eclipse.help, Version: 3.6.0.v20120912-134126, Location: reference:file:plugins/org.eclipse.help_3.6.0.v20120912-134126.jar
Id: org.eclipse.help.base, Version: 3.6.101.v201302041200, Location: reference:file:plugins/org.eclipse.help.base_3.6.101.v201302041200.jar
Id: org.eclipse.help.ui, Version: 3.5.201.v20130108-092756, Location: reference:file:plugins/org.eclipse.help.ui_3.5.201.v20130108-092756.jar
Id: org.eclipse.help.webapp, Version: 3.6.101.v20130116-182509, Location: reference:file:plugins/org.eclipse.help.webapp_3.6.101.v20130116-182509.jar
Id: org.eclipse.jdt, Version: 3.8.1.v201302041200, Location: reference:file:plugins/org.eclipse.jdt_3.8.1.v201302041200.jar
Id: org.eclipse.jdt.annotation, Version: 1.0.1.v20130111-135246, Location: reference:file:plugins/org.eclipse.jdt.annotation_1.0.1.v20130111-135246.jar
Id: org.eclipse.jdt.apt.core, Version: 3.3.500.v20120522-1651, Location: reference:file:plugins/org.eclipse.jdt.apt.core_3.3.500.v20120522-1651.jar
Id: org.eclipse.jdt.apt.pluggable.core, Version: 1.0.400.v20120522-1651, Location: reference:file:plugins/org.eclipse.jdt.apt.pluggable.core_1.0.400.v20120522-1651.jar
Id: org.eclipse.jdt.apt.ui, Version: 3.3.300.v20120522-1651, Location: reference:file:plugins/org.eclipse.jdt.apt.ui_3.3.300.v20120522-1651.jar
Id: org.eclipse.jdt.compiler.apt, Version: 1.0.600.v20130116-050536, Location: reference:file:plugins/org.eclipse.jdt.compiler.apt_1.0.600.v20130116-050536.jar
Id: org.eclipse.jdt.compiler.tool, Version: 1.0.200.v20130116-050536, Location: reference:file:plugins/org.eclipse.jdt.compiler.tool_1.0.200.v20130116-050536.jar
Id: org.eclipse.jdt.core, Version: 3.8.3.v20130121-145325, Location: reference:file:plugins/org.eclipse.jdt.core_3.8.3.v20130121-145325.jar
Id: org.eclipse.jdt.core.manipulation, Version: 1.5.0.v20120523-1543, Location: reference:file:plugins/org.eclipse.jdt.core.manipulation_1.5.0.v20120523-1543.jar
Id: org.eclipse.jdt.debug, Version: 3.7.101.v20120913-153601, Location: reference:file:plugins/org.eclipse.jdt.debug_3.7.101.v20120913-153601/
Id: org.eclipse.jdt.debug.ui, Version: 3.6.100.v20120530-1425, Location: reference:file:plugins/org.eclipse.jdt.debug.ui_3.6.100.v20120530-1425.jar
Id: org.eclipse.jdt.doc.user, Version: 3.8.2.v20130121-200410, Location: reference:file:plugins/org.eclipse.jdt.doc.user_3.8.2.v20130121-200410.jar
Id: org.eclipse.jdt.junit, Version: 3.7.100.v20120523-1543, Location: reference:file:plugins/org.eclipse.jdt.junit_3.7.100.v20120523-1543.jar
Id: org.eclipse.jdt.junit.core, Version: 3.7.100.v20120523-1257, Location: reference:file:plugins/org.eclipse.jdt.junit.core_3.7.100.v20120523-1257.jar
Id: org.eclipse.jdt.junit.runtime, Version: 3.4.301.v20120914-131016, Location: reference:file:plugins/org.eclipse.jdt.junit.runtime_3.4.301.v20120914-131016.jar
Id: org.eclipse.jdt.junit4.runtime, Version: 1.1.200.v20120523-1257, Location: reference:file:plugins/org.eclipse.jdt.junit4.runtime_1.1.200.v20120523-1257.jar
Id: org.eclipse.jdt.launching, Version: 3.6.101.v20130111-183046, Location: reference:file:plugins/org.eclipse.jdt.launching_3.6.101.v20130111-183046.jar
Id: org.eclipse.jdt.ui, Version: 3.8.2.v20130107-165834, Location: reference:file:plugins/org.eclipse.jdt.ui_3.8.2.v20130107-165834.jar
Id: org.eclipse.jem, Version: 2.0.600.v201201051400, Location: reference:file:plugins/org.eclipse.jem_2.0.600.v201201051400.jar
Id: org.eclipse.jem.beaninfo, Version: 2.0.300.v200905030615, Location: reference:file:plugins/org.eclipse.jem.beaninfo_2.0.300.v200905030615.jar
Id: org.eclipse.jem.beaninfo.vm, Version: 2.0.300.v201004110600, Location: reference:file:plugins/org.eclipse.jem.beaninfo.vm_2.0.300.v201004110600.jar
Id: org.eclipse.jem.beaninfo.vm.common, Version: 2.0.300.v201004110600, Location: reference:file:plugins/org.eclipse.jem.beaninfo.vm.common_2.0.300.v201004110600.jar
Id: org.eclipse.jem.proxy, Version: 2.0.400.v201101101900, Location: reference:file:plugins/org.eclipse.jem.proxy_2.0.400.v201101101900.jar
Id: org.eclipse.jem.util, Version: 2.1.100.v201103021400, Location: reference:file:plugins/org.eclipse.jem.util_2.1.100.v201103021400.jar
Id: org.eclipse.jem.workbench, Version: 2.0.400.v201104251400, Location: reference:file:plugins/org.eclipse.jem.workbench_2.0.400.v201104251400.jar
Id: org.eclipse.jetty.continuation, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.continuation_8.1.3.v20120522.jar
Id: org.eclipse.jetty.http, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.http_8.1.3.v20120522.jar
Id: org.eclipse.jetty.io, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.io_8.1.3.v20120522.jar
Id: org.eclipse.jetty.security, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.security_8.1.3.v20120522.jar
Id: org.eclipse.jetty.server, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.server_8.1.3.v20120522.jar
Id: org.eclipse.jetty.servlet, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.servlet_8.1.3.v20120522.jar
Id: org.eclipse.jetty.util, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.util_8.1.3.v20120522.jar
Id: org.eclipse.jetty.webapp, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.webapp_8.1.3.v20120522.jar
Id: org.eclipse.jetty.xml, Version: 8.1.3.v20120522, Location: reference:file:plugins/org.eclipse.jetty.xml_8.1.3.v20120522.jar
Id: org.eclipse.jface, Version: 3.8.102.v20130123-162658, Location: reference:file:plugins/org.eclipse.jface_3.8.102.v20130123-162658.jar
Id: org.eclipse.jface.databinding, Version: 1.6.0.v20120912-132807, Location: reference:file:plugins/org.eclipse.jface.databinding_1.6.0.v20120912-132807.jar
Id: org.eclipse.jface.text, Version: 3.8.2.v20121126-164145, Location: reference:file:plugins/org.eclipse.jface.text_3.8.2.v20121126-164145.jar
Id: org.eclipse.jgit, Version: 2.2.0.201212191850-r, Location: reference:file:plugins/org.eclipse.jgit_2.2.0.201212191850-r.jar
Id: org.eclipse.jpt.common.branding, Version: 1.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.common.branding_1.2.1.v201208222210.jar
Id: org.eclipse.jpt.common.core, Version: 1.2.2.v201301082148, Location: reference:file:plugins/org.eclipse.jpt.common.core_1.2.2.v201301082148.jar
Id: org.eclipse.jpt.common.eclipselink.branding, Version: 1.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.common.eclipselink.branding_1.2.1.v201208222210.jar
Id: org.eclipse.jpt.common.eclipselink.core, Version: 1.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.common.eclipselink.core_1.2.1.v201208222210.jar
Id: org.eclipse.jpt.common.ui, Version: 1.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.common.ui_1.2.1.v201208222210.jar
Id: org.eclipse.jpt.common.utility, Version: 2.1.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.common.utility_2.1.1.v201208222210.jar
Id: org.eclipse.jpt.dbws.eclipselink.branding, Version: 1.1.101.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.dbws.eclipselink.branding_1.1.101.v201208222210.jar
Id: org.eclipse.jpt.dbws.eclipselink.core.gen, Version: 1.0.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.dbws.eclipselink.core.gen_1.0.1.v201208222210.jar
Id: org.eclipse.jpt.dbws.eclipselink.ui, Version: 1.0.201.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.dbws.eclipselink.ui_1.0.201.v201208222210.jar
Id: org.eclipse.jpt.doc.user, Version: 1.4.2.v201205290002, Location: reference:file:plugins/org.eclipse.jpt.doc.user_1.4.2.v201205290002.jar
Id: org.eclipse.jpt.jaxb.branding, Version: 1.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jaxb.branding_1.2.1.v201208222210.jar
Id: org.eclipse.jpt.jaxb.core, Version: 1.2.2.v201301082148, Location: reference:file:plugins/org.eclipse.jpt.jaxb.core_1.2.2.v201301082148.jar
Id: org.eclipse.jpt.jaxb.core.schemagen, Version: 1.0.201.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jaxb.core.schemagen_1.0.201.v201208222210.jar
Id: org.eclipse.jpt.jaxb.eclipselink.branding, Version: 1.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jaxb.eclipselink.branding_1.2.1.v201208222210.jar
Id: org.eclipse.jpt.jaxb.eclipselink.core, Version: 1.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jaxb.eclipselink.core_1.2.1.v201208222210.jar
Id: org.eclipse.jpt.jaxb.eclipselink.core.schemagen, Version: 1.1.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jaxb.eclipselink.core.schemagen_1.1.1.v201208222210.jar
Id: org.eclipse.jpt.jaxb.eclipselink.ui, Version: 1.3.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jaxb.eclipselink.ui_1.3.1.v201208222210.jar
Id: org.eclipse.jpt.jaxb.ui, Version: 1.3.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jaxb.ui_1.3.1.v201208222210.jar
Id: org.eclipse.jpt.jpa.branding, Version: 3.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jpa.branding_3.2.1.v201208222210.jar
Id: org.eclipse.jpt.jpa.core, Version: 3.2.2.v201301092252, Location: reference:file:plugins/org.eclipse.jpt.jpa.core_3.2.2.v201301092252.jar
Id: org.eclipse.jpt.jpa.db, Version: 2.1.101.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jpa.db_2.1.101.v201208222210.jar
Id: org.eclipse.jpt.jpa.db.ui, Version: 2.0.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jpa.db.ui_2.0.1.v201208222210.jar
Id: org.eclipse.jpt.jpa.eclipselink.branding, Version: 3.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jpa.eclipselink.branding_3.2.1.v201208222210.jar
Id: org.eclipse.jpt.jpa.eclipselink.core, Version: 2.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jpa.eclipselink.core_2.2.1.v201208222210.jar
Id: org.eclipse.jpt.jpa.eclipselink.core.ddlgen, Version: 2.1.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jpa.eclipselink.core.ddlgen_2.1.1.v201208222210.jar
Id: org.eclipse.jpt.jpa.eclipselink.ui, Version: 2.2.1.v201208222210, Location: reference:file:plugins/org.eclipse.jpt.jpa.eclipselink.ui_2.2.1.v201208222210.jar
Id: org.eclipse.jpt.jpa.gen, Version: 2.2.2.v201301082148, Location: reference:file:plugins/org.eclipse.jpt.jpa.gen_2.2.2.v201301082148.jar
Id: org.eclipse.jpt.jpa.ui, Version: 3.2.2.v201301092252, Location: reference:file:plugins/org.eclipse.jpt.jpa.ui_3.2.2.v201301092252.jar
Id: org.eclipse.jsch.core, Version: 1.1.400.v20120522-1148, Location: reference:file:plugins/org.eclipse.jsch.core_1.1.400.v20120522-1148.jar
Id: org.eclipse.jsch.ui, Version: 1.1.400.v20120522-1148, Location: reference:file:plugins/org.eclipse.jsch.ui_1.1.400.v20120522-1148.jar
Id: org.eclipse.jsf.branding, Version: 3.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jsf.branding_3.3.0.v201301161500.jar
Id: org.eclipse.jst.common.annotations.controller, Version: 1.1.300.v200908252030, Location: reference:file:plugins/org.eclipse.jst.common.annotations.controller_1.1.300.v200908252030.jar
Id: org.eclipse.jst.common.annotations.core, Version: 1.1.300.v201004141630, Location: reference:file:plugins/org.eclipse.jst.common.annotations.core_1.1.300.v201004141630.jar
Id: org.eclipse.jst.common.annotations.ui, Version: 1.1.300.v201002081900, Location: reference:file:plugins/org.eclipse.jst.common.annotations.ui_1.1.300.v201002081900.jar
Id: org.eclipse.jst.common.frameworks, Version: 1.1.601.v201208160700, Location: reference:file:plugins/org.eclipse.jst.common.frameworks_1.1.601.v201208160700.jar
Id: org.eclipse.jst.common.project.facet.core, Version: 1.4.201.v201108161900, Location: reference:file:plugins/org.eclipse.jst.common.project.facet.core_1.4.201.v201108161900.jar
Id: org.eclipse.jst.common.project.facet.ui, Version: 1.4.200.v201008182133, Location: reference:file:plugins/org.eclipse.jst.common.project.facet.ui_1.4.200.v201008182133.jar
Id: org.eclipse.jst.common.ui, Version: 1.0.201.v201208292200, Location: reference:file:plugins/org.eclipse.jst.common.ui_1.0.201.v201208292200.jar
Id: org.eclipse.jst.ejb.doc.user, Version: 1.1.301.v201105130956, Location: reference:file:plugins/org.eclipse.jst.ejb.doc.user_1.1.301.v201105130956.jar
Id: org.eclipse.jst.ejb.ui, Version: 1.1.700.v201201190500, Location: reference:file:plugins/org.eclipse.jst.ejb.ui_1.1.700.v201201190500.jar
Id: org.eclipse.jst.ejb.ui.infopop, Version: 1.0.300.v2010022311013, Location: reference:file:plugins/org.eclipse.jst.ejb.ui.infopop_1.0.300.v2010022311013.jar
Id: org.eclipse.jst.j2ee, Version: 1.1.603.v201301092200, Location: reference:file:plugins/org.eclipse.jst.j2ee_1.1.603.v201301092200.jar
Id: org.eclipse.jst.j2ee.core, Version: 1.2.200.v201205030130, Location: reference:file:plugins/org.eclipse.jst.j2ee.core_1.2.200.v201205030130.jar
Id: org.eclipse.jst.j2ee.doc.user, Version: 1.1.400.v201008122303, Location: reference:file:plugins/org.eclipse.jst.j2ee.doc.user_1.1.400.v201008122303.jar
Id: org.eclipse.jst.j2ee.ejb, Version: 1.1.601.v201210040812, Location: reference:file:plugins/org.eclipse.jst.j2ee.ejb_1.1.601.v201210040812.jar
Id: org.eclipse.jst.j2ee.ejb.annotation.model, Version: 1.1.300.v201003112036, Location: reference:file:plugins/org.eclipse.jst.j2ee.ejb.annotation.model_1.1.300.v201003112036.jar
Id: org.eclipse.jst.j2ee.ejb.annotations.emitter, Version: 1.1.200.v200909290826, Location: reference:file:plugins/org.eclipse.jst.j2ee.ejb.annotations.emitter_1.1.200.v200909290826.jar
Id: org.eclipse.jst.j2ee.ejb.annotations.ui, Version: 1.1.200.v201004290730, Location: reference:file:plugins/org.eclipse.jst.j2ee.ejb.annotations.ui_1.1.200.v201004290730.jar
Id: org.eclipse.jst.j2ee.ejb.annotations.xdoclet, Version: 1.2.200.v201103302125, Location: reference:file:plugins/org.eclipse.jst.j2ee.ejb.annotations.xdoclet_1.2.200.v201103302125.jar
Id: org.eclipse.jst.j2ee.infopop, Version: 1.0.300.v200805140415, Location: reference:file:plugins/org.eclipse.jst.j2ee.infopop_1.0.300.v200805140415.jar
Id: org.eclipse.jst.j2ee.jca, Version: 1.1.600.v201111012200, Location: reference:file:plugins/org.eclipse.jst.j2ee.jca_1.1.600.v201111012200.jar
Id: org.eclipse.jst.j2ee.jca.ui, Version: 1.1.400.v201004150700, Location: reference:file:plugins/org.eclipse.jst.j2ee.jca.ui_1.1.400.v201004150700.jar
Id: org.eclipse.jst.j2ee.navigator.ui, Version: 1.1.600.v201203142300, Location: reference:file:plugins/org.eclipse.jst.j2ee.navigator.ui_1.1.600.v201203142300.jar
Id: org.eclipse.jst.j2ee.ui, Version: 1.1.600.v201205170400, Location: reference:file:plugins/org.eclipse.jst.j2ee.ui_1.1.600.v201205170400.jar
Id: org.eclipse.jst.j2ee.web, Version: 1.1.601.v201212130700, Location: reference:file:plugins/org.eclipse.jst.j2ee.web_1.1.601.v201212130700.jar
Id: org.eclipse.jst.j2ee.webservice, Version: 1.1.400.v201004110600, Location: reference:file:plugins/org.eclipse.jst.j2ee.webservice_1.1.400.v201004110600.jar
Id: org.eclipse.jst.j2ee.webservice.ui, Version: 1.1.500.v201105122000, Location: reference:file:plugins/org.eclipse.jst.j2ee.webservice.ui_1.1.500.v201105122000.jar
Id: org.eclipse.jst.j2ee.xdoclet.runtime, Version: 1.1.300.v201004280700, Location: reference:file:plugins/org.eclipse.jst.j2ee.xdoclet.runtime_1.1.300.v201004280700.jar
Id: org.eclipse.jst.jee, Version: 1.0.501.v201301091334, Location: reference:file:plugins/org.eclipse.jst.jee_1.0.501.v201301091334.jar
Id: org.eclipse.jst.jee.ejb, Version: 1.0.301.v201007070821, Location: reference:file:plugins/org.eclipse.jst.jee.ejb_1.0.301.v201007070821.jar
Id: org.eclipse.jst.jee.ui, Version: 1.0.500.v201205170400, Location: reference:file:plugins/org.eclipse.jst.jee.ui_1.0.500.v201205170400.jar
Id: org.eclipse.jst.jee.web, Version: 1.0.301.v201007070907, Location: reference:file:plugins/org.eclipse.jst.jee.web_1.0.301.v201007070907.jar
Id: org.eclipse.jst.jsf.apache.trinidad.tagsupport, Version: 1.2.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.apache.trinidad.tagsupport_1.2.0.v201301161500.jar
Id: org.eclipse.jst.jsf.common, Version: 1.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.common_1.3.0.v201301161500.jar
Id: org.eclipse.jst.jsf.common.runtime, Version: 1.2.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.common.runtime_1.2.0.v201301161500.jar
Id: org.eclipse.jst.jsf.common.ui, Version: 1.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.common.ui_1.3.0.v201301161500.jar
Id: org.eclipse.jst.jsf.core, Version: 1.5.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.core_1.5.0.v201301161500.jar
Id: org.eclipse.jst.jsf.doc.user, Version: 1.3.0.v201211081916, Location: reference:file:plugins/org.eclipse.jst.jsf.doc.user_1.3.0.v201211081916.jar
Id: org.eclipse.jst.jsf.facelet.core, Version: 1.1.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.facelet.core_1.1.0.v201301161500.jar
Id: org.eclipse.jst.jsf.facelet.ui, Version: 1.1.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.facelet.ui_1.1.0.v201301161500.jar
Id: org.eclipse.jst.jsf.facesconfig, Version: 1.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.facesconfig_1.3.0.v201301161500.jar
Id: org.eclipse.jst.jsf.facesconfig.ui, Version: 1.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.facesconfig.ui_1.3.0.v201301161500.jar
Id: org.eclipse.jst.jsf.standard.tagsupport, Version: 1.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.standard.tagsupport_1.3.0.v201301161500.jar
Id: org.eclipse.jst.jsf.ui, Version: 1.4.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.jsf.ui_1.4.0.v201301161500.jar
Id: org.eclipse.jst.jsp.core, Version: 1.2.502.v201301101836, Location: reference:file:plugins/org.eclipse.jst.jsp.core_1.2.502.v201301101836.jar
Id: org.eclipse.jst.jsp.ui, Version: 1.1.702.v201301101836, Location: reference:file:plugins/org.eclipse.jst.jsp.ui_1.1.702.v201301101836.jar
Id: org.eclipse.jst.jsp.ui.infopop, Version: 1.0.200.v201004150328, Location: reference:file:plugins/org.eclipse.jst.jsp.ui.infopop_1.0.200.v201004150328.jar
Id: org.eclipse.jst.pagedesigner, Version: 1.4.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.pagedesigner_1.4.0.v201301161500.jar
Id: org.eclipse.jst.pagedesigner.jsf.ui, Version: 1.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.pagedesigner.jsf.ui_1.3.0.v201301161500.jar
Id: org.eclipse.jst.pagedesigner.jsp.core, Version: 1.3.0.v201301161500, Location: reference:file:plugins/org.eclipse.jst.pagedesigner.jsp.core_1.3.0.v201301161500.jar
Id: org.eclipse.jst.server.core, Version: 1.2.302.v20120503_1042, Location: reference:file:plugins/org.eclipse.jst.server.core_1.2.302.v20120503_1042.jar
Id: org.eclipse.jst.server.generic.core, Version: 1.0.700.v20101219, Location: reference:file:plugins/org.eclipse.jst.server.generic.core_1.0.700.v20101219.jar
Id: org.eclipse.jst.server.generic.jboss, Version: 1.6.1.v200904151730, Location: reference:file:plugins/org.eclipse.jst.server.generic.jboss_1.6.1.v200904151730/
Id: org.eclipse.jst.server.generic.jonas, Version: 1.5.205.v200805140145, Location: reference:file:plugins/org.eclipse.jst.server.generic.jonas_1.5.205.v200805140145/
Id: org.eclipse.jst.server.generic.oc4j, Version: 1.5.206.v20090812, Location: reference:file:plugins/org.eclipse.jst.server.generic.oc4j_1.5.206.v20090812/
Id: org.eclipse.jst.server.generic.ui, Version: 1.0.505.v20100428, Location: reference:file:plugins/org.eclipse.jst.server.generic.ui_1.0.505.v20100428.jar
Id: org.eclipse.jst.server.preview.adapter, Version: 1.1.201.v20130123_1813, Location: reference:file:plugins/org.eclipse.jst.server.preview.adapter_1.1.201.v20130123_1813.jar
Id: org.eclipse.jst.server.tomcat.core, Version: 1.1.402.v20130108_1103, Location: reference:file:plugins/org.eclipse.jst.server.tomcat.core_1.1.402.v20130108_1103.jar
Id: org.eclipse.jst.server.tomcat.ui, Version: 1.1.300.v20120420_1012, Location: reference:file:plugins/org.eclipse.jst.server.tomcat.ui_1.1.300.v20120420_1012.jar
Id: org.eclipse.jst.server.ui, Version: 1.1.202.v20110419, Location: reference:file:plugins/org.eclipse.jst.server.ui_1.1.202.v20110419.jar
Id: org.eclipse.jst.server.ui.doc.user, Version: 1.0.500.v201005192218, Location: reference:file:plugins/org.eclipse.jst.server.ui.doc.user_1.0.500.v201005192218.jar
Id: org.eclipse.jst.server.ui.infopop, Version: 1.0.400.v200805140145, Location: reference:file:plugins/org.eclipse.jst.server.ui.infopop_1.0.400.v200805140145.jar
Id: org.eclipse.jst.server.websphere.core, Version: 1.0.302.v20080620, Location: reference:file:plugins/org.eclipse.jst.server.websphere.core_1.0.302.v20080620/
Id: org.eclipse.jst.servlet.ui, Version: 1.1.600.v201202011057, Location: reference:file:plugins/org.eclipse.jst.servlet.ui_1.1.600.v201202011057.jar
Id: org.eclipse.jst.servlet.ui.infopop, Version: 1.0.500.v201105122000, Location: reference:file:plugins/org.eclipse.jst.servlet.ui.infopop_1.0.500.v201105122000.jar
Id: org.eclipse.jst.standard.schemas, Version: 1.2.1.v201302050732, Location: reference:file:plugins/org.eclipse.jst.standard.schemas_1.2.1.v201302050732.jar
Id: org.eclipse.jst.ws, Version: 1.0.600.v201108242234, Location: reference:file:plugins/org.eclipse.jst.ws_1.0.600.v201108242234.jar
Id: org.eclipse.jst.ws.annotations.core, Version: 1.2.0.v201203272107, Location: reference:file:plugins/org.eclipse.jst.ws.annotations.core_1.2.0.v201203272107.jar
Id: org.eclipse.jst.ws.axis.consumption.core, Version: 1.0.407.v201104071820, Location: reference:file:plugins/org.eclipse.jst.ws.axis.consumption.core_1.0.407.v201104071820.jar
Id: org.eclipse.jst.ws.axis.consumption.ui, Version: 1.0.700.v201204181727, Location: reference:file:plugins/org.eclipse.jst.ws.axis.consumption.ui_1.0.700.v201204181727.jar
Id: org.eclipse.jst.ws.axis.creation.ui, Version: 1.0.750.v201204120428, Location: reference:file:plugins/org.eclipse.jst.ws.axis.creation.ui_1.0.750.v201204120428.jar
Id: org.eclipse.jst.ws.axis.infopop, Version: 1.0.300.v200805140230, Location: reference:file:plugins/org.eclipse.jst.ws.axis.infopop_1.0.300.v200805140230.jar
Id: org.eclipse.jst.ws.axis.ui.doc.user, Version: 1.1.100.v201005192217, Location: reference:file:plugins/org.eclipse.jst.ws.axis.ui.doc.user_1.1.100.v201005192217.jar
Id: org.eclipse.jst.ws.axis2.consumption.core, Version: 1.0.105.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.axis2.consumption.core_1.0.105.v201004211805.jar
Id: org.eclipse.jst.ws.axis2.consumption.ui, Version: 1.0.103.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.axis2.consumption.ui_1.0.103.v201004211805.jar
Id: org.eclipse.jst.ws.axis2.core, Version: 1.0.204.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.axis2.core_1.0.204.v201004211805.jar
Id: org.eclipse.jst.ws.axis2.creation.core, Version: 1.0.106.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.axis2.creation.core_1.0.106.v201004211805.jar
Id: org.eclipse.jst.ws.axis2.creation.ui, Version: 1.0.104.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.axis2.creation.ui_1.0.104.v201004211805.jar
Id: org.eclipse.jst.ws.axis2.ui, Version: 1.0.303.v201003110431, Location: reference:file:plugins/org.eclipse.jst.ws.axis2.ui_1.0.303.v201003110431.jar
Id: org.eclipse.jst.ws.axis2.ui.doc.user, Version: 1.0.100.v201005192217, Location: reference:file:plugins/org.eclipse.jst.ws.axis2.ui.doc.user_1.0.100.v201005192217.jar
Id: org.eclipse.jst.ws.consumption, Version: 1.0.701.v201212112014, Location: reference:file:plugins/org.eclipse.jst.ws.consumption_1.0.701.v201212112014.jar
Id: org.eclipse.jst.ws.consumption.infopop, Version: 1.0.300.v200805140230, Location: reference:file:plugins/org.eclipse.jst.ws.consumption.infopop_1.0.300.v200805140230.jar
Id: org.eclipse.jst.ws.consumption.ui, Version: 1.1.600.v201301232254, Location: reference:file:plugins/org.eclipse.jst.ws.consumption.ui_1.1.600.v201301232254.jar
Id: org.eclipse.jst.ws.consumption.ui.doc.user, Version: 1.0.600.v201005192217, Location: reference:file:plugins/org.eclipse.jst.ws.consumption.ui.doc.user_1.0.600.v201005192217.jar
Id: org.eclipse.jst.ws.creation.ejb.ui, Version: 1.0.201.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.creation.ejb.ui_1.0.201.v201004211805.jar
Id: org.eclipse.jst.ws.creation.ui, Version: 1.0.700.v201205041550, Location: reference:file:plugins/org.eclipse.jst.ws.creation.ui_1.0.700.v201205041550.jar
Id: org.eclipse.jst.ws.cxf.consumption.core, Version: 1.0.201.v201301072322, Location: reference:file:plugins/org.eclipse.jst.ws.cxf.consumption.core_1.0.201.v201301072322.jar
Id: org.eclipse.jst.ws.cxf.consumption.ui, Version: 1.0.200.v201201312103, Location: reference:file:plugins/org.eclipse.jst.ws.cxf.consumption.ui_1.0.200.v201201312103.jar
Id: org.eclipse.jst.ws.cxf.core, Version: 1.1.1.v201301082115, Location: reference:file:plugins/org.eclipse.jst.ws.cxf.core_1.1.1.v201301082115.jar
Id: org.eclipse.jst.ws.cxf.creation.core, Version: 1.0.201.v201301072322, Location: reference:file:plugins/org.eclipse.jst.ws.cxf.creation.core_1.0.201.v201301072322.jar
Id: org.eclipse.jst.ws.cxf.creation.ui, Version: 1.0.201.v201301072322, Location: reference:file:plugins/org.eclipse.jst.ws.cxf.creation.ui_1.0.201.v201301072322.jar
Id: org.eclipse.jst.ws.cxf.doc.user, Version: 1.0.201.v201301072322, Location: reference:file:plugins/org.eclipse.jst.ws.cxf.doc.user_1.0.201.v201301072322.jar
Id: org.eclipse.jst.ws.cxf.ui, Version: 1.0.200.v201203062228, Location: reference:file:plugins/org.eclipse.jst.ws.cxf.ui_1.0.200.v201203062228.jar
Id: org.eclipse.jst.ws.doc.user, Version: 1.0.600.v201005192217, Location: reference:file:plugins/org.eclipse.jst.ws.doc.user_1.0.600.v201005192217.jar
Id: org.eclipse.jst.ws.infopop, Version: 1.0.300.v200805140230, Location: reference:file:plugins/org.eclipse.jst.ws.infopop_1.0.300.v200805140230.jar
Id: org.eclipse.jst.ws.jaxb.core, Version: 1.0.100.v201104031139, Location: reference:file:plugins/org.eclipse.jst.ws.jaxb.core_1.0.100.v201104031139.jar
Id: org.eclipse.jst.ws.jaxrs.core, Version: 1.0.400.v201202152223, Location: reference:file:plugins/org.eclipse.jst.ws.jaxrs.core_1.0.400.v201202152223.jar
Id: org.eclipse.jst.ws.jaxrs.ui, Version: 1.0.500.v201205020140, Location: reference:file:plugins/org.eclipse.jst.ws.jaxrs.ui_1.0.500.v201205020140.jar
Id: org.eclipse.jst.ws.jaxws.core, Version: 1.0.201.v201301072322, Location: reference:file:plugins/org.eclipse.jst.ws.jaxws.core_1.0.201.v201301072322.jar
Id: org.eclipse.jst.ws.jaxws.doc.user, Version: 1.0.200.v201205231938, Location: reference:file:plugins/org.eclipse.jst.ws.jaxws.doc.user_1.0.200.v201205231938.jar
Id: org.eclipse.jst.ws.jaxws.dom.integration, Version: 1.0.200.v201109042201, Location: reference:file:plugins/org.eclipse.jst.ws.jaxws.dom.integration_1.0.200.v201109042201.jar
Id: org.eclipse.jst.ws.jaxws.dom.runtime, Version: 1.0.200.v201109042201, Location: reference:file:plugins/org.eclipse.jst.ws.jaxws.dom.runtime_1.0.200.v201109042201.jar
Id: org.eclipse.jst.ws.jaxws.dom.ui, Version: 1.0.0.v201004171919, Location: reference:file:plugins/org.eclipse.jst.ws.jaxws.dom.ui_1.0.0.v201004171919.jar
Id: org.eclipse.jst.ws.jaxws.ui, Version: 1.0.201.v201301072322, Location: reference:file:plugins/org.eclipse.jst.ws.jaxws.ui_1.0.201.v201301072322.jar
Id: org.eclipse.jst.ws.jaxws.utils, Version: 1.0.200.v201201032002, Location: reference:file:plugins/org.eclipse.jst.ws.jaxws.utils_1.0.200.v201201032002.jar
Id: org.eclipse.jst.ws.uddiregistry, Version: 1.0.500.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.uddiregistry_1.0.500.v201004211805.jar
Id: org.eclipse.jst.ws.ui, Version: 1.0.403.v201004211805, Location: reference:file:plugins/org.eclipse.jst.ws.ui_1.0.403.v201004211805.jar
Id: org.eclipse.linuxtools.binutils, Version: 4.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.binutils_4.0.0.201302051708.jar
Id: org.eclipse.linuxtools.profiling.docs, Version: 1.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.profiling.docs_1.0.0.201302051708.jar
Id: org.eclipse.linuxtools.profiling.launch, Version: 1.2.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.profiling.launch_1.2.0.201302051708.jar
Id: org.eclipse.linuxtools.profiling.launch.ui, Version: 0.9.2.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.profiling.launch.ui_0.9.2.201302051708.jar
Id: org.eclipse.linuxtools.profiling.ui, Version: 1.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.profiling.ui_1.0.0.201302051708.jar
Id: org.eclipse.linuxtools.tools.launch.core, Version: 1.1.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.tools.launch.core_1.1.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.cachegrind, Version: 1.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.cachegrind_1.0.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.core, Version: 1.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.core_1.0.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.doc, Version: 1.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.doc_1.0.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.helgrind, Version: 1.1.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.helgrind_1.1.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.launch, Version: 1.2.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.launch_1.2.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.massif, Version: 1.1.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.massif_1.1.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.memcheck, Version: 1.1.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.memcheck_1.1.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.ui, Version: 1.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.ui_1.0.0.201302051708.jar
Id: org.eclipse.linuxtools.valgrind.ui.editor, Version: 1.0.0.201302051708, Location: reference:file:plugins/org.eclipse.linuxtools.valgrind.ui.editor_1.0.0.201302051708.jar
Id: org.eclipse.ltk.core.refactoring, Version: 3.6.0.v20120523-1543, Location: reference:file:plugins/org.eclipse.ltk.core.refactoring_3.6.0.v20120523-1543.jar
Id: org.eclipse.ltk.ui.refactoring, Version: 3.7.0.v20120523-1543, Location: reference:file:plugins/org.eclipse.ltk.ui.refactoring_3.7.0.v20120523-1543.jar
Id: org.eclipse.mylyn.bugzilla.core, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.bugzilla.core_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.bugzilla.ide, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.bugzilla.ide_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.bugzilla.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.bugzilla.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.core, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.core_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.identity, Version: 0.9.1.v20120412-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.identity_0.9.1.v20120412-0100.jar
Id: org.eclipse.mylyn.commons.identity.core, Version: 1.0.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.identity.core_1.0.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.net, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.net_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.notifications, Version: 0.9.1.v20120412-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.notifications_0.9.1.v20120412-0100.jar
Id: org.eclipse.mylyn.commons.notifications.core, Version: 1.0.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.notifications.core_1.0.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.notifications.feed, Version: 1.0.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.notifications.feed_1.0.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.notifications.ui, Version: 1.0.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.notifications.ui_1.0.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.repositories, Version: 0.9.1.v20120412-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.repositories_0.9.1.v20120412-0100.jar
Id: org.eclipse.mylyn.commons.repositories.core, Version: 1.0.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.repositories.core_1.0.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.repositories.ui, Version: 1.0.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.repositories.ui_1.0.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.screenshots, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.screenshots_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.team, Version: 0.9.1.v20120412-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.team_0.9.1.v20120412-0100.jar
Id: org.eclipse.mylyn.commons.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.workbench, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.workbench_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.commons.xmlrpc, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.commons.xmlrpc_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.context.core, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.context.core_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.context.tasks.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.context.tasks.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.context.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.context.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.discovery.core, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.discovery.core_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.discovery.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.discovery.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.help.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.help.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.ide.ant, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.ide.ant_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.ide.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.ide.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.java.tasks, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.java.tasks_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.java.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.java.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.monitor.core, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.monitor.core_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.monitor.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.monitor.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.resources.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.resources.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.tasks.bugs, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.tasks.bugs_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.tasks.core, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.tasks.core_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.tasks.index.core, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.tasks.index.core_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.tasks.index.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.tasks.index.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.tasks.search, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.tasks.search_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.tasks.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.tasks.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.team.cvs, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.team.cvs_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.team.ui, Version: 3.8.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.team.ui_3.8.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.confluence.core, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.confluence.core_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.confluence.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.confluence.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.core, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.core_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.help.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.help.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.mediawiki.core, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.mediawiki.core_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.mediawiki.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.mediawiki.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.tasks.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.tasks.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.textile.core, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.textile.core_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.textile.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.textile.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.tracwiki.core, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.tracwiki.core_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.tracwiki.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.tracwiki.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.twiki.core, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.twiki.core_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.twiki.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.twiki.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.mylyn.wikitext.ui, Version: 1.7.3.v20130107-0100, Location: reference:file:plugins/org.eclipse.mylyn.wikitext.ui_1.7.3.v20130107-0100.jar
Id: org.eclipse.osgi, Version: 3.8.2.v20130124-134944, Location: System Bundle
Id: org.eclipse.osgi.services, Version: 3.3.100.v20120522-1822, Location: reference:file:plugins/org.eclipse.osgi.services_3.3.100.v20120522-1822.jar
Id: org.eclipse.osgi.util, Version: 3.2.300.v20120913-144807, Location: reference:file:plugins/org.eclipse.osgi.util_3.2.300.v20120913-144807.jar
Id: org.eclipse.pde, Version: 3.8.0.v201302041200, Location: reference:file:plugins/org.eclipse.pde_3.8.0.v201302041200.jar
Id: org.eclipse.pde.api.tools, Version: 1.0.400.v20120523-2012, Location: reference:file:plugins/org.eclipse.pde.api.tools_1.0.400.v20120523-2012.jar
Id: org.eclipse.pde.api.tools.ui, Version: 1.0.400.v20120523-2012, Location: reference:file:plugins/org.eclipse.pde.api.tools.ui_1.0.400.v20120523-2012.jar
Id: org.eclipse.pde.build, Version: 3.8.2.v20121114-140810, Location: reference:file:plugins/org.eclipse.pde.build_3.8.2.v20121114-140810/
Id: org.eclipse.pde.core, Version: 3.8.1.v20130115-200504, Location: reference:file:plugins/org.eclipse.pde.core_3.8.1.v20130115-200504.jar
Id: org.eclipse.pde.doc.user, Version: 3.8.2.v20130121-200410, Location: reference:file:plugins/org.eclipse.pde.doc.user_3.8.2.v20130121-200410.jar
Id: org.eclipse.pde.ds.core, Version: 1.0.200.v20120530-1435, Location: reference:file:plugins/org.eclipse.pde.ds.core_1.0.200.v20120530-1435.jar
Id: org.eclipse.pde.ds.ui, Version: 1.0.200.v20120530-1435, Location: reference:file:plugins/org.eclipse.pde.ds.ui_1.0.200.v20120530-1435.jar
Id: org.eclipse.pde.junit.runtime, Version: 3.4.200.v20120530-1435, Location: reference:file:plugins/org.eclipse.pde.junit.runtime_3.4.200.v20120530-1435.jar
Id: org.eclipse.pde.launching, Version: 3.6.100.v20120605-203027, Location: reference:file:plugins/org.eclipse.pde.launching_3.6.100.v20120605-203027.jar
Id: org.eclipse.pde.runtime, Version: 3.4.300.v20120523-1453, Location: reference:file:plugins/org.eclipse.pde.runtime_3.4.300.v20120523-1453.jar
Id: org.eclipse.pde.ua.core, Version: 1.0.200.v20120530-1435, Location: reference:file:plugins/org.eclipse.pde.ua.core_1.0.200.v20120530-1435.jar
Id: org.eclipse.pde.ua.ui, Version: 1.0.200.v20120523-1453, Location: reference:file:plugins/org.eclipse.pde.ua.ui_1.0.200.v20120523-1453.jar
Id: org.eclipse.pde.ui, Version: 3.7.2.v20130121-093123, Location: reference:file:plugins/org.eclipse.pde.ui_3.7.2.v20130121-093123.jar
Id: org.eclipse.pde.ui.templates, Version: 3.4.500.v20120523-2012, Location: reference:file:plugins/org.eclipse.pde.ui.templates_3.4.500.v20120523-2012.jar
Id: org.eclipse.persistence.antlr, Version: 3.2.0.v201206041011, Location: reference:file:plugins/org.eclipse.persistence.antlr_3.2.0.v201206041011.jar
Id: org.eclipse.persistence.asm, Version: 3.3.1.v201206041142, Location: reference:file:plugins/org.eclipse.persistence.asm_3.3.1.v201206041142.jar
Id: org.eclipse.persistence.core, Version: 2.4.2.v20121206-a9d0e8d, Location: reference:file:plugins/org.eclipse.persistence.core_2.4.2.v20121206-a9d0e8d.jar
Id: org.eclipse.persistence.dbws, Version: 2.4.2.v20121206-a9d0e8d, Location: reference:file:plugins/org.eclipse.persistence.dbws_2.4.2.v20121206-a9d0e8d.jar
Id: org.eclipse.persistence.dbws.builder, Version: 2.4.2.v20121206-a9d0e8d, Location: reference:file:plugins/org.eclipse.persistence.dbws.builder_2.4.2.v20121206-a9d0e8d.jar
Id: org.eclipse.persistence.jpa, Version: 2.4.2.v20121206-a9d0e8d, Location: reference:file:plugins/org.eclipse.persistence.jpa_2.4.2.v20121206-a9d0e8d.jar
Id: org.eclipse.persistence.jpa.jpql, Version: 2.0.1.v20121206-a9d0e8d, Location: reference:file:plugins/org.eclipse.persistence.jpa.jpql_2.0.1.v20121206-a9d0e8d.jar
Id: org.eclipse.persistence.moxy, Version: 2.4.2.v20121206-a9d0e8d, Location: reference:file:plugins/org.eclipse.persistence.moxy_2.4.2.v20121206-a9d0e8d.jar
Id: org.eclipse.platform, Version: 4.2.2.v201302041200, Location: reference:file:plugins/org.eclipse.platform_4.2.2.v201302041200/
Id: org.eclipse.platform.doc.user, Version: 4.2.2.v20130121-200410, Location: reference:file:plugins/org.eclipse.platform.doc.user_4.2.2.v20130121-200410.jar
Id: org.eclipse.rcp, Version: 4.2.1.v201302041200, Location: reference:file:plugins/org.eclipse.rcp_4.2.1.v201302041200.jar
Id: org.eclipse.rse, Version: 3.4.0.201205061956, Location: reference:file:plugins/org.eclipse.rse_3.4.0.201205061956.jar
Id: org.eclipse.rse.connectorservice.dstore, Version: 3.1.301.201209211856, Location: reference:file:plugins/org.eclipse.rse.connectorservice.dstore_3.1.301.201209211856.jar
Id: org.eclipse.rse.connectorservice.local, Version: 2.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.connectorservice.local_2.1.400.201205062159.jar
Id: org.eclipse.rse.connectorservice.ssh, Version: 2.1.300.201205062159, Location: reference:file:plugins/org.eclipse.rse.connectorservice.ssh_2.1.300.201205062159.jar
Id: org.eclipse.rse.connectorservice.telnet, Version: 1.2.300.201205071750, Location: reference:file:plugins/org.eclipse.rse.connectorservice.telnet_1.2.300.201205071750.jar
Id: org.eclipse.rse.core, Version: 3.3.2.201301152246, Location: reference:file:plugins/org.eclipse.rse.core_3.3.2.201301152246.jar
Id: org.eclipse.rse.doc.user, Version: 3.4.0.201205301213, Location: reference:file:plugins/org.eclipse.rse.doc.user_3.4.0.201205301213.jar
Id: org.eclipse.rse.dstore.security, Version: 3.0.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.dstore.security_3.0.400.201205062159.jar
Id: org.eclipse.rse.efs, Version: 2.1.401.201301141950, Location: reference:file:plugins/org.eclipse.rse.efs_2.1.401.201301141950.jar
Id: org.eclipse.rse.efs.ui, Version: 2.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.efs.ui_2.1.400.201205062159.jar
Id: org.eclipse.rse.files.ui, Version: 3.2.101.201302012126, Location: reference:file:plugins/org.eclipse.rse.files.ui_3.2.101.201302012126.jar
Id: org.eclipse.rse.importexport, Version: 1.2.300.201205241511, Location: reference:file:plugins/org.eclipse.rse.importexport_1.2.300.201205241511.jar
Id: org.eclipse.rse.processes.ui, Version: 3.0.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.processes.ui_3.0.400.201205062159.jar
Id: org.eclipse.rse.services, Version: 3.2.200.201211090626, Location: reference:file:plugins/org.eclipse.rse.services_3.2.200.201211090626.jar
Id: org.eclipse.rse.services.dstore, Version: 3.2.1.201212201804, Location: reference:file:plugins/org.eclipse.rse.services.dstore_3.2.1.201212201804.jar
Id: org.eclipse.rse.services.files.ftp, Version: 3.0.401.201302062102, Location: reference:file:plugins/org.eclipse.rse.services.files.ftp_3.0.401.201302062102.jar
Id: org.eclipse.rse.services.local, Version: 2.1.401.201302062104, Location: reference:file:plugins/org.eclipse.rse.services.local_2.1.401.201302062104.jar
Id: org.eclipse.rse.services.ssh, Version: 3.2.0.201205022057, Location: reference:file:plugins/org.eclipse.rse.services.ssh_3.2.0.201205022057.jar
Id: org.eclipse.rse.services.telnet, Version: 2.0.300.201205241511, Location: reference:file:plugins/org.eclipse.rse.services.telnet_2.0.300.201205241511.jar
Id: org.eclipse.rse.shells.ui, Version: 3.0.401.201212171813, Location: reference:file:plugins/org.eclipse.rse.shells.ui_3.0.401.201212171813.jar
Id: org.eclipse.rse.subsystems.files.core, Version: 3.3.1.201211140039, Location: reference:file:plugins/org.eclipse.rse.subsystems.files.core_3.3.1.201211140039.jar
Id: org.eclipse.rse.subsystems.files.dstore, Version: 2.1.300.201205241511, Location: reference:file:plugins/org.eclipse.rse.subsystems.files.dstore_2.1.300.201205241511.jar
Id: org.eclipse.rse.subsystems.files.ftp, Version: 2.1.400.201205071750, Location: reference:file:plugins/org.eclipse.rse.subsystems.files.ftp_2.1.400.201205071750.jar
Id: org.eclipse.rse.subsystems.files.local, Version: 2.1.300.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.files.local_2.1.300.201205062159.jar
Id: org.eclipse.rse.subsystems.files.ssh, Version: 2.1.300.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.files.ssh_2.1.300.201205062159.jar
Id: org.eclipse.rse.subsystems.processes.core, Version: 3.1.300.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.processes.core_3.1.300.201205062159.jar
Id: org.eclipse.rse.subsystems.processes.dstore, Version: 2.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.processes.dstore_2.1.400.201205062159.jar
Id: org.eclipse.rse.subsystems.processes.local, Version: 2.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.processes.local_2.1.400.201205062159.jar
Id: org.eclipse.rse.subsystems.processes.shell.linux, Version: 1.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.processes.shell.linux_1.1.400.201205062159.jar
Id: org.eclipse.rse.subsystems.shells.core, Version: 3.1.300.201205141739, Location: reference:file:plugins/org.eclipse.rse.subsystems.shells.core_3.1.300.201205141739.jar
Id: org.eclipse.rse.subsystems.shells.dstore, Version: 2.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.shells.dstore_2.1.400.201205062159.jar
Id: org.eclipse.rse.subsystems.shells.local, Version: 2.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.shells.local_2.1.400.201205062159.jar
Id: org.eclipse.rse.subsystems.shells.ssh, Version: 2.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.shells.ssh_2.1.400.201205062159.jar
Id: org.eclipse.rse.subsystems.shells.telnet, Version: 1.2.300.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.shells.telnet_1.2.300.201205062159.jar
Id: org.eclipse.rse.subsystems.terminals.core, Version: 1.0.300.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.terminals.core_1.0.300.201205062159.jar
Id: org.eclipse.rse.subsystems.terminals.ssh, Version: 1.0.200.201205062159, Location: reference:file:plugins/org.eclipse.rse.subsystems.terminals.ssh_1.0.200.201205062159.jar
Id: org.eclipse.rse.terminals.ui, Version: 1.2.0.201205071638, Location: reference:file:plugins/org.eclipse.rse.terminals.ui_1.2.0.201205071638.jar
Id: org.eclipse.rse.ui, Version: 3.3.3.201302122026, Location: reference:file:plugins/org.eclipse.rse.ui_3.3.3.201302122026.jar
Id: org.eclipse.rse.useractions, Version: 1.1.400.201205062159, Location: reference:file:plugins/org.eclipse.rse.useractions_1.1.400.201205062159.jar
Id: org.eclipse.search, Version: 3.8.0.v20120523-1540, Location: reference:file:plugins/org.eclipse.search_3.8.0.v20120523-1540.jar
Id: org.eclipse.swt, Version: 3.100.1.v4236b, Location: reference:file:plugins/org.eclipse.swt_3.100.1.v4236b.jar
Id: org.eclipse.swt.gtk.linux.x86_64, Version: 3.100.1.v4236b, Location: reference:file:plugins/org.eclipse.swt.gtk.linux.x86_64_3.100.1.v4236b.jar
Id: org.eclipse.team.core, Version: 3.6.100.v20120524-0627, Location: reference:file:plugins/org.eclipse.team.core_3.6.100.v20120524-0627.jar
Id: org.eclipse.team.cvs.core, Version: 3.3.500.v20120522-1148, Location: reference:file:plugins/org.eclipse.team.cvs.core_3.3.500.v20120522-1148.jar
Id: org.eclipse.team.cvs.ssh2, Version: 3.2.300.v20120522-1148, Location: reference:file:plugins/org.eclipse.team.cvs.ssh2_3.2.300.v20120522-1148.jar
Id: org.eclipse.team.cvs.ui, Version: 3.3.500.v20120522-1148, Location: reference:file:plugins/org.eclipse.team.cvs.ui_3.3.500.v20120522-1148.jar
Id: org.eclipse.team.ui, Version: 3.6.201.v20130125-135424, Location: reference:file:plugins/org.eclipse.team.ui_3.6.201.v20130125-135424.jar
Id: org.eclipse.text, Version: 3.5.200.v20120523-1310, Location: reference:file:plugins/org.eclipse.text_3.5.200.v20120523-1310.jar
Id: org.eclipse.tm.terminal, Version: 3.2.2.201301071106, Location: reference:file:plugins/org.eclipse.tm.terminal_3.2.2.201301071106.jar
Id: org.eclipse.tm.terminal.ssh, Version: 2.1.200.201301080822, Location: reference:file:plugins/org.eclipse.tm.terminal.ssh_2.1.200.201301080822.jar
Id: org.eclipse.tm.terminal.telnet, Version: 2.1.200.201301080822, Location: reference:file:plugins/org.eclipse.tm.terminal.telnet_2.1.200.201301080822.jar
Id: org.eclipse.tm.terminal.view, Version: 2.4.1.201301031142, Location: reference:file:plugins/org.eclipse.tm.terminal.view_2.4.1.201301031142.jar
Id: org.eclipse.ui, Version: 3.104.0.v20121024-145224, Location: reference:file:plugins/org.eclipse.ui_3.104.0.v20121024-145224.jar
Id: org.eclipse.ui.browser, Version: 3.4.2.v20130123-162658, Location: reference:file:plugins/org.eclipse.ui.browser_3.4.2.v20130123-162658.jar
Id: org.eclipse.ui.cheatsheets, Version: 3.4.200.v20120521-2344, Location: reference:file:plugins/org.eclipse.ui.cheatsheets_3.4.200.v20120521-2344.jar
Id: org.eclipse.ui.console, Version: 3.5.100.v20120521-2012, Location: reference:file:plugins/org.eclipse.ui.console_3.5.100.v20120521-2012.jar
Id: org.eclipse.ui.editors, Version: 3.8.0.v20120523-1540, Location: reference:file:plugins/org.eclipse.ui.editors_3.8.0.v20120523-1540.jar
Id: org.eclipse.ui.externaltools, Version: 3.2.100.v20120530-1753, Location: reference:file:plugins/org.eclipse.ui.externaltools_3.2.100.v20120530-1753.jar
Id: org.eclipse.ui.forms, Version: 3.5.200.v20120705-114351, Location: reference:file:plugins/org.eclipse.ui.forms_3.5.200.v20120705-114351.jar
Id: org.eclipse.ui.ide, Version: 3.8.2.v20121106-165923, Location: reference:file:plugins/org.eclipse.ui.ide_3.8.2.v20121106-165923.jar
Id: org.eclipse.ui.ide.application, Version: 1.0.400.v20120523-1955, Location: reference:file:plugins/org.eclipse.ui.ide.application_1.0.400.v20120523-1955.jar
Id: org.eclipse.ui.intro, Version: 3.4.200.v20120521-2344, Location: reference:file:plugins/org.eclipse.ui.intro_3.4.200.v20120521-2344.jar
Id: org.eclipse.ui.intro.universal, Version: 3.2.600.v20120912-155524, Location: reference:file:plugins/org.eclipse.ui.intro.universal_3.2.600.v20120912-155524/
Id: org.eclipse.ui.navigator, Version: 3.5.200.v20120705-114103, Location: reference:file:plugins/org.eclipse.ui.navigator_3.5.200.v20120705-114103.jar
Id: org.eclipse.ui.navigator.resources, Version: 3.4.400.v20120705-114010, Location: reference:file:plugins/org.eclipse.ui.navigator.resources_3.4.400.v20120705-114010.jar
Id: org.eclipse.ui.net, Version: 1.2.101.v20120914-093638, Location: reference:file:plugins/org.eclipse.ui.net_1.2.101.v20120914-093638.jar
Id: org.eclipse.ui.trace, Version: 1.0.1.v20121204-224553, Location: reference:file:plugins/org.eclipse.ui.trace_1.0.1.v20121204-224553.jar
Id: org.eclipse.ui.views, Version: 3.6.100.v20120705-114010, Location: reference:file:plugins/org.eclipse.ui.views_3.6.100.v20120705-114010.jar
Id: org.eclipse.ui.views.log, Version: 1.0.300.v20120530-1435, Location: reference:file:plugins/org.eclipse.ui.views.log_1.0.300.v20120530-1435.jar
Id: org.eclipse.ui.views.properties.tabbed, Version: 3.5.300.v20120912-132807, Location: reference:file:plugins/org.eclipse.ui.views.properties.tabbed_3.5.300.v20120912-132807.jar
Id: org.eclipse.ui.workbench, Version: 3.104.0.v20130204-164612, Location: reference:file:plugins/org.eclipse.ui.workbench_3.104.0.v20130204-164612.jar
Id: org.eclipse.ui.workbench.texteditor, Version: 3.8.0.v20120523-1310, Location: reference:file:plugins/org.eclipse.ui.workbench.texteditor_3.8.0.v20120523-1310.jar
Id: org.eclipse.update.configurator, Version: 3.3.200.v20120912-144026, Location: reference:file:plugins/org.eclipse.update.configurator_3.3.200.v20120912-144026.jar
Id: org.eclipse.wb.core, Version: 1.5.2.r42x201302111859, Location: reference:file:plugins/org.eclipse.wb.core_1.5.2.r42x201302111859.jar
Id: org.eclipse.wb.core.databinding, Version: 1.5.2.r42x201302111907, Location: reference:file:plugins/org.eclipse.wb.core.databinding_1.5.2.r42x201302111907.jar
Id: org.eclipse.wb.core.databinding.xml, Version: 1.5.2.r42x201302111919, Location: reference:file:plugins/org.eclipse.wb.core.databinding.xml_1.5.2.r42x201302111919.jar
Id: org.eclipse.wb.core.java, Version: 1.5.2.r42x201302111907, Location: reference:file:plugins/org.eclipse.wb.core.java_1.5.2.r42x201302111907.jar
Id: org.eclipse.wb.core.lib, Version: 1.5.2.r42x201302111859, Location: reference:file:plugins/org.eclipse.wb.core.lib_1.5.2.r42x201302111859/
Id: org.eclipse.wb.core.ui, Version: 1.5.2.r42x201302111927, Location: reference:file:plugins/org.eclipse.wb.core.ui_1.5.2.r42x201302111927.jar
Id: org.eclipse.wb.core.xml, Version: 1.5.2.r42x201302111919, Location: reference:file:plugins/org.eclipse.wb.core.xml_1.5.2.r42x201302111919.jar
Id: org.eclipse.wb.discovery.core, Version: 1.5.2.r42x201302111927, Location: reference:file:plugins/org.eclipse.wb.discovery.core_1.5.2.r42x201302111927.jar
Id: org.eclipse.wb.discovery.ui, Version: 1.5.2.r42x201302111927, Location: reference:file:plugins/org.eclipse.wb.discovery.ui_1.5.2.r42x201302111927.jar
Id: org.eclipse.wb.doc.user, Version: 1.5.2.r42x201302111931, Location: reference:file:plugins/org.eclipse.wb.doc.user_1.5.2.r42x201302111931.jar
Id: org.eclipse.wb.layout.group, Version: 1.5.2.r42x201302111942, Location: reference:file:plugins/org.eclipse.wb.layout.group_1.5.2.r42x201302111942.jar
Id: org.eclipse.wb.os, Version: 1.5.2.r42x201302111859, Location: reference:file:plugins/org.eclipse.wb.os_1.5.2.r42x201302111859.jar
Id: org.eclipse.wb.os.linux, Version: 1.5.2.r42x201302111859, Location: reference:file:plugins/org.eclipse.wb.os.linux_1.5.2.r42x201302111859.jar
Id: org.eclipse.wb.rcp, Version: 1.5.2.r42x201302112047, Location: reference:file:plugins/org.eclipse.wb.rcp_1.5.2.r42x201302112047.jar
Id: org.eclipse.wb.rcp.SWT_AWT, Version: 1.5.2.r42x201302112057, Location: reference:file:plugins/org.eclipse.wb.rcp.SWT_AWT_1.5.2.r42x201302112057.jar
Id: org.eclipse.wb.rcp.databinding, Version: 1.5.2.r42x201302112047, Location: reference:file:plugins/org.eclipse.wb.rcp.databinding_1.5.2.r42x201302112047.jar
Id: org.eclipse.wb.rcp.databinding.emf, Version: 1.5.2.r42x201302112047, Location: reference:file:plugins/org.eclipse.wb.rcp.databinding.emf_1.5.2.r42x201302112047.jar
Id: org.eclipse.wb.rcp.databinding.xwt, Version: 1.5.2.r42x201302112106, Location: reference:file:plugins/org.eclipse.wb.rcp.databinding.xwt_1.5.2.r42x201302112106.jar
Id: org.eclipse.wb.rcp.nebula, Version: 1.5.2.r42x201302112047, Location: reference:file:plugins/org.eclipse.wb.rcp.nebula_1.5.2.r42x201302112047.jar
Id: org.eclipse.wb.rcp.swing2swt, Version: 1.5.2.r42x201302112047, Location: reference:file:plugins/org.eclipse.wb.rcp.swing2swt_1.5.2.r42x201302112047.jar
Id: org.eclipse.wb.runtime, Version: 1.5.2.r42x201302111859, Location: reference:file:plugins/org.eclipse.wb.runtime_1.5.2.r42x201302111859.jar
Id: org.eclipse.wb.runtime.lib, Version: 1.5.2.r42x201302111859, Location: reference:file:plugins/org.eclipse.wb.runtime.lib_1.5.2.r42x201302111859/
Id: org.eclipse.wb.swing, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing_1.5.2.r42x201302112024.jar
Id: org.eclipse.wb.swing.FormLayout, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing.FormLayout_1.5.2.r42x201302112024.jar
Id: org.eclipse.wb.swing.FormLayout.lib, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing.FormLayout.lib_1.5.2.r42x201302112024/
Id: org.eclipse.wb.swing.MigLayout, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing.MigLayout_1.5.2.r42x201302112024.jar
Id: org.eclipse.wb.swing.MigLayout.lib, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing.MigLayout.lib_1.5.2.r42x201302112024.jar
Id: org.eclipse.wb.swing.databinding, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing.databinding_1.5.2.r42x201302112024.jar
Id: org.eclipse.wb.swing.java6, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing.java6_1.5.2.r42x201302112024.jar
Id: org.eclipse.wb.swing.jsr296, Version: 1.5.2.r42x201302112024, Location: reference:file:plugins/org.eclipse.wb.swing.jsr296_1.5.2.r42x201302112024.jar
Id: org.eclipse.wb.swt, Version: 1.5.2.r42x201302112017, Location: reference:file:plugins/org.eclipse.wb.swt_1.5.2.r42x201302112017.jar
Id: org.eclipse.wb.swt.widgets.baseline, Version: 1.5.2.r42x201302112047, Location: reference:file:plugins/org.eclipse.wb.swt.widgets.baseline_1.5.2.r42x201302112047.jar
Id: org.eclipse.wb.xwt, Version: 1.5.2.r42x201302112106, Location: reference:file:plugins/org.eclipse.wb.xwt_1.5.2.r42x201302112106.jar
Id: org.eclipse.wst.command.env, Version: 1.0.409.v201004211805, Location: reference:file:plugins/org.eclipse.wst.command.env_1.0.409.v201004211805.jar
Id: org.eclipse.wst.command.env.core, Version: 1.0.205.v201004211805, Location: reference:file:plugins/org.eclipse.wst.command.env.core_1.0.205.v201004211805.jar
Id: org.eclipse.wst.command.env.doc.user, Version: 1.5.300.v201005192225, Location: reference:file:plugins/org.eclipse.wst.command.env.doc.user_1.5.300.v201005192225.jar
Id: org.eclipse.wst.command.env.infopop, Version: 1.0.100.v200805301544, Location: reference:file:plugins/org.eclipse.wst.command.env.infopop_1.0.100.v200805301544.jar
Id: org.eclipse.wst.command.env.ui, Version: 1.1.103.v201102260635, Location: reference:file:plugins/org.eclipse.wst.command.env.ui_1.1.103.v201102260635.jar
Id: org.eclipse.wst.common.core, Version: 1.2.0.v200908252030, Location: reference:file:plugins/org.eclipse.wst.common.core_1.2.0.v200908252030.jar
Id: org.eclipse.wst.common.emf, Version: 1.2.100.v201101101900, Location: reference:file:plugins/org.eclipse.wst.common.emf_1.2.100.v201101101900.jar
Id: org.eclipse.wst.common.emfworkbench.integration, Version: 1.2.101.v201107140600, Location: reference:file:plugins/org.eclipse.wst.common.emfworkbench.integration_1.2.101.v201107140600.jar
Id: org.eclipse.wst.common.environment, Version: 1.0.400.v200912181832, Location: reference:file:plugins/org.eclipse.wst.common.environment_1.0.400.v200912181832.jar
Id: org.eclipse.wst.common.frameworks, Version: 1.2.200.v201203141800, Location: reference:file:plugins/org.eclipse.wst.common.frameworks_1.2.200.v201203141800.jar
Id: org.eclipse.wst.common.frameworks.ui, Version: 1.2.201.v201208292200, Location: reference:file:plugins/org.eclipse.wst.common.frameworks.ui_1.2.201.v201208292200.jar
Id: org.eclipse.wst.common.infopop, Version: 1.0.300.v201004280700, Location: reference:file:plugins/org.eclipse.wst.common.infopop_1.0.300.v201004280700.jar
Id: org.eclipse.wst.common.modulecore, Version: 1.2.201.v201301092200, Location: reference:file:plugins/org.eclipse.wst.common.modulecore_1.2.201.v201301092200.jar
Id: org.eclipse.wst.common.modulecore.ui, Version: 1.0.201.v201208241600, Location: reference:file:plugins/org.eclipse.wst.common.modulecore.ui_1.0.201.v201208241600.jar
Id: org.eclipse.wst.common.project.facet.core, Version: 1.4.300.v201111030424, Location: reference:file:plugins/org.eclipse.wst.common.project.facet.core_1.4.300.v201111030424.jar
Id: org.eclipse.wst.common.project.facet.ui, Version: 1.4.300.v201111030424, Location: reference:file:plugins/org.eclipse.wst.common.project.facet.ui_1.4.300.v201111030424.jar
Id: org.eclipse.wst.common.snippets, Version: 1.2.200.v201204260225, Location: reference:file:plugins/org.eclipse.wst.common.snippets_1.2.200.v201204260225.jar
Id: org.eclipse.wst.common.ui, Version: 1.1.500.v200911190730, Location: reference:file:plugins/org.eclipse.wst.common.ui_1.1.500.v200911190730.jar
Id: org.eclipse.wst.common.uriresolver, Version: 1.2.0.v201203071939, Location: reference:file:plugins/org.eclipse.wst.common.uriresolver_1.2.0.v201203071939.jar
Id: org.eclipse.wst.css.core, Version: 1.1.602.v201210091733, Location: reference:file:plugins/org.eclipse.wst.css.core_1.1.602.v201210091733.jar
Id: org.eclipse.wst.css.ui, Version: 1.0.702.v201211262010, Location: reference:file:plugins/org.eclipse.wst.css.ui_1.0.702.v201211262010.jar
Id: org.eclipse.wst.doc.user, Version: 1.2.0.v200806052254, Location: reference:file:plugins/org.eclipse.wst.doc.user_1.2.0.v200806052254.jar
Id: org.eclipse.wst.dtd.core, Version: 1.1.600.v201205171933, Location: reference:file:plugins/org.eclipse.wst.dtd.core_1.1.600.v201205171933.jar
Id: org.eclipse.wst.dtd.ui, Version: 1.0.700.v201203081826, Location: reference:file:plugins/org.eclipse.wst.dtd.ui_1.0.700.v201203081826.jar
Id: org.eclipse.wst.dtd.ui.infopop, Version: 1.0.400.v201008112018, Location: reference:file:plugins/org.eclipse.wst.dtd.ui.infopop_1.0.400.v201008112018.jar
Id: org.eclipse.wst.dtdeditor.doc.user, Version: 1.0.700.v201008112018, Location: reference:file:plugins/org.eclipse.wst.dtdeditor.doc.user_1.0.700.v201008112018.jar
Id: org.eclipse.wst.html.core, Version: 1.1.602.v201301032305, Location: reference:file:plugins/org.eclipse.wst.html.core_1.1.602.v201301032305.jar
Id: org.eclipse.wst.html.ui, Version: 1.0.702.v201211262010, Location: reference:file:plugins/org.eclipse.wst.html.ui_1.0.702.v201211262010.jar
Id: org.eclipse.wst.html.ui.infopop, Version: 1.0.200.v201004150328, Location: reference:file:plugins/org.eclipse.wst.html.ui.infopop_1.0.200.v201004150328.jar
Id: org.eclipse.wst.internet.cache, Version: 1.0.600.v201203071939, Location: reference:file:plugins/org.eclipse.wst.internet.cache_1.0.600.v201203071939.jar
Id: org.eclipse.wst.internet.monitor.core, Version: 1.0.505.v20110419, Location: reference:file:plugins/org.eclipse.wst.internet.monitor.core_1.0.505.v20110419.jar
Id: org.eclipse.wst.internet.monitor.ui, Version: 1.0.606.v20120306_1603, Location: reference:file:plugins/org.eclipse.wst.internet.monitor.ui_1.0.606.v20120306_1603.jar
Id: org.eclipse.wst.jsdt.core, Version: 1.1.202.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.core_1.1.202.v201208171701.jar
Id: org.eclipse.wst.jsdt.debug.core, Version: 3.1.1.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.debug.core_3.1.1.v201208171701.jar
Id: org.eclipse.wst.jsdt.debug.crossfire, Version: 1.0.301.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.debug.crossfire_1.0.301.v201208171701.jar
Id: org.eclipse.wst.jsdt.debug.rhino, Version: 1.0.201.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.debug.rhino_1.0.201.v201208171701.jar
Id: org.eclipse.wst.jsdt.debug.rhino.debugger, Version: 1.0.301.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.debug.rhino.debugger_1.0.301.v201208171701.jar
Id: org.eclipse.wst.jsdt.debug.rhino.ui, Version: 1.0.101.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.debug.rhino.ui_1.0.101.v201208171701.jar
Id: org.eclipse.wst.jsdt.debug.transport, Version: 1.0.101.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.debug.transport_1.0.101.v201208171701.jar
Id: org.eclipse.wst.jsdt.debug.ui, Version: 1.0.201.v201208241832, Location: reference:file:plugins/org.eclipse.wst.jsdt.debug.ui_1.0.201.v201208241832.jar
Id: org.eclipse.wst.jsdt.doc, Version: 1.4.0.v201202031526, Location: reference:file:plugins/org.eclipse.wst.jsdt.doc_1.4.0.v201202031526.jar
Id: org.eclipse.wst.jsdt.manipulation, Version: 1.0.400.v201204261600, Location: reference:file:plugins/org.eclipse.wst.jsdt.manipulation_1.0.400.v201204261600.jar
Id: org.eclipse.wst.jsdt.support.firefox, Version: 1.0.402.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.support.firefox_1.0.402.v201208171701.jar
Id: org.eclipse.wst.jsdt.support.ie, Version: 1.0.402.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.support.ie_1.0.402.v201208171701.jar
Id: org.eclipse.wst.jsdt.ui, Version: 1.1.202.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.ui_1.1.202.v201208171701.jar
Id: org.eclipse.wst.jsdt.web.core, Version: 1.0.502.v201301101836, Location: reference:file:plugins/org.eclipse.wst.jsdt.web.core_1.0.502.v201301101836.jar
Id: org.eclipse.wst.jsdt.web.support.jsp, Version: 1.0.500.v201204260100, Location: reference:file:plugins/org.eclipse.wst.jsdt.web.support.jsp_1.0.500.v201204260100.jar
Id: org.eclipse.wst.jsdt.web.ui, Version: 1.0.502.v201208171701, Location: reference:file:plugins/org.eclipse.wst.jsdt.web.ui_1.0.502.v201208171701.jar
Id: org.eclipse.wst.server.core, Version: 1.4.100.v20130117_1140, Location: reference:file:plugins/org.eclipse.wst.server.core_1.4.100.v20130117_1140.jar
Id: org.eclipse.wst.server.discovery, Version: 1.0.300.v20120403_0949, Location: reference:file:plugins/org.eclipse.wst.server.discovery_1.0.300.v20120403_0949.jar
Id: org.eclipse.wst.server.http.core, Version: 1.0.200.v20090429, Location: reference:file:plugins/org.eclipse.wst.server.http.core_1.0.200.v20090429.jar
Id: org.eclipse.wst.server.http.ui, Version: 1.0.300.v20120821_1517, Location: reference:file:plugins/org.eclipse.wst.server.http.ui_1.0.300.v20120821_1517.jar
Id: org.eclipse.wst.server.preview, Version: 1.1.102.v20130123_1813, Location: reference:file:plugins/org.eclipse.wst.server.preview_1.1.102.v20130123_1813.jar
Id: org.eclipse.wst.server.preview.adapter, Version: 1.1.101.v20121107_1651, Location: reference:file:plugins/org.eclipse.wst.server.preview.adapter_1.1.101.v20121107_1651.jar
Id: org.eclipse.wst.server.ui, Version: 1.4.100.v20121112_1718, Location: reference:file:plugins/org.eclipse.wst.server.ui_1.4.100.v20121112_1718.jar
Id: org.eclipse.wst.server.ui.doc.user, Version: 1.1.500.v20120830_2252, Location: reference:file:plugins/org.eclipse.wst.server.ui.doc.user_1.1.500.v20120830_2252.jar
Id: org.eclipse.wst.server.ui.infopop, Version: 1.1.100.v201005192130, Location: reference:file:plugins/org.eclipse.wst.server.ui.infopop_1.1.100.v201005192130.jar
Id: org.eclipse.wst.sse.core, Version: 1.1.702.v201301241617, Location: reference:file:plugins/org.eclipse.wst.sse.core_1.1.702.v201301241617.jar
Id: org.eclipse.wst.sse.doc.user, Version: 1.1.100.v201005192212, Location: reference:file:plugins/org.eclipse.wst.sse.doc.user_1.1.100.v201005192212.jar
Id: org.eclipse.wst.sse.ui, Version: 1.3.102.v201301162301, Location: reference:file:plugins/org.eclipse.wst.sse.ui_1.3.102.v201301162301.jar
Id: org.eclipse.wst.sse.ui.infopop, Version: 1.0.300.v201004150328, Location: reference:file:plugins/org.eclipse.wst.sse.ui.infopop_1.0.300.v201004150328.jar
Id: org.eclipse.wst.standard.schemas, Version: 1.0.501.v201301091615, Location: reference:file:plugins/org.eclipse.wst.standard.schemas_1.0.501.v201301091615.jar
Id: org.eclipse.wst.validation, Version: 1.2.402.v201212031633, Location: reference:file:plugins/org.eclipse.wst.validation_1.2.402.v201212031633.jar
Id: org.eclipse.wst.validation.infopop, Version: 1.0.300.v200806041506, Location: reference:file:plugins/org.eclipse.wst.validation.infopop_1.0.300.v200806041506.jar
Id: org.eclipse.wst.validation.ui, Version: 1.2.400.v201204260100, Location: reference:file:plugins/org.eclipse.wst.validation.ui_1.2.400.v201204260100.jar
Id: org.eclipse.wst.web, Version: 1.1.600.v201204190200, Location: reference:file:plugins/org.eclipse.wst.web_1.1.600.v201204190200.jar
Id: org.eclipse.wst.web.ui, Version: 1.1.600.v201109220400, Location: reference:file:plugins/org.eclipse.wst.web.ui_1.1.600.v201109220400.jar
Id: org.eclipse.wst.web.ui.infopop, Version: 1.0.300.v200805140415, Location: reference:file:plugins/org.eclipse.wst.web.ui.infopop_1.0.300.v200805140415.jar
Id: org.eclipse.wst.webtools.doc.user, Version: 1.0.500.v201005192212, Location: reference:file:plugins/org.eclipse.wst.webtools.doc.user_1.0.500.v201005192212.jar
Id: org.eclipse.wst.ws, Version: 1.1.300.v201204181727, Location: reference:file:plugins/org.eclipse.wst.ws_1.1.300.v201204181727.jar
Id: org.eclipse.wst.ws.explorer, Version: 1.0.700.v201203072334, Location: reference:file:plugins/org.eclipse.wst.ws.explorer_1.0.700.v201203072334.jar
Id: org.eclipse.wst.ws.infopop, Version: 1.0.300.v200805140230, Location: reference:file:plugins/org.eclipse.wst.ws.infopop_1.0.300.v200805140230.jar
Id: org.eclipse.wst.ws.parser, Version: 1.0.500.v201210042315, Location: reference:file:plugins/org.eclipse.wst.ws.parser_1.0.500.v201210042315.jar
Id: org.eclipse.wst.ws.service.policy, Version: 1.0.303.v201009221810, Location: reference:file:plugins/org.eclipse.wst.ws.service.policy_1.0.303.v201009221810.jar
Id: org.eclipse.wst.ws.service.policy.ui, Version: 1.0.400.v201201111717, Location: reference:file:plugins/org.eclipse.wst.ws.service.policy.ui_1.0.400.v201201111717.jar
Id: org.eclipse.wst.ws.ui, Version: 1.1.200.v201004211805, Location: reference:file:plugins/org.eclipse.wst.ws.ui_1.1.200.v201004211805.jar
Id: org.eclipse.wst.wsdl, Version: 1.2.300.v201109010430, Location: reference:file:plugins/org.eclipse.wst.wsdl_1.2.300.v201109010430.jar
Id: org.eclipse.wst.wsdl.ui, Version: 1.2.500.v201108240518, Location: reference:file:plugins/org.eclipse.wst.wsdl.ui_1.2.500.v201108240518.jar
Id: org.eclipse.wst.wsdl.ui.doc.user, Version: 1.0.800.v201008122303, Location: reference:file:plugins/org.eclipse.wst.wsdl.ui.doc.user_1.0.800.v201008122303.jar
Id: org.eclipse.wst.wsdl.validation, Version: 1.1.600.v201203081939, Location: reference:file:plugins/org.eclipse.wst.wsdl.validation_1.1.600.v201203081939.jar
Id: org.eclipse.wst.wsi, Version: 1.0.500.v201203081939, Location: reference:file:plugins/org.eclipse.wst.wsi_1.0.500.v201203081939.jar
Id: org.eclipse.wst.wsi.ui, Version: 1.0.502.v201104071820, Location: reference:file:plugins/org.eclipse.wst.wsi.ui_1.0.502.v201104071820.jar
Id: org.eclipse.wst.wsi.ui.doc.user, Version: 1.0.700.v201008122303, Location: reference:file:plugins/org.eclipse.wst.wsi.ui.doc.user_1.0.700.v201008122303.jar
Id: org.eclipse.wst.xml.core, Version: 1.1.702.v201301101836, Location: reference:file:plugins/org.eclipse.wst.xml.core_1.1.702.v201301101836.jar
Id: org.eclipse.wst.xml.ui, Version: 1.1.302.v201301172222, Location: reference:file:plugins/org.eclipse.wst.xml.ui_1.1.302.v201301172222.jar
Id: org.eclipse.wst.xml.ui.infopop, Version: 1.0.400.v201004292007, Location: reference:file:plugins/org.eclipse.wst.xml.ui.infopop_1.0.400.v201004292007.jar
Id: org.eclipse.wst.xml.xpath.core, Version: 1.3.0.v201108312136, Location: reference:file:plugins/org.eclipse.wst.xml.xpath.core_1.3.0.v201108312136.jar
Id: org.eclipse.wst.xml.xpath.ui, Version: 1.1.101.v201204260040, Location: reference:file:plugins/org.eclipse.wst.xml.xpath.ui_1.1.101.v201204260040.jar
Id: org.eclipse.wst.xml.xpath2, Version: 1.1.0.v200910101444, Location: reference:file:plugins/org.eclipse.wst.xml.xpath2_1.1.0.v200910101444/
Id: org.eclipse.wst.xml.xpath2.processor, Version: 2.1.2.v201212060048, Location: reference:file:plugins/org.eclipse.wst.xml.xpath2.processor_2.1.2.v201212060048.jar
Id: org.eclipse.wst.xml.xpath2.processor.doc.user, Version: 2.0.0.v201105190326, Location: reference:file:plugins/org.eclipse.wst.xml.xpath2.processor.doc.user_2.0.0.v201105190326/
Id: org.eclipse.wst.xml.xpath2.wtptypes, Version: 2.0.0.v201103212215, Location: reference:file:plugins/org.eclipse.wst.xml.xpath2.wtptypes_2.0.0.v201103212215.jar
Id: org.eclipse.wst.xmleditor.doc.user, Version: 1.0.700.v201005192212, Location: reference:file:plugins/org.eclipse.wst.xmleditor.doc.user_1.0.700.v201005192212.jar
Id: org.eclipse.wst.xsd.core, Version: 1.1.700.v201204102147, Location: reference:file:plugins/org.eclipse.wst.xsd.core_1.1.700.v201204102147.jar
Id: org.eclipse.wst.xsd.ui, Version: 1.2.500.v201203081826, Location: reference:file:plugins/org.eclipse.wst.xsd.ui_1.2.500.v201203081826.jar
Id: org.eclipse.wst.xsdeditor.doc.user, Version: 1.0.800.v201005192212, Location: reference:file:plugins/org.eclipse.wst.xsdeditor.doc.user_1.0.800.v201005192212.jar
Id: org.eclipse.wst.xsl, Version: 1.2.0.v201009121641, Location: reference:file:plugins/org.eclipse.wst.xsl_1.2.0.v201009121641.jar
Id: org.eclipse.wst.xsl.core, Version: 1.1.100.v201102270516, Location: reference:file:plugins/org.eclipse.wst.xsl.core_1.1.100.v201102270516.jar
Id: org.eclipse.wst.xsl.debug.ui, Version: 1.0.200.v201101281837, Location: reference:file:plugins/org.eclipse.wst.xsl.debug.ui_1.0.200.v201101281837.jar
Id: org.eclipse.wst.xsl.doc, Version: 1.0.100.v201004292007, Location: reference:file:plugins/org.eclipse.wst.xsl.doc_1.0.100.v201004292007.jar
Id: org.eclipse.wst.xsl.exslt.core, Version: 1.0.0.v201005240426, Location: reference:file:plugins/org.eclipse.wst.xsl.exslt.core_1.0.0.v201005240426.jar
Id: org.eclipse.wst.xsl.exslt.ui, Version: 1.0.0.v201006012005, Location: reference:file:plugins/org.eclipse.wst.xsl.exslt.ui_1.0.0.v201006012005.jar
Id: org.eclipse.wst.xsl.jaxp.debug, Version: 1.0.200.v201103081922, Location: reference:file:plugins/org.eclipse.wst.xsl.jaxp.debug_1.0.200.v201103081922.jar
Id: org.eclipse.wst.xsl.jaxp.debug.ui, Version: 1.0.200.v201103081922, Location: reference:file:plugins/org.eclipse.wst.xsl.jaxp.debug.ui_1.0.200.v201103081922.jar
Id: org.eclipse.wst.xsl.jaxp.launching, Version: 1.0.200.v201103081922, Location: reference:file:plugins/org.eclipse.wst.xsl.jaxp.launching_1.0.200.v201103081922.jar
Id: org.eclipse.wst.xsl.launching, Version: 1.0.200.v201103081922, Location: reference:file:plugins/org.eclipse.wst.xsl.launching_1.0.200.v201103081922.jar
Id: org.eclipse.wst.xsl.saxon, Version: 1.0.200.v201103081922, Location: reference:file:plugins/org.eclipse.wst.xsl.saxon_1.0.200.v201103081922.jar
Id: org.eclipse.wst.xsl.ui, Version: 1.1.300.v201204101539, Location: reference:file:plugins/org.eclipse.wst.xsl.ui_1.1.300.v201204101539.jar
Id: org.eclipse.wst.xsl.xalan, Version: 1.0.100.v201103081922, Location: reference:file:plugins/org.eclipse.wst.xsl.xalan_1.0.100.v201103081922.jar
Id: org.eclipse.wtp.epp.package.capabilities, Version: 1.3.0.v201005102000, Location: reference:file:plugins/org.eclipse.wtp.epp.package.capabilities_1.3.0.v201005102000/
Id: org.eclipse.wtp.epp.package.jee.intro, Version: 1.3.0.v201006142040, Location: reference:file:plugins/org.eclipse.wtp.epp.package.jee.intro_1.3.0.v201006142040/
Id: org.eclipse.wtp.javascript.capabilities, Version: 1.0.100.v201005102000, Location: reference:file:plugins/org.eclipse.wtp.javascript.capabilities_1.0.100.v201005102000.jar
Id: org.eclipse.wtp.jee.capabilities, Version: 1.0.100.v201005102000, Location: reference:file:plugins/org.eclipse.wtp.jee.capabilities_1.0.100.v201005102000.jar
Id: org.eclipse.wtp.web.capabilities, Version: 1.0.100.v201005102000, Location: reference:file:plugins/org.eclipse.wtp.web.capabilities_1.0.100.v201005102000.jar
Id: org.eclipse.wtp.xml.capabilities, Version: 1.0.100.v201005102000, Location: reference:file:plugins/org.eclipse.wtp.xml.capabilities_1.0.100.v201005102000.jar
Id: org.eclipse.xsd, Version: 2.8.1.v20130125-0826, Location: reference:file:plugins/org.eclipse.xsd_2.8.1.v20130125-0826.jar
Id: org.eclipse.xsd.edit, Version: 2.6.0.v20130125-0826, Location: reference:file:plugins/org.eclipse.xsd.edit_2.6.0.v20130125-0826.jar
Id: org.hamcrest.core, Version: 1.1.0.v20090501071000, Location: reference:file:plugins/org.hamcrest.core_1.1.0.v20090501071000.jar
Id: org.jdom, Version: 1.0.0.v201005080400, Location: reference:file:plugins/org.jdom_1.0.0.v201005080400.jar
Id: org.jdom, Version: 1.1.1.v201101151400, Location: reference:file:plugins/org.jdom_1.1.1.v201101151400.jar
Id: org.jsoup, Version: 1.6.1.v201201201356, Location: reference:file:plugins/org.jsoup_1.6.1.v201201201356.jar
Id: org.junit, Version: 3.8.2.v3_8_2_v20100427-1100, Location: reference:file:plugins/org.junit_3.8.2.v3_8_2_v20100427-1100/
Id: org.junit, Version: 4.10.0.v4_10_0_v20120426-0900, Location: reference:file:plugins/org.junit_4.10.0.v4_10_0_v20120426-0900/
Id: org.junit4, Version: 4.8.1.v20120523-1257, Location: reference:file:plugins/org.junit4_4.8.1.v20120523-1257/
Id: org.kohsuke.args4j, Version: 2.0.12.v200910131500, Location: reference:file:plugins/org.kohsuke.args4j_2.0.12.v200910131500.jar
Id: org.mozilla.javascript, Version: 1.7.2.v201005080400, Location: reference:file:plugins/org.mozilla.javascript_1.7.2.v201005080400.jar
Id: org.objectweb.asm, Version: 3.3.1.v201105211655, Location: reference:file:plugins/org.objectweb.asm_3.3.1.v201105211655.jar
Id: org.sat4j.core, Version: 2.3.0.v20110329, Location: reference:file:plugins/org.sat4j.core_2.3.0.v20110329.jar
Id: org.sat4j.pb, Version: 2.3.0.v20110329, Location: reference:file:plugins/org.sat4j.pb_2.3.0.v20110329.jar
Id: org.swtchart, Version: 0.7.0.v201201201914, Location: reference:file:plugins/org.swtchart_0.7.0.v201201201914.jar
Id: org.uddi4j, Version: 2.0.5.v200805270300, Location: reference:file:plugins/org.uddi4j_2.0.5.v200805270300.jar
Id: org.w3c.css.sac, Version: 1.3.1.v200903091627, Location: reference:file:plugins/org.w3c.css.sac_1.3.1.v200903091627.jar
Id: org.w3c.dom.smil, Version: 1.0.0.v200806040011, Location: reference:file:plugins/org.w3c.dom.smil_1.0.0.v200806040011.jar
Id: org.w3c.dom.svg, Version: 1.1.0.v201011041433, Location: reference:file:plugins/org.w3c.dom.svg_1.1.0.v201011041433.jar

*** Security Configuration:
Providers (8): 

 Provider: SUN, Version: 1.8, Class: sun.security.provider.Sun
  Description: SUN (DSA key/parameter generation; DSA signing; SHA-1, MD5 digests; SecureRandom; X.509 certificates; JKS & DKS keystores; PKIX CertPathValidator; PKIX CertPathBuilder; LDAP, Collection CertStores, JavaPolicy Policy; JavaLoginConfig Configuration)
  Services (30):
   Service: MessageDigest, Algorithm: SHA-512, Class: sun.security.provider.SHA5$SHA512
    Aliases: 2.16.840.1.101.3.4.2.3
   Service: Configuration, Algorithm: JavaLoginConfig, Class: sun.security.provider.ConfigFile$Spi
   Service: Signature, Algorithm: NONEwithDSA, Class: sun.security.provider.DSA$RawDSA
    Aliases: RawDSA
    Attributes:
      KeySize: 1024
      SupportedKeyClasses: java.security.interfaces.DSAPublicKey|java.security.interfaces.DSAPrivateKey
   Service: CertPathBuilder, Algorithm: PKIX, Class: sun.security.provider.certpath.SunCertPathBuilder
    Attributes:
      ImplementedIn: Software
      ValidationAlgorithm: RFC3280
   Service: CertStore, Algorithm: LDAP, Class: sun.security.provider.certpath.ldap.LDAPCertStore
    Attributes:
      ImplementedIn: Software
      LDAPSchema: RFC2587
   Service: CertificateFactory, Algorithm: X.509, Class: sun.security.provider.X509Factory
    Aliases: X509
    Attributes:
      ImplementedIn: Software
   Service: MessageDigest, Algorithm: SHA, Class: sun.security.provider.SHA
    Aliases: SHA1
    Attributes:
      ImplementedIn: Software
   Service: KeyStore, Algorithm: DKS, Class: sun.security.provider.DomainKeyStore$DKS
   Service: MessageDigest, Algorithm: SHA-384, Class: sun.security.provider.SHA5$SHA384
    Aliases: 2.16.840.1.101.3.4.2.2
   Service: SecureRandom, Algorithm: NativePRNG, Class: sun.security.provider.NativePRNG
   Service: Signature, Algorithm: SHA224withDSA, Class: sun.security.provider.DSA$SHA224withDSA
    Aliases: 2.16.840.1.101.3.4.3.1
    Attributes:
      KeySize: 2048
      SupportedKeyClasses: java.security.interfaces.DSAPublicKey|java.security.interfaces.DSAPrivateKey
   Service: KeyPairGenerator, Algorithm: DSA, Class: sun.security.provider.DSAKeyPairGenerator
    Aliases: OID.1.2.840.10040.4.1
    Attributes:
      ImplementedIn: Software
      KeySize: 2048
   Service: KeyStore, Algorithm: JKS, Class: sun.security.provider.JavaKeyStore$DualFormatJKS
    Attributes:
      ImplementedIn: Software
   Service: SecureRandom, Algorithm: NativePRNGBlocking, Class: sun.security.provider.NativePRNG$Blocking
   Service: KeyStore, Algorithm: CaseExactJKS, Class: sun.security.provider.JavaKeyStore$CaseExactJKS
   Service: MessageDigest, Algorithm: SHA-256, Class: sun.security.provider.SHA2$SHA256
    Aliases: 2.16.840.1.101.3.4.2.1
   Service: CertStore, Algorithm: com.sun.security.IndexedCollection, Class: sun.security.provider.certpath.IndexedCollectionCertStore
    Attributes:
      ImplementedIn: Software
   Service: KeyFactory, Algorithm: DSA, Class: sun.security.provider.DSAKeyFactory
    Aliases: OID.1.2.840.10040.4.1
    Attributes:
      ImplementedIn: Software
   Service: MessageDigest, Algorithm: SHA-224, Class: sun.security.provider.SHA2$SHA224
    Aliases: 2.16.840.1.101.3.4.2.4
   Service: SecureRandom, Algorithm: SHA1PRNG, Class: sun.security.provider.SecureRandom
    Attributes:
      ImplementedIn: Software
   Service: CertPathValidator, Algorithm: PKIX, Class: sun.security.provider.certpath.PKIXCertPathValidator
    Attributes:
      ImplementedIn: Software
      ValidationAlgorithm: RFC3280
   Service: CertStore, Algorithm: Collection, Class: sun.security.provider.certpath.CollectionCertStore
    Attributes:
      ImplementedIn: Software
   Service: MessageDigest, Algorithm: MD5, Class: sun.security.provider.MD5
    Attributes:
      ImplementedIn: Software
   Service: AlgorithmParameters, Algorithm: DSA, Class: sun.security.provider.DSAParameters
    Aliases: OID.1.2.840.10040.4.1
    Attributes:
      ImplementedIn: Software
   Service: Policy, Algorithm: JavaPolicy, Class: sun.security.provider.PolicySpiFile
   Service: MessageDigest, Algorithm: MD2, Class: sun.security.provider.MD2
   Service: Signature, Algorithm: SHA1withDSA, Class: sun.security.provider.DSA$SHA1withDSA
    Aliases: DSAWithSHA1
    Attributes:
      ImplementedIn: Software
      KeySize: 1024
      SupportedKeyClasses: java.security.interfaces.DSAPublicKey|java.security.interfaces.DSAPrivateKey
   Service: Signature, Algorithm: SHA256withDSA, Class: sun.security.provider.DSA$SHA256withDSA
    Aliases: 2.16.840.1.101.3.4.3.2
    Attributes:
      KeySize: 2048
      SupportedKeyClasses: java.security.interfaces.DSAPublicKey|java.security.interfaces.DSAPrivateKey
   Service: AlgorithmParameterGenerator, Algorithm: DSA, Class: sun.security.provider.DSAParameterGenerator
    Aliases: OID.1.2.840.10040.4.1
    Attributes:
      ImplementedIn: Software
      KeySize: 2048
   Service: SecureRandom, Algorithm: NativePRNGNonBlocking, Class: sun.security.provider.NativePRNG$NonBlocking

 Provider: SunRsaSign, Version: 1.8, Class: sun.security.rsa.SunRsaSign
  Description: Sun RSA signature provider
  Services (9):
   Service: Signature, Algorithm: SHA512withRSA, Class: sun.security.rsa.RSASignature$SHA512withRSA
    Aliases: 1.2.840.113549.1.1.13
    Attributes:
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey
   Service: Signature, Algorithm: MD5withRSA, Class: sun.security.rsa.RSASignature$MD5withRSA
    Aliases: OID.1.2.840.113549.1.1.4
    Attributes:
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey
   Service: Signature, Algorithm: SHA1withRSA, Class: sun.security.rsa.RSASignature$SHA1withRSA
    Aliases: OID.1.2.840.113549.1.1.5
    Attributes:
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey
   Service: KeyFactory, Algorithm: RSA, Class: sun.security.rsa.RSAKeyFactory
    Aliases: 1.2.840.113549.1.1
   Service: Signature, Algorithm: SHA384withRSA, Class: sun.security.rsa.RSASignature$SHA384withRSA
    Aliases: 1.2.840.113549.1.1.12
    Attributes:
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey
   Service: KeyPairGenerator, Algorithm: RSA, Class: sun.security.rsa.RSAKeyPairGenerator
    Aliases: 1.2.840.113549.1.1
   Service: Signature, Algorithm: SHA256withRSA, Class: sun.security.rsa.RSASignature$SHA256withRSA
    Aliases: 1.2.840.113549.1.1.11
    Attributes:
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey
   Service: Signature, Algorithm: MD2withRSA, Class: sun.security.rsa.RSASignature$MD2withRSA
    Aliases: 1.2.840.113549.1.1.2
    Attributes:
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey
   Service: Signature, Algorithm: SHA224withRSA, Class: sun.security.rsa.RSASignature$SHA224withRSA
    Aliases: 1.2.840.113549.1.1.14
    Attributes:
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey

 Provider: SunJSSE, Version: 1.8, Class: com.sun.net.ssl.internal.ssl.Provider
  Description: Sun JSSE provider(PKCS12, SunX509/PKIX key/trust factories, SSLv3/TLSv1/TLSv1.1/TLSv1.2)
  Services (16):
   Service: Signature, Algorithm: MD5andSHA1withRSA, Class: sun.security.ssl.RSASignature
   Service: SSLContext, Algorithm: Default, Class: sun.security.ssl.SSLContextImpl$DefaultSSLContext
   Service: KeyManagerFactory, Algorithm: SunX509, Class: sun.security.ssl.KeyManagerFactoryImpl$SunX509
   Service: Signature, Algorithm: MD5withRSA, Class: sun.security.rsa.RSASignature$MD5withRSA
    Aliases: OID.1.2.840.113549.1.1.4
   Service: Signature, Algorithm: SHA1withRSA, Class: sun.security.rsa.RSASignature$SHA1withRSA
    Aliases: OID.1.2.840.113549.1.1.5
   Service: KeyFactory, Algorithm: RSA, Class: sun.security.rsa.RSAKeyFactory
    Aliases: 1.2.840.113549.1.1
   Service: TrustManagerFactory, Algorithm: SunX509, Class: sun.security.ssl.TrustManagerFactoryImpl$SimpleFactory
   Service: KeyStore, Algorithm: PKCS12, Class: sun.security.pkcs12.PKCS12KeyStore
   Service: SSLContext, Algorithm: TLS, Class: sun.security.ssl.SSLContextImpl$TLSContext
    Aliases: SSL
   Service: KeyPairGenerator, Algorithm: RSA, Class: sun.security.rsa.RSAKeyPairGenerator
    Aliases: 1.2.840.113549.1.1
   Service: SSLContext, Algorithm: TLSv1, Class: sun.security.ssl.SSLContextImpl$TLS10Context
    Aliases: SSLv3
   Service: Signature, Algorithm: MD2withRSA, Class: sun.security.rsa.RSASignature$MD2withRSA
    Aliases: 1.2.840.113549.1.1.2
   Service: SSLContext, Algorithm: TLSv1.2, Class: sun.security.ssl.SSLContextImpl$TLS12Context
   Service: KeyManagerFactory, Algorithm: NewSunX509, Class: sun.security.ssl.KeyManagerFactoryImpl$X509
    Aliases: PKIX
   Service: SSLContext, Algorithm: TLSv1.1, Class: sun.security.ssl.SSLContextImpl$TLS11Context
   Service: TrustManagerFactory, Algorithm: PKIX, Class: sun.security.ssl.TrustManagerFactoryImpl$PKIXFactory
    Aliases: X509

 Provider: SunJCE, Version: 1.8, Class: com.sun.crypto.provider.SunJCE
  Description: SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)
  Services (131):
   Service: SecretKeyFactory, Algorithm: PBKDF2WithHmacSHA512, Class: com.sun.crypto.provider.PBKDF2Core$HmacSHA512
   Service: KeyGenerator, Algorithm: Blowfish, Class: com.sun.crypto.provider.BlowfishKeyGenerator
   Service: Mac, Algorithm: HmacPBESHA1, Class: com.sun.crypto.provider.HmacPKCS12PBESHA1
    Attributes:
      SupportedKeyFormats: RAW
   Service: KeyGenerator, Algorithm: HmacSHA512, Class: com.sun.crypto.provider.KeyGeneratorCore$HmacSHA2KG$SHA512
    Aliases: 1.2.840.113549.2.11
   Service: AlgorithmParameters, Algorithm: GCM, Class: com.sun.crypto.provider.GCMParameters
   Service: Cipher, Algorithm: PBEWithHmacSHA1AndAES_128, Class: com.sun.crypto.provider.PBES2Core$HmacSHA1AndAES_128
   Service: KeyGenerator, Algorithm: SunTlsMasterSecret, Class: com.sun.crypto.provider.TlsMasterSecretGenerator
    Aliases: SunTls12MasterSecret
   Service: AlgorithmParameters, Algorithm: PBES2, Class: com.sun.crypto.provider.PBES2Parameters$General
    Aliases: 1.2.840.113549.1.5.13
   Service: Cipher, Algorithm: DES, Class: com.sun.crypto.provider.DESCipher
    Attributes:
      SupportedKeyFormats: RAW
      SupportedPaddings: NOPADDING|PKCS5PADDING|ISO10126PADDING
      SupportedModes: ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64
   Service: Cipher, Algorithm: AES_192/CBC/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES192_CBC_NoPadding
    Aliases: OID.2.16.840.1.101.3.4.1.22
   Service: Cipher, Algorithm: Blowfish, Class: com.sun.crypto.provider.BlowfishCipher
    Attributes:
      SupportedKeyFormats: RAW
      SupportedPaddings: NOPADDING|PKCS5PADDING|ISO10126PADDING
      SupportedModes: ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64
   Service: SecretKeyFactory, Algorithm: PBKDF2WithHmacSHA1, Class: com.sun.crypto.provider.PBKDF2Core$HmacSHA1
    Aliases: 1.2.840.113549.1.5.12
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA512AndAES_128, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA512AndAES_128
   Service: AlgorithmParameters, Algorithm: PBEWithMD5AndTripleDES, Class: com.sun.crypto.provider.PBEParameters
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA384AndAES_128, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA384AndAES_128
   Service: AlgorithmParameters, Algorithm: PBEWithSHA1AndRC2_40, Class: com.sun.crypto.provider.PBEParameters
    Aliases: 1.2.840.113549.1.12.1.6
   Service: Cipher, Algorithm: PBEWithHmacSHA256AndAES_128, Class: com.sun.crypto.provider.PBES2Core$HmacSHA256AndAES_128
   Service: Cipher, Algorithm: RC2, Class: com.sun.crypto.provider.RC2Cipher
    Attributes:
      SupportedPaddings: NOPADDING|PKCS5PADDING|ISO10126PADDING
      SupportedKeyFormats: RAW
      SupportedModes: ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64
   Service: Cipher, Algorithm: AES_256/OFB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES256_OFB_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.43
   Service: AlgorithmParameters, Algorithm: PBEWithSHA1AndDESede, Class: com.sun.crypto.provider.PBEParameters
    Aliases: 1.2.840.113549.1.12.1.3
   Service: Cipher, Algorithm: AES_128/GCM/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES128_GCM_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.6
   Service: AlgorithmParameters, Algorithm: PBEWithSHA1AndRC4_128, Class: com.sun.crypto.provider.PBEParameters
    Aliases: 1.2.840.113549.1.12.1.1
   Service: Cipher, Algorithm: PBEWithHmacSHA224AndAES_256, Class: com.sun.crypto.provider.PBES2Core$HmacSHA224AndAES_256
   Service: KeyGenerator, Algorithm: HmacSHA1, Class: com.sun.crypto.provider.HmacSHA1KeyGenerator
    Aliases: OID.1.2.840.113549.2.7
   Service: Cipher, Algorithm: AES, Class: com.sun.crypto.provider.AESCipher$General
    Aliases: Rijndael
    Attributes:
      SupportedKeyFormats: RAW
      SupportedPaddings: NOPADDING|PKCS5PADDING|ISO10126PADDING
      SupportedModes: ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64|GCM|CFB72|CFB80|CFB88|CFB96|CFB104|CFB112|CFB120|CFB128|OFB72|OFB80|OFB88|OFB96|OFB104|OFB112|OFB120|OFB128
   Service: AlgorithmParameters, Algorithm: PBEWithSHA1AndRC4_40, Class: com.sun.crypto.provider.PBEParameters
    Aliases: 1.2.840.113549.1.12.1.2
   Service: Mac, Algorithm: HmacSHA384, Class: com.sun.crypto.provider.HmacCore$HmacSHA384
    Aliases: 1.2.840.113549.2.10
    Attributes:
      SupportedKeyFormats: RAW
   Service: Cipher, Algorithm: DESede, Class: com.sun.crypto.provider.DESedeCipher
    Aliases: TripleDES
    Attributes:
      SupportedKeyFormats: RAW
      SupportedPaddings: NOPADDING|PKCS5PADDING|ISO10126PADDING
      SupportedModes: ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64
   Service: Mac, Algorithm: HmacSHA224, Class: com.sun.crypto.provider.HmacCore$HmacSHA224
    Aliases: OID.1.2.840.113549.2.8
    Attributes:
      SupportedKeyFormats: RAW
   Service: KeyFactory, Algorithm: DiffieHellman, Class: com.sun.crypto.provider.DHKeyFactory
    Aliases: 1.2.840.113549.1.3.1
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA384AndAES_256, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA384AndAES_256
   Service: Cipher, Algorithm: AES_256/CFB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES256_CFB_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.44
   Service: Cipher, Algorithm: PBEWithMD5AndDES, Class: com.sun.crypto.provider.PBEWithMD5AndDESCipher
    Aliases: 1.2.840.113549.1.5.3
   Service: AlgorithmParameters, Algorithm: DESede, Class: com.sun.crypto.provider.DESedeParameters
    Aliases: TripleDES
   Service: Cipher, Algorithm: PBEWithHmacSHA512AndAES_256, Class: com.sun.crypto.provider.PBES2Core$HmacSHA512AndAES_256
   Service: Mac, Algorithm: HmacSHA512, Class: com.sun.crypto.provider.HmacCore$HmacSHA512
    Aliases: 1.2.840.113549.2.11
    Attributes:
      SupportedKeyFormats: RAW
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA256AndAES_256, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA256AndAES_256
   Service: Cipher, Algorithm: AES_128/CBC/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES128_CBC_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.2
   Service: Cipher, Algorithm: AES_256/ECB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES256_ECB_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.41
   Service: SecretKeyFactory, Algorithm: PBEWithSHA1AndRC4_128, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndRC4_128
    Aliases: 1.2.840.113549.1.12.1.1
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA1AndAES_128, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA1AndAES_128
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA256AndAES_128, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA256AndAES_128
   Service: Mac, Algorithm: HmacMD5, Class: com.sun.crypto.provider.HmacMD5
    Attributes:
      SupportedKeyFormats: RAW
   Service: Cipher, Algorithm: AESWrap_192, Class: com.sun.crypto.provider.AESWrapCipher$AES192
    Aliases: OID.2.16.840.1.101.3.4.1.25
   Service: Mac, Algorithm: SslMacMD5, Class: com.sun.crypto.provider.SslMacCore$SslMacMD5
    Attributes:
      SupportedKeyFormats: RAW
   Service: Mac, Algorithm: HmacSHA1, Class: com.sun.crypto.provider.HmacSHA1
    Aliases: OID.1.2.840.113549.2.7
    Attributes:
      SupportedKeyFormats: RAW
   Service: KeyGenerator, Algorithm: DES, Class: com.sun.crypto.provider.DESKeyGenerator
   Service: Mac, Algorithm: SslMacSHA1, Class: com.sun.crypto.provider.SslMacCore$SslMacSHA1
    Attributes:
      SupportedKeyFormats: RAW
   Service: Cipher, Algorithm: PBEWithMD5AndTripleDES, Class: com.sun.crypto.provider.PBEWithMD5AndTripleDESCipher
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA224AndAES_128, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA224AndAES_128
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA224AndAES_256, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA224AndAES_256
   Service: Mac, Algorithm: PBEWithHmacSHA384, Class: com.sun.crypto.provider.PBMAC1Core$HmacSHA384
    Attributes:
      SupportedKeyFormats: RAW
   Service: SecretKeyFactory, Algorithm: DES, Class: com.sun.crypto.provider.DESKeyFactory
   Service: Mac, Algorithm: PBEWithHmacSHA224, Class: com.sun.crypto.provider.PBMAC1Core$HmacSHA224
    Attributes:
      SupportedKeyFormats: RAW
   Service: KeyGenerator, Algorithm: RC2, Class: com.sun.crypto.provider.KeyGeneratorCore$RC2KeyGenerator
   Service: SecretKeyFactory, Algorithm: PBKDF2WithHmacSHA256, Class: com.sun.crypto.provider.PBKDF2Core$HmacSHA256
   Service: Cipher, Algorithm: AES_256/GCM/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES256_GCM_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.46
   Service: Cipher, Algorithm: PBEWithHmacSHA384AndAES_128, Class: com.sun.crypto.provider.PBES2Core$HmacSHA384AndAES_128
   Service: SecretKeyFactory, Algorithm: DESede, Class: com.sun.crypto.provider.DESedeKeyFactory
    Aliases: TripleDES
   Service: Cipher, Algorithm: ARCFOUR, Class: com.sun.crypto.provider.ARCFOURCipher
    Aliases: RC4
    Attributes:
      SupportedKeyFormats: RAW
      SupportedPaddings: NOPADDING
      SupportedModes: ECB
   Service: Cipher, Algorithm: AESWrap_128, Class: com.sun.crypto.provider.AESWrapCipher$AES128
    Aliases: 2.16.840.1.101.3.4.1.5
   Service: KeyGenerator, Algorithm: AES, Class: com.sun.crypto.provider.AESKeyGenerator
    Aliases: Rijndael
   Service: KeyGenerator, Algorithm: HmacSHA256, Class: com.sun.crypto.provider.KeyGeneratorCore$HmacSHA2KG$SHA256
    Aliases: OID.1.2.840.113549.2.9
   Service: Mac, Algorithm: PBEWithHmacSHA512, Class: com.sun.crypto.provider.PBMAC1Core$HmacSHA512
    Attributes:
      SupportedKeyFormats: RAW
   Service: KeyGenerator, Algorithm: SunTls12Prf, Class: com.sun.crypto.provider.TlsPrfGenerator$V12
   Service: Cipher, Algorithm: RSA, Class: com.sun.crypto.provider.RSACipher
    Attributes:
      SupportedPaddings: NOPADDING|PKCS1PADDING|OAEPPADDING|OAEPWITHMD5ANDMGF1PADDING|OAEPWITHSHA1ANDMGF1PADDING|OAEPWITHSHA-1ANDMGF1PADDING|OAEPWITHSHA-224ANDMGF1PADDING|OAEPWITHSHA-256ANDMGF1PADDING|OAEPWITHSHA-384ANDMGF1PADDING|OAEPWITHSHA-512ANDMGF1PADDING
      SupportedModes: ECB
      SupportedKeyClasses: java.security.interfaces.RSAPublicKey|java.security.interfaces.RSAPrivateKey
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA512AndAES_128, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA512AndAES_128
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA1AndAES_128, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA1AndAES_128
   Service: Cipher, Algorithm: PBEWithSHA1AndRC4_128, Class: com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndRC4_128
    Aliases: 1.2.840.113549.1.12.1.1
   Service: KeyGenerator, Algorithm: ARCFOUR, Class: com.sun.crypto.provider.KeyGeneratorCore$ARCFOURKeyGenerator
    Aliases: RC4
   Service: Cipher, Algorithm: PBEWithHmacSHA1AndAES_256, Class: com.sun.crypto.provider.PBES2Core$HmacSHA1AndAES_256
   Service: AlgorithmParameters, Algorithm: PBEWithSHA1AndRC2_128, Class: com.sun.crypto.provider.PBEParameters
    Aliases: 1.2.840.113549.1.12.1.5
   Service: KeyGenerator, Algorithm: SunTlsPrf, Class: com.sun.crypto.provider.TlsPrfGenerator$V10
   Service: AlgorithmParameters, Algorithm: DiffieHellman, Class: com.sun.crypto.provider.DHParameters
    Aliases: 1.2.840.113549.1.3.1
   Service: Mac, Algorithm: PBEWithHmacSHA1, Class: com.sun.crypto.provider.PBMAC1Core$HmacSHA1
    Attributes:
      SupportedKeyFormatS: RAW
   Service: KeyGenerator, Algorithm: HmacMD5, Class: com.sun.crypto.provider.HmacMD5KeyGenerator
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA512AndAES_256, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA512AndAES_256
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA384AndAES_256, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA384AndAES_256
   Service: Cipher, Algorithm: PBEWithHmacSHA256AndAES_256, Class: com.sun.crypto.provider.PBES2Core$HmacSHA256AndAES_256
   Service: Cipher, Algorithm: AESWrap, Class: com.sun.crypto.provider.AESWrapCipher$General
    Attributes:
      SupportedPaddings: NOPADDING
      SupportedKeyFormats: RAW
      SupportedModes: ECB
   Service: AlgorithmParameters, Algorithm: OAEP, Class: com.sun.crypto.provider.OAEPParameters
   Service: SecretKeyFactory, Algorithm: PBEWithSHA1AndRC2_40, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndRC2_40
    Aliases: 1.2.840.113549.1.12.1.6
   Service: Cipher, Algorithm: AES_192/CFB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES192_CFB_NoPadding
    Aliases: OID.2.16.840.1.101.3.4.1.24
   Service: Cipher, Algorithm: AES_192/OFB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES192_OFB_NoPadding
    Aliases: OID.2.16.840.1.101.3.4.1.23
   Service: Cipher, Algorithm: PBEWithSHA1AndRC2_40, Class: com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndRC2_40
    Aliases: 1.2.840.113549.1.12.1.6
   Service: Cipher, Algorithm: PBEWithHmacSHA224AndAES_128, Class: com.sun.crypto.provider.PBES2Core$HmacSHA224AndAES_128
   Service: KeyGenerator, Algorithm: SunTlsKeyMaterial, Class: com.sun.crypto.provider.TlsKeyMaterialGenerator
    Aliases: SunTls12KeyMaterial
   Service: SecretKeyFactory, Algorithm: PBEWithSHA1AndDESede, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndDESede
    Aliases: 1.2.840.113549.1.12.1.3
   Service: Cipher, Algorithm: AES_256/CBC/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES256_CBC_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.42
   Service: KeyPairGenerator, Algorithm: DiffieHellman, Class: com.sun.crypto.provider.DHKeyPairGenerator
    Aliases: 1.2.840.113549.1.3.1
   Service: SecretKeyFactory, Algorithm: PBEWithSHA1AndRC2_128, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndRC2_128
    Aliases: 1.2.840.113549.1.12.1.5
   Service: Cipher, Algorithm: PBEWithSHA1AndDESede, Class: com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndDESede
    Aliases: 1.2.840.113549.1.12.1.3
   Service: SecretKeyFactory, Algorithm: PBEWithSHA1AndRC4_40, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithSHA1AndRC4_40
    Aliases: 1.2.840.113549.1.12.1.2
   Service: Mac, Algorithm: HmacSHA256, Class: com.sun.crypto.provider.HmacCore$HmacSHA256
    Aliases: OID.1.2.840.113549.2.9
    Attributes:
      SupportedKeyFormats: RAW
   Service: Cipher, Algorithm: AES_192/ECB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES192_ECB_NoPadding
    Aliases: OID.2.16.840.1.101.3.4.1.21
   Service: Cipher, Algorithm: PBEWithSHA1AndRC4_40, Class: com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndRC4_40
    Aliases: 1.2.840.113549.1.12.1.2
   Service: AlgorithmParameters, Algorithm: PBEWithMD5AndDES, Class: com.sun.crypto.provider.PBEParameters
    Aliases: 1.2.840.113549.1.5.3
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA384AndAES_128, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA384AndAES_128
   Service: AlgorithmParameters, Algorithm: DES, Class: com.sun.crypto.provider.DESParameters
   Service: KeyAgreement, Algorithm: DiffieHellman, Class: com.sun.crypto.provider.DHKeyAgreement
    Aliases: 1.2.840.113549.1.3.1
    Attributes:
      SupportedKeyClasses: javax.crypto.interfaces.DHPublicKey|javax.crypto.interfaces.DHPrivateKey
   Service: Cipher, Algorithm: PBEWithHmacSHA512AndAES_128, Class: com.sun.crypto.provider.PBES2Core$HmacSHA512AndAES_128
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA256AndAES_128, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA256AndAES_128
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA1AndAES_256, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA1AndAES_256
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA256AndAES_256, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA256AndAES_256
   Service: AlgorithmParameters, Algorithm: RC2, Class: com.sun.crypto.provider.RC2Parameters
   Service: AlgorithmParameterGenerator, Algorithm: DiffieHellman, Class: com.sun.crypto.provider.DHParameterGenerator
    Aliases: 1.2.840.113549.1.3.1
   Service: KeyGenerator, Algorithm: SunTlsRsaPremasterSecret, Class: com.sun.crypto.provider.TlsRsaPremasterSecretGenerator
    Aliases: SunTls12RsaPremasterSecret
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA224AndAES_256, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA224AndAES_256
   Service: AlgorithmParameters, Algorithm: AES, Class: com.sun.crypto.provider.AESParameters
    Aliases: Rijndael
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA224AndAES_128, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA224AndAES_128
   Service: Cipher, Algorithm: AES_128/CFB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES128_CFB_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.4
   Service: Mac, Algorithm: PBEWithHmacSHA256, Class: com.sun.crypto.provider.PBMAC1Core$HmacSHA256
    Attributes:
      SupportedKeyFormats: RAW
   Service: Cipher, Algorithm: PBEWithSHA1AndRC2_128, Class: com.sun.crypto.provider.PKCS12PBECipherCore$PBEWithSHA1AndRC2_128
    Aliases: 1.2.840.113549.1.12.1.5
   Service: Cipher, Algorithm: AES_128/OFB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES128_OFB_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.3
   Service: SecretKeyFactory, Algorithm: PBEWithMD5AndTripleDES, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithMD5AndTripleDES
   Service: SecretKeyFactory, Algorithm: PBEWithMD5AndDES, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithMD5AndDES
    Aliases: 1.2.840.113549.1.5.3
   Service: SecretKeyFactory, Algorithm: PBKDF2WithHmacSHA384, Class: com.sun.crypto.provider.PBKDF2Core$HmacSHA384
   Service: SecretKeyFactory, Algorithm: PBKDF2WithHmacSHA224, Class: com.sun.crypto.provider.PBKDF2Core$HmacSHA224
   Service: Cipher, Algorithm: PBEWithHmacSHA384AndAES_256, Class: com.sun.crypto.provider.PBES2Core$HmacSHA384AndAES_256
   Service: Cipher, Algorithm: AES_128/ECB/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES128_ECB_NoPadding
    Aliases: 2.16.840.1.101.3.4.1.1
   Service: Cipher, Algorithm: AESWrap_256, Class: com.sun.crypto.provider.AESWrapCipher$AES256
    Aliases: 2.16.840.1.101.3.4.1.45
   Service: KeyGenerator, Algorithm: HmacSHA384, Class: com.sun.crypto.provider.KeyGeneratorCore$HmacSHA2KG$SHA384
    Aliases: 1.2.840.113549.2.10
   Service: KeyGenerator, Algorithm: HmacSHA224, Class: com.sun.crypto.provider.KeyGeneratorCore$HmacSHA2KG$SHA224
    Aliases: OID.1.2.840.113549.2.8
   Service: Cipher, Algorithm: DESedeWrap, Class: com.sun.crypto.provider.DESedeWrapCipher
    Attributes:
      SupportedPaddings: NOPADDING
      SupportedKeyFormats: RAW
      SupportedModes: CBC
   Service: KeyStore, Algorithm: JCEKS, Class: com.sun.crypto.provider.JceKeyStore
   Service: Cipher, Algorithm: AES_192/GCM/NoPadding, Class: com.sun.crypto.provider.AESCipher$AES192_GCM_NoPadding
    Aliases: OID.2.16.840.1.101.3.4.1.26
   Service: AlgorithmParameters, Algorithm: PBE, Class: com.sun.crypto.provider.PBEParameters
   Service: AlgorithmParameters, Algorithm: Blowfish, Class: com.sun.crypto.provider.BlowfishParameters
   Service: SecretKeyFactory, Algorithm: PBEWithHmacSHA512AndAES_256, Class: com.sun.crypto.provider.PBEKeyFactory$PBEWithHmacSHA512AndAES_256
   Service: KeyGenerator, Algorithm: DESede, Class: com.sun.crypto.provider.DESedeKeyGenerator
    Aliases: TripleDES
   Service: AlgorithmParameters, Algorithm: PBEWithHmacSHA1AndAES_256, Class: com.sun.crypto.provider.PBES2Parameters$HmacSHA1AndAES_256

 Provider: SunJGSS, Version: 1.8, Class: sun.security.jgss.SunProvider
  Description: Sun (Kerberos v5, SPNEGO)
  Services (2):
   Service: GssApiMechanism, Algorithm: 1.3.6.1.5.5.2, Class: sun.security.jgss.spnego.SpNegoMechFactory
   Service: GssApiMechanism, Algorithm: 1.2.840.113554.1.2.2, Class: sun.security.jgss.krb5.Krb5MechFactory

 Provider: SunSASL, Version: 1.8, Class: com.sun.security.sasl.Provider
  Description: Sun SASL provider(implements client mechanisms for: DIGEST-MD5, GSSAPI, EXTERNAL, PLAIN, CRAM-MD5, NTLM; server mechanisms for: DIGEST-MD5, GSSAPI, CRAM-MD5, NTLM)
  Services (10):
   Service: SaslClientFactory, Algorithm: NTLM, Class: com.sun.security.sasl.ntlm.FactoryImpl
   Service: SaslClientFactory, Algorithm: CRAM-MD5, Class: com.sun.security.sasl.ClientFactoryImpl
   Service: SaslClientFactory, Algorithm: EXTERNAL, Class: com.sun.security.sasl.ClientFactoryImpl
   Service: SaslClientFactory, Algorithm: DIGEST-MD5, Class: com.sun.security.sasl.digest.FactoryImpl
   Service: SaslClientFactory, Algorithm: PLAIN, Class: com.sun.security.sasl.ClientFactoryImpl
   Service: SaslServerFactory, Algorithm: NTLM, Class: com.sun.security.sasl.ntlm.FactoryImpl
   Service: SaslClientFactory, Algorithm: GSSAPI, Class: com.sun.security.sasl.gsskerb.FactoryImpl
   Service: SaslServerFactory, Algorithm: CRAM-MD5, Class: com.sun.security.sasl.ServerFactoryImpl
   Service: SaslServerFactory, Algorithm: DIGEST-MD5, Class: com.sun.security.sasl.digest.FactoryImpl
   Service: SaslServerFactory, Algorithm: GSSAPI, Class: com.sun.security.sasl.gsskerb.FactoryImpl

 Provider: XMLDSig, Version: 1.8, Class: org.jcp.xml.dsig.internal.dom.XMLDSigRI
  Description: XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory; C14N 1.0, C14N 1.1, Exclusive C14N, Base64, Enveloped, XPath, XPath2, XSLT TransformServices)
  Services (13):
   Service: KeyInfoFactory, Algorithm: DOM, Class: org.jcp.xml.dsig.internal.dom.DOMKeyInfoFactory
   Service: TransformService, Algorithm: http://www.w3.org/TR/1999/REC-xpath-19991116, Class: org.jcp.xml.dsig.internal.dom.DOMXPathTransform
    Aliases: XPATH
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments, Class: org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14NMethod
    Aliases: INCLUSIVE_WITH_COMMENTS
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/2000/09/xmldsig#base64, Class: org.jcp.xml.dsig.internal.dom.DOMBase64Transform
    Aliases: BASE64
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/2000/09/xmldsig#enveloped-signature, Class: org.jcp.xml.dsig.internal.dom.DOMEnvelopedTransform
    Aliases: ENVELOPED
    Attributes:
      MechanismType: DOM
   Service: XMLSignatureFactory, Algorithm: DOM, Class: org.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory
   Service: TransformService, Algorithm: http://www.w3.org/TR/2001/REC-xml-c14n-20010315, Class: org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14NMethod
    Aliases: INCLUSIVE
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/2002/06/xmldsig-filter2, Class: org.jcp.xml.dsig.internal.dom.DOMXPathFilter2Transform
    Aliases: XPATH2
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/2001/10/xml-exc-c14n#, Class: org.jcp.xml.dsig.internal.dom.DOMExcC14NMethod
    Aliases: EXCLUSIVE
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/TR/1999/REC-xslt-19991116, Class: org.jcp.xml.dsig.internal.dom.DOMXSLTTransform
    Aliases: XSLT
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/2006/12/xml-c14n11#WithComments, Class: org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/2001/10/xml-exc-c14n#WithComments, Class: org.jcp.xml.dsig.internal.dom.DOMExcC14NMethod
    Aliases: EXCLUSIVE_WITH_COMMENTS
    Attributes:
      MechanismType: DOM
   Service: TransformService, Algorithm: http://www.w3.org/2006/12/xml-c14n11, Class: org.jcp.xml.dsig.internal.dom.DOMCanonicalXMLC14N11Method
    Attributes:
      MechanismType: DOM

 Provider: SunPCSC, Version: 1.8, Class: sun.security.smartcardio.SunPCSC
  Description: Sun PC/SC provider
  Services (1):
   Service: TerminalFactory, Algorithm: PC/SC, Class: sun.security.smartcardio.SunPCSC$Factory


