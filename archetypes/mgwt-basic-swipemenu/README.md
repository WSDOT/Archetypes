#MGWT Basic SwipeMenu Archetype

Basic MGWT archetype which uses only one layout for both phone, tablet and desktop and incorporates a SwipeMenu widget.
It has an “About” activity, "Home" activity and one other sample activity wired up to illustrate basic functionality. 
All layout is done with UiBinder rather than through code.

Good starting point if you are new to MGWT and want an app with a side navigation menu.

##Maven Archetype Usage

1. Goto the directory where you want the project.
2. Rename the parameter `-DgroupId=com.example.mgwt.app` to a package naming scheme that works for you.
3. Rename the parameter `-DartifactId=mgwt-basic-example` to a project title you like.
4. Rename the parameter `-Dmodule=App` to a name that starts with a capital. Name it like `MyApp` or `MyProject`.
5. Run the mvn archetype generator below.

```
mvn archetype:generate \
-DarchetypeRepository=http://data.wsdot.wa.gov/archetypes/mvn-repo \
-DarchetypeGroupId=gov.wa.wsdot.data.archetypes \
-DarchetypeArtifactId=mgwt-basic-swipemenu-archetype \
-DarchetypeVersion=1.0-SNAPSHOT \
-DgroupId=com.example.mgwt.app \
-DartifactId=mgwt-basic-swipemenu-example \
-Dmodule=App
```
