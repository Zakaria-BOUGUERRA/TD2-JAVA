/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2.java;

public class Article
{
    private int reference;
    private string designation;
    private double prix;
        public Article()
            {  super();
        }
        public Article(int reference)
            {  this();
               setReference(reference);
            }
        public Article (int reference,String designation)
            {  this reference;
               set String designation;
            }
        public Article (int reference, String designation,double prix)
            {  this (reference,designation);
               set prix = prix;
            }
        public int getReference ()
            {   return reference;
            }
        public void setReference (int reference)
            {    this reference = reference
            }
        public String toString()
            {
            return getReference()+""+getDesignation()+""+getPrix();
            }

}
