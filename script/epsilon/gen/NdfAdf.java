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
public class NdfAdf extends Fibers {
 //declarations
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
	     *0 !!!info ndfResult 
	   *1 @nullable : NA, LD, LQ
	       min>0 KISS
	  
	   *2 public EFloat ndfResult;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration ndfResult
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ
	         	    min>0 */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Résultat NDF", description2=" format: nombre décimal ou NA", description3=" 409.935 ou NA")
	      public Float ndfResult;
  
	    /******************
	     *0 !!!info adfResult 
	   *1 @nullable : NA, LD, LQ
	       min>0 KISS
	  
	   *2 public EFloat adfResult;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration adfResult
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ
	         	    min>0 */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Résultat ADF", description2=" format: nombre décimal ou NA", description3=" 409.935 ou NA")
	      public Float adfResult;
  
	    /******************
	     *0 !!!info adlResult 
	   *1 @nullable : NA, LD, LQ
	       min>0 KISS
	  
	   *2 public EFloat adlResult;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration adlResult
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ
	         	    min>0 */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Résultat ADL", description2=" format: nombre décimal ou NA", description3=" 409.935 ou NA")
	      public Float adlResult;
  
//getter
 
	    /**
	     * Gets the value of resultUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5949eba8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getResultUnit() {
		return this.resultUnit;
	}
      
 
	    /**
	     * Gets the value of ndfResult
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3c291aad (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getNdfResult() {
		return this.ndfResult;
	}
      
 
	    /**
	     * Gets the value of adfResult
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@320e400 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAdfResult() {
		return this.adfResult;
	}
      
 
	    /**
	     * Gets the value of adlResult
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2c444798 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAdlResult() {
		return this.adlResult;
	}
      
//setter
   
	    /**
	     * Sets the value of resultUnit
	     */
	public void setResultUnit(String resultUnit) {
		this.resultUnit = resultUnit;
	}
      
   
	    /**
	     * Sets the value of ndfResult
	     */
	public void setNdfResult(Float ndfResult) {
		this.ndfResult = ndfResult;
	}
      
   
	    /**
	     * Sets the value of adfResult
	     */
	public void setAdfResult(Float adfResult) {
		this.adfResult = adfResult;
	}
      
   
	    /**
	     * Sets the value of adlResult
	     */
	public void setAdlResult(Float adlResult) {
		this.adlResult = adlResult;
	}
      
}

