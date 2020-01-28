package gen;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import thewebsemantic.Id;
import thewebsemantic.RdfProperty;
import thewebsemantic.Namespace;
import com.hp.hpl.jena.sparql.vocabulary.FOAF;
import thewebsemantic.binding.Jenabean;
import thewebsemantic.binding.RdfBean;
import javax.management.DescriptorKey;
import uml2rdf.utils.*;
  
	
@Namespace("http://inra/pegase#")
public class Pcr extends GeneralAnalysis {
 //declarations
	    /******************
	     *0 !!!info forwardPrimerName 
	  
	   *2 public String forwardPrimerName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration forwardPrimerName
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom de l'amorce sens", description2=" format: texte", description3=" ex: ME1-F")
	      public String forwardPrimerName;
  
	    /******************
	     *0 !!!info forwardPrimerSequence 
	  
	   *2 public String forwardPrimerSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration forwardPrimerSequence
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Sequence de l'amorce sens", description2=" format: texte, 5'-3'", description3=" ex: TGGTGACTGATGGAGAACGTATTC")
	      public String forwardPrimerSequence;
  
	    /******************
	     *0 !!!info reversePrimerName 
	  
	   *2 public String reversePrimerName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration reversePrimerName
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom de l'amorce antisens", description2=" format: texte", description3=" ex: ME1_R")
	      public String reversePrimerName;
  
	    /******************
	     *0 !!!info reversePrimerSequence 
	  
	   *2 public String reversePrimerSequence;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration reversePrimerSequence
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Sequence de l'amorce antisens", description2=" format: texte, 5'-3'", description3=" ex: CAGGATGACAGGCAGACATTCTT")
	      public String reversePrimerSequence;
  
	    /******************
	     *0 !!!info expectedAmpliconSize  
	   *1 @has unit: bp KISS
	  
	   *2 public Integer expectedAmpliconSize ;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration expectedAmpliconSize 
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: bp */ 
	      @CustomUnit(value="bp" ) 
	 
	      
	      @Info( description=" Taille théorique de l'amplicon", description2=" format: nombre entier, ne pas spécifier d'unité", description3=" ex: 85")
	      public Integer expectedAmpliconSize ;
  
	    /******************
	     *0 !!!info pcrProgram 
	  
	   *2 public String pcrProgram;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration pcrProgram
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Programme PCR", description2=" format: texte", description3=" ex: 2min50;20sec95;(3sec95+30sec60)x40;fusioncurve")
	      public String pcrProgram;
  
	    /******************
	     *0 !!!info targetGeneName 
	  
	   *2 public String targetGeneName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration targetGeneName
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom du gène cible", description2=" format: texte, symbole officiel du gène (HGNC)", description3=" ex: ME1")
	      public String targetGeneName;
  
	    /******************
	     *0 !!!info templateAmount 
	   *1 @has unit : ng
	       min>0 KISS
	  
	   *2 public Integer templateAmount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration templateAmount
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit : ng
	         	    min>0 */ 
	      //@has unit : ng
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Quantité de matrice", description2=" format: nombre décimal, ne pas spécifier d'unité", description3=" ex: 2.5")
	      public Integer templateAmount;
  
//getter
 
	    /**
	     * Gets the value of forwardPrimerName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3aaf4f07 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getForwardPrimerName() {
		return this.forwardPrimerName;
	}
      
 
	    /**
	     * Gets the value of forwardPrimerSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5a2f016d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getForwardPrimerSequence() {
		return this.forwardPrimerSequence;
	}
      
 
	    /**
	     * Gets the value of reversePrimerName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6058e535 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getReversePrimerName() {
		return this.reversePrimerName;
	}
      
 
	    /**
	     * Gets the value of reversePrimerSequence
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3bb9efbc (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getReversePrimerSequence() {
		return this.reversePrimerSequence;
	}
      
 
	    /**
	     * Gets the value of expectedAmpliconSize 
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1bdaa23d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getExpectedAmpliconSize () {
		return this.expectedAmpliconSize ;
	}
      
 
	    /**
	     * Gets the value of pcrProgram
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@50d68830 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPcrProgram() {
		return this.pcrProgram;
	}
      
 
	    /**
	     * Gets the value of targetGeneName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3a7704c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTargetGeneName() {
		return this.targetGeneName;
	}
      
 
	    /**
	     * Gets the value of templateAmount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@a23a01d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTemplateAmount() {
		return this.templateAmount;
	}
      
//setter
   
	    /**
	     * Sets the value of forwardPrimerName
	     */
	public void setForwardPrimerName(String forwardPrimerName) {
		this.forwardPrimerName = forwardPrimerName;
	}
      
   
	    /**
	     * Sets the value of forwardPrimerSequence
	     */
	public void setForwardPrimerSequence(String forwardPrimerSequence) {
		this.forwardPrimerSequence = forwardPrimerSequence;
	}
      
   
	    /**
	     * Sets the value of reversePrimerName
	     */
	public void setReversePrimerName(String reversePrimerName) {
		this.reversePrimerName = reversePrimerName;
	}
      
   
	    /**
	     * Sets the value of reversePrimerSequence
	     */
	public void setReversePrimerSequence(String reversePrimerSequence) {
		this.reversePrimerSequence = reversePrimerSequence;
	}
      
   
	    /**
	     * Sets the value of expectedAmpliconSize 
	     */
	public void setExpectedAmpliconSize (Integer expectedAmpliconSize ) {
		this.expectedAmpliconSize  = expectedAmpliconSize ;
	}
      
   
	    /**
	     * Sets the value of pcrProgram
	     */
	public void setPcrProgram(String pcrProgram) {
		this.pcrProgram = pcrProgram;
	}
      
   
	    /**
	     * Sets the value of targetGeneName
	     */
	public void setTargetGeneName(String targetGeneName) {
		this.targetGeneName = targetGeneName;
	}
      
   
	    /**
	     * Sets the value of templateAmount
	     */
	public void setTemplateAmount(Integer templateAmount) {
		this.templateAmount = templateAmount;
	}
      
}

