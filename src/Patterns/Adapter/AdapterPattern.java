package Patterns.Adapter;

public class AdapterPattern {
    public static void main(String[] args) {
        VectorGraphicInterface vector = new AdapterRasterToVectorExt();
        vector.drawLine();
        vector.drawSquare();

        VectorGraphicInterface vector2 = new AdapterRasterToVectorComp(new RasterGraphic());
        vector.drawSquare();
        vector.drawLine();
    }

}
interface VectorGraphicInterface{
    void drawLine();
    void drawSquare();
}
class RasterGraphic{
    void drawRasterLine (){
        System.out.println("Рисуем линию");
    }
    void drawRasterSquare (){
        System.out.println("Рисуем квадрат");
    }
}
//Реализация наследованием
class AdapterRasterToVectorExt extends RasterGraphic implements VectorGraphicInterface{

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
//Реализация композицией
class AdapterRasterToVectorComp implements VectorGraphicInterface{
    RasterGraphic rasterGraphic = null;

    public AdapterRasterToVectorComp(RasterGraphic rasterGraphic) {
        this.rasterGraphic = rasterGraphic;
    }

    @Override
    public void drawLine() {

    }

    @Override
    public void drawSquare() {

    }
}