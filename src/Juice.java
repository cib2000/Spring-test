public class Juice {

    public Source getPsource() {
        return psource;
    }

    public void setPsource(Source psource) {
        this.psource = psource;
    }

    Source psource;
    public void out(){
        System.out.println("result:"+
                psource.fruit+
                psource.sugar+
                psource.size);
    }
}
