class FrenchBot implements IFrenchAdaptor{
    private EnglishBot englishBot;
    FrenchBot(){
        englishBot = new EnglishBot();
    }

    private String frenchToEnglish(String frenchString){
        // process...
        return "ENGLISH_" + frenchString;
    }

    private String englishToFrench(String englishString){
        // process...
        return "FRENCH_" + englishString;
    }


    @Override
    public String answerInFrench(String frenchQuestion) {
        String englishQuestion = frenchToEnglish(frenchQuestion);
        String englishAnswer = englishBot.answerInEnglish(englishQuestion);
        String frenchAnswer = englishToFrench(englishAnswer);
        return frenchAnswer;
    }


}
