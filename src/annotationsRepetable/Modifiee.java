package annotationsRepetable;

import java.lang.annotation.*;


// Pour rendre une annotation répétable sur une meme classe
// @Repetable(Modifiees.class)
@Retention (RetentionPolicy.RUNTIME) // conserver les annotations pendant le runtime.
public @interface Modifiee {

    String auteur() default "inconnue";


}
