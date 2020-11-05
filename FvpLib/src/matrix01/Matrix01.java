/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix01;

/**
 *
 * @author bowman
 */
public class Matrix01 {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MatrixException {

        Matrix m1 = new Matrix(3, 4);
        m1.setLine(1, new double[] {1,2,3,4});
        m1.setLine(2, new double[] {1,2,3,4});
        m1.setLine(3, new double[] {1,2,3,4});

        m1.dump();
    }
    
}
