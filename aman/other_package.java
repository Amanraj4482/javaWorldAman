// package raj;
// /* importing the other package */
// // import aman.*; // means importing all the classes with in the aman package
// import aman.package_file; //or we can write the class name if we want to access it
// class other_package extends package_file {
// 	public static void main(String[] args) {
// 		other_package obj1 = new other_package();
// 		obj1.show();
// 	}
// }

// javac -d . package_file.java && javac -d . other_package.java &&
// java raj.other_package
/*---------------------------------*/

/*package aman;
class package_file{
	protected void show(){
		System.out.println("package file Method");
	}
	public static void main(String[] args) throws IOException {
		package_file obj = new package_file();
		obj.show();
	}
}
*/

// first compile the class package_file (that should be public)---- in package style     javac -d . package_file.java
// secondly compile the class package_file (that should be public)--- in package style    javac -d . other_package.java
// when the class (other_file )is compiled then another folder will be created with the raj name with class name other_package
// then run the program ---> java raj.other_package
/*------------------------------------------------------------------------------------------------------------------*/