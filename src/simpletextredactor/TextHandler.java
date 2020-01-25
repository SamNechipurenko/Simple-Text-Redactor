package simpletextredactor;

class TextHandler {
    String mText;
    
    TextHandler (String text) {
        mText = text;
    }    
    
    // getting arrey of words 
    @ann.Book(deley = 2210, mName = "Java SE 1st edition", mNumOfPages = 522)
    public void getWordArray (){
        for(String letter : mText.split(";")){
            System.out.println(mText.split(";")[1]);
        }
    }
    
    // counting of symbol entery
    @ann.Article (deley = 1500, mIndex = (float) 5.8, mTextType = "doc")
    public void mCountSymbol() {
        int count = 0;
        for(char letter : mText.toCharArray()){
            if (letter != ';') count++;
        }
        System.out.println("there are " + count + " symbols in the text");
    }
    
    // outputting initial text
    @ann.Journal(mColor = "black", mJournText = "Quantum Physics", mPage = 28)
    public void mInitTextOut(){
        System.out.println(mText);
    }
    
    @ann.Article (deley = 3000, mIndex = (float) 5.8, mTextType = "doc")
    public void mCountSymbolVer2() {
        int count = 0;
        for(char letter : mText.toCharArray()){
            if (letter != ';') count++;
        }
        System.out.println("Version2: there are  " + count + " symbols in the text");
    }
}
