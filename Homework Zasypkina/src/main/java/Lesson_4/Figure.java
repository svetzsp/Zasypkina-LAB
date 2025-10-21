package Lesson_4;

public abstract class Figure implements IFigure {
    //Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
    //
    //Задать для каждой фигуры цвет заливки и цвет границы.
    protected String colorBackground;
    protected String colorLine;
    public Figure(String colorBackground, String colorLine) {
        this.colorBackground = colorBackground;
        this.colorLine = colorLine;
    }
    //public abstract void perimeter();
   // public abstract void area();

}
