public public class Conditional {
  public void jobOffer() {
    /*
     * John: knowJava = true; yearsOfExperienceInJava = 1; knowPython = false;
     * yearsOfExperienceInPython = 0;
     * 
     * - Mary: knowJava = false; yearsOfExperienceInJava = 0; knowPython = true;
     * yearsOfExperienceInPython = 3;
     * 
     * - Olivia: knowJava = true; yearsOfExperienceInJava = 0; knowPython = true;
     * yearsOfExperienceInPython = 2;
     * 
     * - Alexander: knowJava = true; yearsOfExperienceInJava = 3; knowPython = true;
     * yearsOfExperienceInPython = 2;
     * 
     * - Andrew: knowJava = false; yearsOfExperienceInJava = 1; knowPython = false;
     * yearsOfExperienceInPython = 1;
     * 
     * - Emily: knowJava = false; yearsOfExperienceInJava = 0; knowPython = true;
     * yearsOfExperienceInPython = 2;
     */

    boolean offerAJob = (knowJava && yearsOfExperienceInJava >= 1) ||
        (knowPython && yearsOfExperienceInPython >= 3);

  }
}
