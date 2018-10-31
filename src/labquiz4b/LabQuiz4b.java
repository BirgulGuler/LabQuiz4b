/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz4b;

/**
 *
 * @author Mehmet Sait
 */
public class LabQuiz4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dizi={1,2,0,7,9,10,5,6,3,0,2,0,0,2,5,7,8,10,1};
     int[][] adim=new int[10][2]; //dizinin kurala uygun adım sayısı ile başlangıç indexini tutar
     int sayac=0;
     int sira=0;
     int kontrol=0;
     for(int i=0,j=1;i<dizi.length-1;i++,j++)
     { 
         if(dizi[i]<dizi[j]) //dizinin bir sonraki elemnı ile karşılaştırılır
        {
         if (kontrol==0) //kurala uygun dizilim başlıyorsa index değeri tutulur
         {
             sira=i;    
         }
         kontrol++; //adım sayısı hesaplanır
         if(j==dizi.length-1) //dizinin kurala uygun son elemanı için index ve adım sayısı kaydedilir 
         {
         adim[sayac][0]=kontrol+1;
         adim[sayac][1]=sira;
         }
         }
     else { // kurala uygun dizilim biterse
       if(kontrol>0) // 1 den fazla adım sayısı varsa indexi kaydedilir
         {
         adim[sayac][1]=sira;
         }
         else {    // 1 adım sayısına sahipse indexi kaydedilir
         adim[sayac][1]=sira+2;
         }
         adim[sayac][0]=kontrol+1; // adım sayısı kaydedilir
        if(adim[sayac][0]+adim[sayac][1]!=19) //son dizi elemanı kuralı bozarsa
        {
         adim[sayac+1][0]=1;
         adim[sayac+1][1]=18;
        }
         sayac++; // adim dizininde bir sonraki satıra geçmek için
         kontrol=0; // yeni kurala uygun adım sayısı ve indexi alınabisin diye sıfırlanır
     
     
     }     
     }
    
   int enbuyuk=adim[0][0]; //enbüyük adım saısı bulunabilmesi için
   sira=adim[0][1];
       
     for(int j=0;j<adim.length;j++)
     { System.out.println(adim[j][0]+" "+adim[j][1]);
         if (enbuyuk<adim[j][0]) // en büyük adım sayısı adim dizisi içinde aranır
         {
             enbuyuk=adim[j][0];
             sira=adim[j][1];
         }
         
     } 
     System.out.println("Adım sayısı="+enbuyuk); //dizinin en büyük adım sayısı yazılır
     for(int i=0;i<enbuyuk;i++)
     {
         System.out.print(dizi[sira+i]+" "); // kurala uygun dizi elemanları yazılır
     }
    
    }
    
}
