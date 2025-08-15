public class PrinterClass {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public PrinterClass(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        this.tonerLevel = ((tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1);
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){

        tonerLevel = (tonerAmount < 0 ? tonerLevel : ((tonerLevel + tonerAmount) > 100 ? 100 : (tonerAmount + tonerLevel)));
        return tonerLevel;


    }

    public int printPages(int pages){
        int pagesToPrint = 0;
        if(duplex){
            if(pages % 2 == 0){
                pagesToPrint = (pages / 2);
            }else{
                pagesToPrint = (pages / 2) + 1;
            }
        }else{
            pagesToPrint = pages;
        }

        pagesPrinted += pagesToPrint;

        System.out.printf("We printed a total of %d pages...", pagesToPrint);

        return pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
