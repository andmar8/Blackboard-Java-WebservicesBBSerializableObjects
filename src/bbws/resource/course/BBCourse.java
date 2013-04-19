/*
    Blackboard WebServices Serializable Objects
    Copyright (C) 2011-2013 Andrew Martin, Newcastle University

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package bbws.resource.course;

//bbws
import bbws.entity.enums.verbosity.BBCourseVerbosity;

//javax
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BBCourse extends AbstractBBCourse
{
    protected BBCourseVerbosity verbosity;
    //standard details
    protected String courseBbId;
    protected String title;
    protected String description;
    protected String modifiedDate;
    //extended details
    protected String absoluteLimit;
    protected Boolean allowGuests;
    protected Boolean allowObservers;
    protected String bannerImageFile;
    protected String batchUId;
    protected String buttonStyle;
    protected String cartridgeDescription;
    protected String classification;
    protected String durationType;
    protected String endDate;
    protected String enrollment;
    protected String institution;
    protected Boolean localeEnforced;
    protected Boolean lockedOut;
    protected Boolean navigationCollapsible;
    protected String locale;
    protected String navigationBackgroundColour;
    protected String navigationForegroundColour;
    protected String navigationStyle;
    protected Integer numberOfDaysOfUse;
    protected String paceType;
    protected String serviceLevelType;
    protected String softLimit;
    protected String startDate;
    protected String uploadLimit;

    public BBCourse(){}
//    public BBCourse(BBCourseVerbosity verbosity)
//    {
//        this.verbosity = verbosity;
//    }
//    public BBCourse(Course course, BBCourseVerbosity verbosity) throws Exception
//    {
//        this.verbosity = verbosity;
//
//        switch(verbosity)
//        {
//            case extended:
//                this.absoluteLimit = Long.toString(course.getAbsoluteLimit());
//                this.allowGuests = course.getAllowGuests();
//                this.allowObservers = course.getAllowObservers();
//                try{this.bannerImageFile = course.getBannerImageFile().getPath();}catch(Exception e){this.bannerImageFile = "";}
//                this.batchUId = course.getBatchUid();
//                try{this.buttonStyle = course.getButtonStyle().getDescription();}catch(Exception e){this.buttonStyle = "";}
//                try{this.cartridgeDescription = course.getCartridge().getDescription();}catch(Exception e){this.cartridgeDescription = "";}
//                try{this.classification = course.getClassification().getTitle();}catch(Exception e){this.classification = "";}
//                this.durationType = course.getDurationType().toFieldName();
//                this.endDate = getDateTimeFromCalendar(course.getEndDate());
//                this.enrollment = course.getEnrollmentType().toFieldName();
//                this.institution = course.getInstitutionName();
//                this.localeEnforced = course.getIsLocaleEnforced();
//                this.lockedOut = course.getIsLockedOut();
//                this.navigationCollapsible = course.getIsNavCollapsible();
//                this.locale = course.getLocale();
//                this.navigationBackgroundColour = course.getNavColorBg();
//                this.navigationForegroundColour = course.getNavColorFg();
//                this.navigationStyle = course.getNavStyle().toFieldName();
//                this.numberOfDaysOfUse = course.getNumDaysOfUse();
//                this.paceType = course.getPaceType().toFieldName();
//                this.serviceLevelType = course.getServiceLevelType().toFieldName();
//                this.softLimit = Long.toString(course.getSoftLimit());
//                this.startDate = getDateTimeFromCalendar(course.getStartDate());
//                this.uploadLimit = Long.toString(course.getUploadLimit());
//            case standard:
//                this.courseBbId = course.getId().toExternalString();
//                this.title = course.getTitle();
//                this.description = course.getDescription();
//                this.creationDate = getDateTimeFromCalendar(course.getCreatedDate());
//                this.modifiedDate = getDateTimeFromCalendar(course.getModifiedDate());
//                this.available = course.getIsAvailable();
//            case minimal:
//                this.courseId = course.getCourseId();
//            return;
//            default: throw new Exception("Undefined verbosity of course");
//        }
//    }
//    public BBCourse(BBCourseVerbosity verbosity,String courseBbId,String title,String description,
//                    String modifiedDate,String absoluteLimit,Boolean allowGuests,Boolean allowObservers,
//                    String bannerImageFile,String batchUId,String buttonStyle,String cartridgeDescription,
//                    String classification,String durationType,String endDate,String enrollment,String institution,
//                    Boolean localeEnforced,Boolean lockedOut,Boolean navigationCollapsible,String locale,
//                    String navigationBackgroundColour,String navigationForegroundColour,String navigationStyle,
//                    Integer numberOfDaysOfUse,String paceType,String serviceLevelType,String softLimit,
//                    String startDate,String uploadLimit)
//    {
//        this.verbosity = verbosity;
//        this.courseBbId = courseBbId;
//        this.title = title;
//        this.description = description;
//        this.modifiedDate = modifiedDate;
//        this.absoluteLimit = absoluteLimit;
//        this.allowGuests = allowGuests;
//        this.allowObservers = allowObservers;
//        this.bannerImageFile = bannerImageFile;
//        this.batchUId = batchUId;
//        this.buttonStyle = buttonStyle;
//        this.cartridgeDescription = cartridgeDescription;
//        this.classification = classification;
//        this.durationType = durationType;
//        this.endDate = endDate;
//        this.enrollment = enrollment;
//        this.institution = institution;
//        this.localeEnforced = localeEnforced;
//        this.lockedOut = lockedOut;
//        this.navigationCollapsible = navigationCollapsible;
//        this.locale = locale;
//        this.navigationBackgroundColour = navigationBackgroundColour;
//        this.navigationForegroundColour = navigationForegroundColour;
//        this.navigationStyle = navigationStyle;
//        this.numberOfDaysOfUse = numberOfDaysOfUse;
//        this.paceType = paceType;
//        this.serviceLevelType = serviceLevelType;
//        this.softLimit = softLimit;
//        this.startDate = startDate;
//        this.uploadLimit = uploadLimit;
//    }

    public String getCourseBbId()
    {
	return this.courseBbId;
    }

    public void setCourseBbId(String courseBbId)
    {
	this.courseBbId = courseBbId;
    }

    public String getTitle()
    {
	return this.title;
    }

    public void setTitle(String title)
    {
	this.title = title;
    }

    public String getDescription()
    {
	return this.description;
    }

    public void setDescription(String description)
    {
	this.description = description;
    }

    public String getModifiedDate()
    {
	return this.modifiedDate;
    }

    public void setModifiedDate(String modifiedDate)
    {
	this.modifiedDate = modifiedDate;
    }

    public String getAbsoluteLimit()
    {
	return this.absoluteLimit;
    }

    public void setAbsoluteLimit(String absoluteLimit)
    {
	this.absoluteLimit = absoluteLimit;
    }

    public Boolean getAllowGuests()
    {
	return this.allowGuests;
    }

    public void setAllowGuests(Boolean allowGuests)
    {
	this.allowGuests = allowGuests;
    }

    public Boolean getAllowObservers()
    {
	return this.allowObservers;
    }

    public void setAllowObservers(Boolean allowObservers)
    {
	this.allowObservers = allowObservers;
    }

    public String getBannerImageFile()
    {
	return this.bannerImageFile;
    }

    public void setBannerImageFile(String bannerImageFile)
    {
	this.bannerImageFile = bannerImageFile;
    }
    public String getBatchUId()
    {
	return this.batchUId;
    }

    public void setBatchUId(String batchUId)
    {
	this.batchUId = batchUId;
    }
    public String getButtonStyle()
    {
	return this.buttonStyle;
    }

    public void setButtonStyle(String buttonStyle)
    {
	this.buttonStyle = buttonStyle;
    }
    public String getCartridgeDescription()
    {
	return this.cartridgeDescription;
    }

    public void setCartridgeDescription(String cartridgeDescription)
    {
	this.cartridgeDescription = cartridgeDescription;
    }
    public String getClassification()
    {
	return this.classification;
    }

    public void setClassification(String classification)
    {
	this.classification = classification;
    }
    public String getDurationType()
    {
	return this.durationType;
    }

    public void setDurationType(String durationType)
    {
	this.durationType = durationType;
    }
    public String getEndDate()
    {
	return this.endDate;
    }

    public void setEndDate(String endDate)
    {
	this.endDate = endDate;
    }
    public String getEnrollment()
    {
	return this.enrollment;
    }

    public void setEnrollment(String enrollment)
    {
	this.enrollment = enrollment;
    }
    public String getInstitution()
    {
	return this.institution;
    }

    public void setInstitution(String institution)
    {
	this.institution = institution;
    }

    public Boolean getLocaleEnforced()
    {
	return this.localeEnforced;
    }

    public void setLocaleEnforced(Boolean localeEnforced)
    {
	this.localeEnforced = localeEnforced;
    }

    public String getLocale()
    {
	return this.locale;
    }

    public void setLocale(String locale)
    {
	this.locale = locale;
    }

    public Boolean getNavigationCollapsible()
    {
	return this.navigationCollapsible;
    }

    public void setNavigationCollapsible(Boolean navigationCollapsible)
    {
	this.navigationCollapsible = navigationCollapsible;
    }

    public Boolean getLockedOut()
    {
	return this.lockedOut;
    }

    public void setLockedOut(Boolean lockedOut)
    {
	this.lockedOut = lockedOut;
    }

    public String getNavigationBackgroundColour()
    {
	return this.navigationBackgroundColour;
    }

    public void setNavigationBackgroundColour(String navigationBackgroundColour)
    {
	this.navigationBackgroundColour = navigationBackgroundColour;
    }
    public String getNavigationForegroundColour()
    {
	return this.navigationForegroundColour;
    }

    public void setNavigationForegroundColour(String navigationForegroundColour)
    {
	this.navigationForegroundColour = navigationForegroundColour;
    }
    public String getNavigationStyle()
    {
	return this.navigationStyle;
    }

    public void setNavigationStyle(String navigationStyle)
    {
	this.navigationStyle = navigationStyle;
    }
    public Integer getNumberOfDaysOfUse()
    {
	return this.numberOfDaysOfUse;
    }

    public void setNumberOfDaysOfUse(Integer numberOfDaysOfUse)
    {
	this.numberOfDaysOfUse = numberOfDaysOfUse;
    }
    public String getPaceType()
    {
	return this.paceType;
    }

    public void setPaceType(String paceType)
    {
	this.paceType = paceType;
    }
    public String getServiceLevelType()
    {
	return this.serviceLevelType;
    }

    public void setServiceLevelType(String serviceLevelType)
    {
	this.serviceLevelType = serviceLevelType;
    }
    public String getSoftLimit()
    {
	return this.softLimit;
    }

    public void setSoftLimit(String softLimit)
    {
	this.softLimit = softLimit;
    }
    public String getStartDate()
    {
	return this.startDate;
    }

    public void setStartDate(String startDate)
    {
	this.startDate = startDate;
    }
    public String getUploadLimit()
    {
	return this.uploadLimit;
    }

    public void setUploadLimit(String uploadLimit)
    {
	this.uploadLimit = uploadLimit;
    }
}
