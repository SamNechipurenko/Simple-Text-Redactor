package simpletextredactor;

class TextHandler {
    String mText;
    
    TextHandler (String text) {
        mText = text;
    }    
    
    // getting arrey of words 
    @ann.Book(deley = 2210, mName = "Java SE 1st edition", mNumOfPages = 522)
    public void getWordArray (){
        System.out.println("Method getWordArray() with the annotation "
                + "ann.Book and deley 2210 is running");
    }
    
    // counting of symbol entery
    @ann.Article (deley = 1500, mIndex = (float) 5.8, mTextType = "doc")
    public void mCountSymbol() {
        System.out.println("Method mCountSymbol() with the annotation "
                + "ann.Article and deley 1500 is running");
    }
    
    // outputting initial text
    @ann.Journal(mColor = "black", mJournText = "Quantum Physics", mPage = 28)
    public void mInitTextOut(){
        System.out.println(mText);
    }
    
    @ann.Article (deley = 3000, mIndex = (float) 5.8, mTextType = "doc")
    public void mCountSymbolVersion2() {
        System.out.println("Method mCountSymbolVersion2() with the annotation "
                + "ann.Article and deley 1500 is running");
    }
}
