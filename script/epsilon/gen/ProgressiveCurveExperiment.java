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
public class ProgressiveCurveExperiment extends EnzymaticActivity {
 //declarations
	    /******************
	     *0 !!!info measuredEnzyme 
	  
	   *2 public String measuredEnzyme;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: String
	   *7 		String
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration measuredEnzyme
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Enzyme dosée", description2=" format: texte", description3=" ex: ....")
	      public String measuredEnzyme;
  
	    /******************
	     *0 !!!info molarExtinctionCoefficient 
	   *1 @min>0 KISS
	  
	   *2 public EFloat molarExtinctionCoefficient;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration molarExtinctionCoefficient
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0 */ 
	      @Size(min = 0 ) 
	 
	      
	      @Info( description=" Coefficient d'extinction molaire", description2=" format: nombre décimal", description3=" ex: 615.0")
	      public Float molarExtinctionCoefficient;
  
//getter
 
	    /**
	     * Gets the value of measuredEnzyme
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@15deb1dc (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
	        
	          nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
	          fragment:String
	      
	     */
	public String getMeasuredEnzyme() {
		return this.measuredEnzyme;
	}
      
 
	    /**
	     * Gets the value of molarExtinctionCoefficient
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3a45c42a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getMolarExtinctionCoefficient() {
		return this.molarExtinctionCoefficient;
	}
      
//setter
   
	    /**
	     * Sets the value of measuredEnzyme
	     */
	public void setMeasuredEnzyme(String measuredEnzyme) {
		this.measuredEnzyme = measuredEnzyme;
	}
      
   
	    /**
	     * Sets the value of molarExtinctionCoefficient
	     */
	public void setMolarExtinctionCoefficient(Float molarExtinctionCoefficient) {
		this.molarExtinctionCoefficient = molarExtinctionCoefficient;
	}
      
}

