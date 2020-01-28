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
public class Immunohistochemistry extends Histology {
 //declarations
	    /******************
	     *0 !!!info primaryAntibodyName 
	  
	   *2 public String primaryAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration primaryAntibodyName
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom de l’anticorps primaire ou de l'enzyme", description2=" format: texte  nom de l'anticorps ou de l'enzyme", description3=" ex: RTDT")
	      public String primaryAntibodyName;
  
	    /******************
	     *0 !!!info primaryAntibodyReference 
	  
	   *2 public String primaryAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration primaryAntibodyReference
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Fournisseur et référence de l'anticorps primaire", description2=" format: texte", description3=" ex: ...")
	      public String primaryAntibodyReference;
  
	    /******************
	     *0 !!!info primaryAntibodyDilutionFactor 
	  
	   *2 public EFloat primaryAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration primaryAntibodyDilutionFactor
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Facteur de dilution de l'anticorps primaire", description2=" format: nombre décimal", description3=" ex: 0.5")
	      public Float primaryAntibodyDilutionFactor;
  
	    /******************
	     *0 !!!info secondaryAntibodyName 
	  
	   *2 public String secondaryAntibodyName;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyName
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nom de l’anticorps secondaire", description2=" format: texte", description3=" ex: ...")
	      public String secondaryAntibodyName;
  
	    /******************
	     *0 !!!info secondaryAntibodyReference 
	  
	   *2 public String secondaryAntibodyReference;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyReference
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Fournisseur et référence de l'anticorps secondaire", description2=" format: texte", description3=" ex: ...")
	      public String secondaryAntibodyReference;
  
	    /******************
	     *0 !!!info secondaryAntibodyDilutionFactor 
	  
	   *2 public Integer secondaryAntibodyDilutionFactor;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyDilutionFactor
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Facteur de dilution de l'anticorps secondaire", description2=" format: nombre décimal", description3=" ex: 2.5")
	      public Integer secondaryAntibodyDilutionFactor;
  
	    /******************
	     *0 !!!info dapiExposureTime 
	   *1 @has unit: ms KISS
	  
	   *2 public String dapiExposureTime;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration dapiExposureTime
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: ms */ 
	      @CustomUnit(value="ms" ) 
	 
	      
	      @Info( description=" Temps d'exposition du DAPI", description2=" format: float", description3=" ex: 150")
	      public String dapiExposureTime;
  
	    /******************
	     *0 !!!info secondaryAntibodyExposureTime 
	   *1 @has unit: ms KISS
	  
	   *2 public String secondaryAntibodyExposureTime;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secondaryAntibodyExposureTime
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: ms */ 
	      @CustomUnit(value="ms" ) 
	 
	      
	      @Info( description=" Temps d'exposition de l'anticorps secondaire", description2=" format: nombre décimal", description3=" ex: 50")
	      public String secondaryAntibodyExposureTime;
  
	    /******************
	     *0 !!!info totalNuclearCellTreshold 
	  
	   *2 public Integer totalNuclearCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration totalNuclearCellTreshold
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Seuil de comptage de cellules nuclées", description2=" format: nombre entier", description3=" ex: 5")
	      public Integer totalNuclearCellTreshold;
  
	    /******************
	     *0 !!!info resultTotalNuclearCellCount 
	  
	   *2 public Integer resultTotalNuclearCellCount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultTotalNuclearCellCount
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Nombre total de cellules nucléés", description2=" format: nombre entier", description3=" ex: 1571")
	      public Integer resultTotalNuclearCellCount;
  
	    /******************
	     *0 !!!info labelledCellTreshold 
	  
	   *2 public Integer labelledCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration labelledCellTreshold
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Seuil pour les cellules marquées", description2=" format: nombre entier, 0 si visuel", description3=" ex 10")
	      public Integer labelledCellTreshold;
  
	    /******************
	     *0 !!!info particleDiameterRange 
	  
	   *2 public String particleDiameterRange;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration particleDiameterRange
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Gamme de diamètre de mesure des particules", description2=" format: texte", description3=" ex: C:0.3-1 ; pixel : 200-1200")
	      public String particleDiameterRange;
  
	    /******************
	     *0 !!!info labelledNuclearCellCount 
	  
	   *2 public Integer labelledNuclearCellCount;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration labelledNuclearCellCount
	   
	     */ 
	   
	       
	 
	      
	      @Info( description="  Nombre de cellules marquées comptées", description2=" format: nombre entier", description3=" ex: 34")
	      public Integer labelledNuclearCellCount;
  
//getter
 
