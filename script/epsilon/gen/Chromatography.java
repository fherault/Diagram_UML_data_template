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
public class Chromatography extends GeneralAnalysis {
 //declarations
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
	     *0 !!!info resultUnit 
	  
	   *2 public String resultUnit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultUnit
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Unité du résultat", description2=" format: texte", description3=" ex: mg/ml")
	      public String resultUnit;
  
//getter
 
	    /**
	     * Gets the value of samplePortion
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2e5c7f0b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@538613b3 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getSamplePortionUnit() {
		return this.samplePortionUnit;
	}
      
 
	    /**
	     * Gets the value of resultUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5db99216 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getResultUnit() {
		return this.resultUnit;
	}
      
//setter
   
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
	     * Sets the value of resultUnit
	     */
	public void setResultUnit(String resultUnit) {
		this.resultUnit = resultUnit;
	}
      
}

