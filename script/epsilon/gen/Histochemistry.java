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
public class Histochemistry extends Histology {
 //declarations
	    /******************
	     *0 !!!info areaUnit 
	  
	   *2 public String areaUnit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration areaUnit
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Unité de mesure des surfaces", description2=" format: texte", description3=" ex: µm²")
	      public String areaUnit;
  
	    /******************
	     *0 !!!info totalAreaThreshold 
	  
	   *2 public Integer totalAreaThreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration totalAreaThreshold
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Seuil de surface totale", description2=" format: nombre entier, ne pas spécifier d'unité", description3=" ex: 25")
	      public Integer totalAreaThreshold;
  
	    /******************
	     *0 !!!info resultTotalArea 
	  
	   *2 public EFloat resultTotalArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration resultTotalArea
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Surface totale", description2=" format: nombre décimal, ne pas spécifier d'unité", description3=" ex: ...")
	      public Float resultTotalArea;
  
	    /******************
	     *0 !!!info secetoryCellTreshold 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public Integer secetoryCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secetoryCellTreshold
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Seuil cellules sécrétrices", description2="  format: nombre entier, ne pas spécifier d'unité", description3=" ex:... ou NA")
	      public Integer secetoryCellTreshold;
  
	    /******************
	     *0 !!!info secretoryCellArea 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public EFloat secretoryCellArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration secretoryCellArea
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Surface de cellules sécrétrices", description2="  format: nombre décimal, ne pas spécifier d'unité", description3=" ex:... ou NA")
	      public Float secretoryCellArea;
  
	    /******************
	     *0 !!!info adiposeCellTreshold 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public Integer adiposeCellTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration adiposeCellTreshold
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Seuil cellules adipeuses", description2="  format: nombre entier, ne pas spécifier d'unité", description3=" ex:... ou NA")
	      public Integer adiposeCellTreshold;
  
	    /******************
	     *0 !!!info adiposeCellArea 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public EFloat adiposeCellArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration adiposeCellArea
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Surface de cellules adipeuses", description2="  format: nombre décimal, ne pas spécifier d'unité", description3=" ex:... ou NA")
	      public Float adiposeCellArea;
  
	    /******************
	     *0 !!!info channelTreshold 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public Integer channelTreshold;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: Integer
	   *7 		int
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration channelTreshold
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Seuil canaux", description2="  format: nombre entier, ne pas spécifier d'unité", description3=" ex:... ou NA")
	      public Integer channelTreshold;
  
	    /******************
	     *0 !!!info channelArea 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public EFloat channelArea;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration channelArea
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Surface de canaux", description2="  format: nombre décimal, ne pas spécifier d'unité", description3=" ex:... ou NA")
	      public Float channelArea;
  
//getter
 
	    /**
	     * Gets the value of areaUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@f713686 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getAreaUnit() {
		return this.areaUnit;
	}
      
 
	    /**
	     * Gets the value of totalAreaThreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5ca17ab0 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getTotalAreaThreshold() {
		return this.totalAreaThreshold;
	}
      
 
	    /**
	     * Gets the value of resultTotalArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@35293c05 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getResultTotalArea() {
		return this.resultTotalArea;
	}
      
 
	    /**
	     * Gets the value of secetoryCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4d411036 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getSecetoryCellTreshold() {
		return this.secetoryCellTreshold;
	}
      
 
	    /**
	     * Gets the value of secretoryCellArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@13006998 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getSecretoryCellArea() {
		return this.secretoryCellArea;
	}
      
 
	    /**
	     * Gets the value of adiposeCellTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6d6bc158 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getAdiposeCellTreshold() {
		return this.adiposeCellTreshold;
	}
      
 
	    /**
	     * Gets the value of adiposeCellArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@677dbd89 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAdiposeCellArea() {
		return this.adiposeCellArea;
	}
      
 
	    /**
	     * Gets the value of channelTreshold
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2ca47471 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:Integer
	      
	     */
	public Integer getChannelTreshold() {
		return this.channelTreshold;
	}
      
 
	    /**
	     * Gets the value of channelArea
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@b93aad (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getChannelArea() {
		return this.channelArea;
	}
      
//setter
   
	    /**
	     * Sets the value of areaUnit
	     */
	public void setAreaUnit(String areaUnit) {
		this.areaUnit = areaUnit;
	}
      
   
	    /**
	     * Sets the value of totalAreaThreshold
	     */
	public void setTotalAreaThreshold(Integer totalAreaThreshold) {
		this.totalAreaThreshold = totalAreaThreshold;
	}
      
   
	    /**
	     * Sets the value of resultTotalArea
	     */
	public void setResultTotalArea(Float resultTotalArea) {
		this.resultTotalArea = resultTotalArea;
	}
      
   
	    /**
	     * Sets the value of secetoryCellTreshold
	     */
	public void setSecetoryCellTreshold(Integer secetoryCellTreshold) {
		this.secetoryCellTreshold = secetoryCellTreshold;
	}
      
   
	    /**
	     * Sets the value of secretoryCellArea
	     */
	public void setSecretoryCellArea(Float secretoryCellArea) {
		this.secretoryCellArea = secretoryCellArea;
	}
      
   
	    /**
	     * Sets the value of adiposeCellTreshold
	     */
	public void setAdiposeCellTreshold(Integer adiposeCellTreshold) {
		this.adiposeCellTreshold = adiposeCellTreshold;
	}
      
   
	    /**
	     * Sets the value of adiposeCellArea
	     */
	public void setAdiposeCellArea(Float adiposeCellArea) {
		this.adiposeCellArea = adiposeCellArea;
	}
      
   
	    /**
	     * Sets the value of channelTreshold
	     */
	public void setChannelTreshold(Integer channelTreshold) {
		this.channelTreshold = channelTreshold;
	}
      
   
	    /**
	     * Sets the value of channelArea
	     */
	public void setChannelArea(Float channelArea) {
		this.channelArea = channelArea;
	}
      
}

