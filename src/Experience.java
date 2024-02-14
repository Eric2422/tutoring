public class Experience {
    public enum ExperienceLevel {
        FIRST_YEAR,
        INTERMEDIATE,
        EXPERIENCED,
        UNDEFINED;

        /**
         * Attempts to convert a String to an ExperienceLevel
         * If it it does not match any ExperienceLevel, default to FIRST_YEAR
         * 
         * @param experienceStr a String that contains an ExperienceLevel
         */
        private static ExperienceLevel toExperienceLevel(String experienceStr) {
            // convert the String to the matching ExperienceLevel and store it
            ExperienceLevel experienceLevel =  ExperienceLevel.valueOf(experienceStr.trim().toUpperCase());

            // Can not be set to undefined
            if (experienceLevel == ExperienceLevel.UNDEFINED) {
                throw new IllegalArgumentException("\""  + experienceStr + "\" is not a valid experience.");
            }

            return experienceLevel;
        }
    }

    private ExperienceLevel experienceLevel;

    public Experience() {
        experienceLevel = ExperienceLevel.UNDEFINED;
    }

    public Experience(String experienceStr) {
        experienceLevel = ExperienceLevel.toExperienceLevel(experienceStr);
    }

    public Experience(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setExperienceLevel(Experience experience) {
        this.experienceLevel = experience.experienceLevel;
    }

    public void setExperienceLevel(String experienceStr) {
        this.experienceLevel = ExperienceLevel.toExperienceLevel(experienceStr);
    }

    @Override
    public String toString() {
        return experience.toString();
    }
}