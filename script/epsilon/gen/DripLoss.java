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
public class DripLoss extends Gravimetry {
 //declarations
	    /******************
	     *0 !!!info waitingTime 
	   *1 @has unit: minutes KISS
	  
	   *2 public Integer waitingTime;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration waitingTime
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: minutes */ 
	       
	 
	      
	      @Info( description="TempsAttente")
	      public Integer waitingTime;
  
	    /******************
	     *0 !!!info temperature 
	   *1 @has unit: celsius KISS
	  
	   *2 public Integer temperature;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration temperature
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @has unit: celsius */ 
	      @CustomUnit(value="celsius" ) 
	 
	      
	      @Info( description="")
	      public Integer temperature;
  
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
  
//getter
 
	    /**
	     * Gets the value of waitingTime
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@9cd25ff (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getWaitingTime() {
		return this.waitingTime;
	}
      
 
	    /**
	     * Gets the value of temperature
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@db44aa2 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTemperature() {
		return this.temperature;
	}
      
 
	    /**
	     * Gets the value of resultUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@61a002b1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getResultUnit() {
		return this.resultUnit;
	}
      
 
	    /**
	     * Gets the value of result
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6f70f32f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResult() {
		return this.result;
	}
      
//setter
   
	    /**
	     * Sets the value of waitingTime
	     */
	public void setWaitingTime(Integer waitingTime) {
		this.waitingTime = waitingTime;
	}
      
   
	    /**
	     * Sets the value of temperature
	     */
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
      
   
	    /**
	     * Sets the value of resultUnit
	     */
	public void setResultUnit(String resultUnit) {
		this.resultUnit = resultUnit;
	}
      
   
	    /**
	     * Sets the value of result
	     */
	public void setResult(Float result) {
		this.result = result;
	}
      
}

