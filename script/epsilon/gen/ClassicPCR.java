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
public class ClassicPCR extends Pcr {
 //declarations
	    /******************
	     *0 !!!info actualAmpliconSize 
	   *1 @nullable : NA, LD, LQ KISS
	  
	   *2 public EFloat actualAmpliconSize;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration actualAmpliconSize
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @nullable : NA, LD, LQ */ 
	      @Null 
	 
	      
	      @Info( description=" Taille réel de l'amplicon", description2=" format: nombre décimal, ne pas spécifier d'unité", description3=" ex: 1.25 ou NA")
	      public Float actualAmpliconSize;
  
	    /******************
	     *0 !!!info AmpliconSizeUnit 
	   *1 @<Enter constraint text here> KISS
	  
	   *2 public String AmpliconSizeUnit;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration AmpliconSizeUnit
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @<Enter constraint text here> */ 
	       
	 
	      
	      @Info( description=" Unité de mesure de taille de l'amplicon", description2=" format: texte", description3=" ex: kb ou NA")
	      public String ampliconSizeUnit;
  
//getter
 
	    /**
	     * Gets the value of actualAmpliconSize
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2c4ca0f9 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getActualAmpliconSize() {
		return this.actualAmpliconSize;
	}
      
 
	    /**
	     * Gets the value of AmpliconSizeUnit
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2755d705 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getAmpliconSizeUnit() {
		return this.ampliconSizeUnit;
	}
      
//setter
   
	    /**
	     * Sets the value of actualAmpliconSize
	     */
	public void setActualAmpliconSize(Float actualAmpliconSize) {
		this.actualAmpliconSize = actualAmpliconSize;
	}
      
   
	    /**
	     * Sets the value of AmpliconSizeUnit
	     */
	public void setAmpliconSizeUnit(String ampliconSizeUnit) {
		this.ampliconSizeUnit = ampliconSizeUnit;
	}
      
}

