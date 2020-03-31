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
public class EndPointAssay extends EnzymaticActivity {
 //declarations
	    /******************
	     *0 !!!info measuredMetabolite 
	  
	   *2 public String measuredMetabolite;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration measuredMetabolite
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Métabolite dosé", description2=" format: texte", description3=" ex: glucose")
	      public String measuredMetabolite;
  
	    /******************
	     *0 !!!info usedEnzyme 
	  
	   *2 public String usedEnzyme;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration usedEnzyme
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Enzyme utilisée", description2=" format: texte", description3=" ex:")
	      public String usedEnzyme;
  
//getter
 
	    /**
	     * Gets the value of measuredMetabolite
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7fb9f71f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMeasuredMetabolite() {
		return this.measuredMetabolite;
	}
      
 
	    /**
	     * Gets the value of usedEnzyme
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@514eedd8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getUsedEnzyme() {
		return this.usedEnzyme;
	}
      
//setter
   
	    /**
	     * Sets the value of measuredMetabolite
	     */
	public void setMeasuredMetabolite(String measuredMetabolite) {
		this.measuredMetabolite = measuredMetabolite;
	}
      
   
	    /**
	     * Sets the value of usedEnzyme
	     */
	public void setUsedEnzyme(String usedEnzyme) {
		this.usedEnzyme = usedEnzyme;
	}
      
}

