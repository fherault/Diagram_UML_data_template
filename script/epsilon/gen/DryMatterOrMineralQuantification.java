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
public class DryMatterOrMineralQuantification extends Gravimetry {
 //declarations
	    /******************
	     *0 !!!info temperature 
	   *1 @has unit: celsius KISS
	  
	   *2 public EFloat temperature;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration temperature
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: celsius */ 
	      @CustomUnit(value="celsius" ) 
	 
	      
	      @Info( description="Temperature")
	      public Float temperature;
  
	    /******************
	     *0 !!!info time 
	   *1 @has unit: hours KISS
	  
	   *2 public Integer time;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration time
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: hours */ 
	      @CustomUnit(value="hours" ) 
	 
	      
	      @Info( description="Temps")
	      public Integer time;
  
	    /******************
	     *0 !!!info temperatureCycle 
	  
	   *2 public String temperatureCycle;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration temperatureCycle
	   
	     */ 
	   
	       
	 
	      
	      @Info( description="Cycle de temperature")
	      public String temperatureCycle;
  
	    /******************
	     *0 !!!info result 
	   *1 @nullable : NA, LD, LQ
	       min>0 KISS
	  
	   *2 public EFloat result;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration result
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ
	         	    min>0 */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Résultat", description2=" format: nombre décimal ou NA", description3=" 409.935 ou NA")
	      public Float result;
  
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
	     * Gets the value of temperature
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3aa3193a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getTemperature() {
		return this.temperature;
	}
      
 
	    /**
	     * Gets the value of time
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@724bade8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTime() {
		return this.time;
	}
      
 
	    /**
	     * Gets the value of temperatureCycle
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@23a9ba52 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getTemperatureCycle() {
		return this.temperatureCycle;
	}
      
 
	    /**
	     * Gets the value of result
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@67427b69 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult() {
		return this.result;
	}
      
 
	    /**
	     * Gets the value of resultUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@64f857e7 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
	     * Sets the value of temperature
	     */
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
      
   
	    /**
	     * Sets the value of time
	     */
	public void setTime(Integer time) {
		this.time = time;
	}
      
   
	    /**
	     * Sets the value of temperatureCycle
	     */
	public void setTemperatureCycle(String temperatureCycle) {
		this.temperatureCycle = temperatureCycle;
	}
      
   
	    /**
	     * Sets the value of result
	     */
	public void setResult(Float result) {
		this.result = result;
	}
      
   
	    /**
	     * Sets the value of resultUnit
	     */
	public void setResultUnit(String resultUnit) {
		this.resultUnit = resultUnit;
	}
      
}