	    /**
	     * Gets the value of primaryAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@52eacb4b (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPrimaryAntibodyName() {
		return this.primaryAntibodyName;
	}
      
 
	    /**
	     * Gets the value of primaryAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1a6f5124 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getPrimaryAntibodyReference() {
		return this.primaryAntibodyReference;
	}
      
 
	    /**
	     * Gets the value of primaryAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@cc62a3b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getPrimaryAntibodyDilutionFactor() {
		return this.primaryAntibodyDilutionFactor;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyName
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@32f61a31 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondaryAntibodyName() {
		return this.secondaryAntibodyName;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyReference
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5305c37d (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondaryAntibodyReference() {
		return this.secondaryAntibodyReference;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyDilutionFactor
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@49a64d82 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSecondaryAntibodyDilutionFactor() {
		return this.secondaryAntibodyDilutionFactor;
	}
      
 
	    /**
	     * Gets the value of dapiExposureTime
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4d9d1b69 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getDapiExposureTime() {
		return this.dapiExposureTime;
	}
      
 
	    /**
	     * Gets the value of secondaryAntibodyExposureTime
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@52d10fb8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSecondaryAntibodyExposureTime() {
		return this.secondaryAntibodyExposureTime;
	}
      
 
	    /**
	     * Gets the value of totalNuclearCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@781e7326 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTotalNuclearCellTreshold() {
		return this.totalNuclearCellTreshold;
	}
      
 
	    /**
	     * Gets the value of resultTotalNuclearCellCount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@39c11e6c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getResultTotalNuclearCellCount() {
		return this.resultTotalNuclearCellCount;
	}
      
 
	    /**
	     * Gets the value of labelledCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@72bca894 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getLabelledCellTreshold() {
		return this.labelledCellTreshold;
	}
      
 
	    /**
	     * Gets the value of particleDiameterRange
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2575f671 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getParticleDiameterRange() {
		return this.particleDiameterRange;
	}
      
 
	    /**
	     * Gets the value of labelledNuclearCellCount
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2d35442b (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getLabelledNuclearCellCount() {
		return this.labelledNuclearCellCount;
	}
      
//setter
   
	    /**
	     * Sets the value of primaryAntibodyName
	     */
	public void setPrimaryAntibodyName(String primaryAntibodyName) {
		this.primaryAntibodyName = primaryAntibodyName;
	}
      
   
	    /**
	     * Sets the value of primaryAntibodyReference
	     */
	public void setPrimaryAntibodyReference(String primaryAntibodyReference) {
		this.primaryAntibodyReference = primaryAntibodyReference;
	}
      
   
	    /**
	     * Sets the value of primaryAntibodyDilutionFactor
	     */
	public void setPrimaryAntibodyDilutionFactor(Float primaryAntibodyDilutionFactor) {
		this.primaryAntibodyDilutionFactor = primaryAntibodyDilutionFactor;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyName
	     */
	public void setSecondaryAntibodyName(String secondaryAntibodyName) {
		this.secondaryAntibodyName = secondaryAntibodyName;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyReference
	     */
	public void setSecondaryAntibodyReference(String secondaryAntibodyReference) {
		this.secondaryAntibodyReference = secondaryAntibodyReference;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyDilutionFactor
	     */
	public void setSecondaryAntibodyDilutionFactor(Integer secondaryAntibodyDilutionFactor) {
		this.secondaryAntibodyDilutionFactor = secondaryAntibodyDilutionFactor;
	}
      
   
	    /**
	     * Sets the value of dapiExposureTime
	     */
	public void setDapiExposureTime(String dapiExposureTime) {
		this.dapiExposureTime = dapiExposureTime;
	}
      
   
	    /**
	     * Sets the value of secondaryAntibodyExposureTime
	     */
	public void setSecondaryAntibodyExposureTime(String secondaryAntibodyExposureTime) {
		this.secondaryAntibodyExposureTime = secondaryAntibodyExposureTime;
	}
      
   
	    /**
	     * Sets the value of totalNuclearCellTreshold
	     */
	public void setTotalNuclearCellTreshold(Integer totalNuclearCellTreshold) {
		this.totalNuclearCellTreshold = totalNuclearCellTreshold;
	}
      
   
	    /**
	     * Sets the value of resultTotalNuclearCellCount
	     */
	public void setResultTotalNuclearCellCount(Integer resultTotalNuclearCellCount) {
		this.resultTotalNuclearCellCount = resultTotalNuclearCellCount;
	}
      
   
	    /**
	     * Sets the value of labelledCellTreshold
	     */
	public void setLabelledCellTreshold(Integer labelledCellTreshold) {
		this.labelledCellTreshold = labelledCellTreshold;
	}
      
   
	    /**
	     * Sets the value of particleDiameterRange
	     */
	public void setParticleDiameterRange(String particleDiameterRange) {
		this.particleDiameterRange = particleDiameterRange;
	}
      
   
	    /**
	     * Sets the value of labelledNuclearCellCount
	     */
	public void setLabelledNuclearCellCount(Integer labelledNuclearCellCount) {
		this.labelledNuclearCellCount = labelledNuclearCellCount;
	}
      
}

