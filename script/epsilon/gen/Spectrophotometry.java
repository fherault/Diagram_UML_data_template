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
public class Spectrophotometry extends GeneralAnalysis {
 //declarations
	    /******************
	     *0 !!!info wavelength 
	   *1 @has unit: nm
	       min>0 KISS
	  
	   *2 public Integer wavelength;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration wavelength
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: nm
	         	    min>0 */ 
	      @CustomUnit(value="nm" )
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Longueur d'onde", description2=" format: nombre entier, ne pas spécifier d'unité", description3=" ex: 340")
	      public Integer wavelength;
  
	    /******************
	     *0 !!!info linearityRange 
	  
	   *2 public String linearityRange;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration linearityRange
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Gamme de linéarité de la méthode", description2=" format: alphanumérique XXXX-XXXX,  ne pas spécifier d'unité", description3=" ex: 0-3400")
	      public String linearityRange;
  
	    /******************
	     *0 !!!info linearityRangeUnit 
	  
	   *2 public String linearityRangeUnit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration linearityRangeUnit
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Gamme de linéarité de la méthode", description2=" format: texte", description3=" ex: mg/ml")
	      public String linearityRangeUnit;
  
	    /******************
	     *0 !!!info determinationCoefficientR2 
	   *1 @min>0 KISS
	  
	   *2 public EFloat determinationCoefficientR2;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration determinationCoefficientR2
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0 */ 
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Coefficient de détermination (R2)", description2=" format: nombre décimal", description3=" ex: 0.98")
	      public Float determinationCoefficientR2;
  
	    /******************
	     *0 !!!info slopeRegressionLine  
	  
	   *2 public EFloat slopeRegressionLine ;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration slopeRegressionLine 
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Pente de la droite de régression", description2=" format: nombre décimal", description3=" ex: 0.0005")
	      public Float slopeRegressionLine ;
  
	    /******************
	     *0 !!!info samplePortion 
	   *1 @min>0 KISS
	  
	   *2 public EFloat samplePortion;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration samplePortion
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0 */ 
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Prise d'essai", description2=" format: nombre décimal, ne pas spécifier d'unité", description3=" ex: 2.0")
	      public Float samplePortion;
  
	    /******************
	     *0 !!!info samplePortionUnit 
	  
	   *2 public String samplePortionUnit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration samplePortionUnit
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Unité de mesure de la prise d’essai", description2=" format: texte", description3=" ex: mg")
	      public String samplePortionUnit;
  
	    /******************
	     *0 !!!info sampledDilution 
	   *1 @min>0 KISS
	  
	   *2 public Integer sampledDilution;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration sampledDilution
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0 */ 
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Facteur de dilution de l'échantillon", description2=" format: nombre entier", description3=" ex: 10")
	      public Integer sampledDilution;
  
	    /******************
	     *0 !!!info OpticalDensity 
	   *1 @nullable : NA, LD, LQ KISS
	   *1 @min>0 KISS
	  
	   *2 public EFloat OpticalDensity;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration OpticalDensity
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0 */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Valeur de la densité optique mesurée", description2=" format: nombre décimal ou NA", description3=" ex: 0.335 ou NA")
	      public Float opticalDensity;
  
//getter
 
	    /**
	     * Gets the value of wavelength
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4102b1b1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getWavelength() {
		return this.wavelength;
	}
      
 
	    /**
	     * Gets the value of linearityRange
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5b69fd74 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLinearityRange() {
		return this.linearityRange;
	}
      
 
	    /**
	     * Gets the value of linearityRangeUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@77b325b3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getLinearityRangeUnit() {
		return this.linearityRangeUnit;
	}
      
 
	    /**
	     * Gets the value of determinationCoefficientR2
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@271f18d3 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getDeterminationCoefficientR2() {
		return this.determinationCoefficientR2;
	}
      
 
	    /**
	     * Gets the value of slopeRegressionLine 
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@51abf713 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSlopeRegressionLine () {
		return this.slopeRegressionLine ;
	}
      
 
	    /**
	     * Gets the value of samplePortion
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3fc08eec (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSamplePortion() {
		return this.samplePortion;
	}
      
 
	    /**
	     * Gets the value of samplePortionUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@25243bc1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSamplePortionUnit() {
		return this.samplePortionUnit;
	}
      
 
	    /**
	     * Gets the value of sampledDilution
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@467f77a5 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSampledDilution() {
		return this.sampledDilution;
	}
      
 
	    /**
	     * Gets the value of OpticalDensity
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@308a6984 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getOpticalDensity() {
		return this.opticalDensity;
	}
      
//setter
   
	    /**
	     * Sets the value of wavelength
	     */
	public void setWavelength(Integer wavelength) {
		this.wavelength = wavelength;
	}
      
   
	    /**
	     * Sets the value of linearityRange
	     */
	public void setLinearityRange(String linearityRange) {
		this.linearityRange = linearityRange;
	}
      
   
	    /**
	     * Sets the value of linearityRangeUnit
	     */
	public void setLinearityRangeUnit(String linearityRangeUnit) {
		this.linearityRangeUnit = linearityRangeUnit;
	}
      
   
	    /**
	     * Sets the value of determinationCoefficientR2
	     */
	public void setDeterminationCoefficientR2(Float determinationCoefficientR2) {
		this.determinationCoefficientR2 = determinationCoefficientR2;
	}
      
   
	    /**
	     * Sets the value of slopeRegressionLine 
	     */
	public void setSlopeRegressionLine (Float slopeRegressionLine ) {
		this.slopeRegressionLine  = slopeRegressionLine ;
	}
      
   
	    /**
	     * Sets the value of samplePortion
	     */
	public void setSamplePortion(Float samplePortion) {
		this.samplePortion = samplePortion;
	}
      
   
	    /**
	     * Sets the value of samplePortionUnit
	     */
	public void setSamplePortionUnit(String samplePortionUnit) {
		this.samplePortionUnit = samplePortionUnit;
	}
      
   
	    /**
	     * Sets the value of sampledDilution
	     */
	public void setSampledDilution(Integer sampledDilution) {
		this.sampledDilution = sampledDilution;
	}
      
   
	    /**
	     * Sets the value of OpticalDensity
	     */
	public void setOpticalDensity(Float opticalDensity) {
		this.opticalDensity = opticalDensity;
	}
      
}

