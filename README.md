# StethoExample

Stetho library should not be included in the production release. You might forget to comment the
Stetho library in the gradle before making a release version. In order to avoid this mistake its
best to create two different classes for initializing Stetho, one for the debug version and one
for the release version.

Create two folders debug and release in the app/src folder<br/>
<img src="https://raw.githubusercontent.com/searock/StethoExample/master/images/folders.png"/>

Now copy the folder java from app/src/main and paste it into debug and release.

Switch to android studio and add your class for the debug version, after that delete the unwanted
common code like activity classes. While deleting the files make sure safe delete is unchecked<br/>
<img src="https://raw.githubusercontent.com/searock/StethoExample/master/images/delete.png"/>

At a time you can see the code either for debug or release version but not both at the same time.
To switch the code go to select app from Project, then from the main menu select
Build -> Select Build Variant<br/>
<img src="https://raw.githubusercontent.com/searock/StethoExample/master/images/select%20app.png"/><br/>
<img src="https://raw.githubusercontent.com/searock/StethoExample/master/images/select%20build%20variant.png"/><br/>
<img src="https://raw.githubusercontent.com/searock/StethoExample/master/images/select%20release.png"/><br/>
<img src="https://raw.githubusercontent.com/searock/StethoExample/master/images/release.png"/><br/>
