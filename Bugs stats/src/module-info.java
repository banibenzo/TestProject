module com.cheibani.bugsstats {
	requires javafx.controls;
	requires transitive javafx.graphics; // la pres�nce de ce module n'est pas obligatoire car javafx.controls contient deja javafx.graphics
	exports com.cheibani.bugsstats;
	
}
