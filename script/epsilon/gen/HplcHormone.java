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
public class HplcHormone extends Chromatography {
 //declarations
	    /******************
	     *0 !!!info samplePreparationDate 
	  
	   *2 public EDate samplePreparationDate;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EDate
	   *7 		date
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration samplePreparationDate
	   
	     */ 
	   
	       
	 
	      
	      @Info( description=" Date de préparation de l'échantillon", description2="  format: jj/mm/aaa", description3=" ex: 12/06/2019")
	      public Date samplePreparationDate;
  
	    /******************
	     *0 !!!info Androstenone 
	   *1 @min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Androstenone;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Androstenone
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0
	         	    nullable: NA, LD, LQ */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description="", description2=" format: nombre décimal ou NA", description3=" 409.935 ou NA")
	      public Float androstenone;
  
	    /******************
	     *0 !!!info Scatol 
	   *1 @min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Scatol;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Scatol
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0
	         	    nullable: NA, LD, LQ */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description="", description2=" format: nombre décimal ou NA", description3=" 409.935 ou NA")
	      public Float scatol;
  
	    /******************
	     *0 !!!info Indole 
	   *1 @min>0
	       nullable: NA, LD, LQ KISS
	  
	   *2 public EFloat Indole;
	   *3 type.name : 
	   *4 type.name(proxyURL) : pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat 
	   *5 type.class : class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	   *6 myType: EFloat
	   *7 		float
	  	 **
	    
	   *****************/
	
	    /**
	     * declaration Indole
	   
	     */ 
	   
	       /* === org.eclipse.uml2.uml.internal.impl.PropertyImpl*/
	       /*	   @min>0
	         	    nullable: NA, LD, LQ */ 
	      @Null
	      @Size(min = 0 ) 
	 
	      
	      @Info( description="", description2=" format: nombre décimal ou NA", description3=" 409.935 ou NA")
	      public Float indole;
  
//getter
 
	    /**
	     * Gets the value of samplePreparationDate
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5bd73d1a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EDate
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EDate
	      
	     */
	public Date getSamplePreparationDate() {
		return this.samplePreparationDate;
	}
      
 
	    /**
	     * Gets the value of Androstenone
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@120f38e6 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getAndrostenone() {
		return this.androstenone;
	}
      
 
	    /**
	     * Gets the value of Scatol
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7c18432b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getScatol() {
		return this.scatol;
	}
      
 
	    /**
	     * Gets the value of Indole
	     
	     class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
	      classS:PrimitiveTypeImpl
	      typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5a4bef8 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
	      typeName:
	      
	        eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
	        
	          nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
	          fragment:EFloat
	      
	     */
	public Float getIndole() {
		return this.indole;
	}
      
//setter
   
	    /**
	     * Sets the value of samplePreparationDate
	     */
	public void setSamplePreparationDate(Date samplePreparationDate) {
		this.samplePreparationDate = samplePreparationDate;
	}
      
   
	    /**
	     * Sets the value of Androstenone
	     */
	public void setAndrostenone(Float androstenone) {
		this.androstenone = androstenone;
	}
      
   
	    /**
	     * Sets the value of Scatol
	     */
	public void setScatol(Float scatol) {
		this.scatol = scatol;
	}
      
   
	    /**
	     * Sets the value of Indole
	     */
	public void setIndole(Float indole) {
		this.indole = indole;
	}
      
}

