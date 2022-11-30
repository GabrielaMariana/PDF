/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crear.pdf;

import com.itextpdf.io.IOException;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.io.FileNotFoundException;


public class CrearPdf {
    public static final String FOTO ="C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\crear pdf\\foto.webp";
    
    public static final String DESTINO = "C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\crear pdf\\ Autobiografia.pdf";
    public static void main(String[] args) throws IOException, FileNotFoundException, java.io.IOException{
        new CrearPdf().crearpdf(DESTINO);
    }
    public void crearpdf(String destino)throws IOException, FileNotFoundException, java.io.IOException{
        PdfWriter w = new PdfWriter(destino);
        PdfDocument pdf = new PdfDocument(w);
        try (Document documento = new Document(pdf)) {
            
            Image foto = new Image(ImageDataFactory.create(FOTO));
            Paragraph p = new Paragraph()
                .add(foto);
            documento.add(new Paragraph("Autobiografia"));
            documento.add(p);
            documento.add(new Paragraph("Me llamo Gabriela Mariana Garcia Saldaña naci el dia 11 de jilio de 2003,"));
            documento.add(new Paragraph("me gustan mucho los dulces, mi comida favorita son las enchiladas"));
            documento.add(new Paragraph("me gusta mucho bailar, escucho todo tipo de musica"));
            documento.add(new Paragraph("me gustan mucho las actividades artisticas y me gusta el futbool"));
            documento.close();
        }
    }
}
