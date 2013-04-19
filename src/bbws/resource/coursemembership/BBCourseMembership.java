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
package bbws.resource.coursemembership;

//bbws
import bbws.resource.course.BBCourse;
import bbws.entity.enums.verbosity.BBCourseMembershipVerbosity;
import bbws.resource.user.BBUser;

//javax
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BBCourseMembership
{
    private BBCourseMembershipVerbosity verbosity;
    private Boolean available;
    private Boolean cartridgeAccess;
    private BBCourse course;
    private String courseBbId;
    private String courseMembershipBbId;
    private String dataSourceBbId;
    private String enrollmentDate;
    private String introduction;
    private String lastAccessDate;
    private String modifiedDate;
    private String notes;
    private String personalInfo;
    private BBCourseMembershipRole role;
    private BBUser user;
    private String userBbId;

    public BBCourseMembership(){}
//    public BBCourseMembership(CourseMembership cm, BBCourseMembershipVerbosity verbosity) throws Exception
//    {
//        this.verbosity = verbosity;
//        switch(verbosity)
//        {
//            case standard:
//                this.available = cm.getIsAvailable();
//                this.cartridgeAccess = cm.getHasCartridgeAccess();
//                this.courseBbId = cm.getCourseId().toExternalString();
//                this.dataSourceBbId = cm.getDataSourceId().toExternalString();
//                this.enrollmentDate = getDateTimeFromCalendar(cm.getEnrollmentDate());
//                this.introduction = cm.getIntroduction();
//                this.lastAccessDate = getDateTimeFromCalendar(cm.getLastAccessDate());
//                this.modifiedDate = getDateTimeFromCalendar(cm.getModifiedDate());
//                this.notes = cm.getNotes();
//                this.personalInfo = cm.getPersonalInfo();
//                this.role = role.valueOf(cm.getRole().toFieldName());
//                this.userBbId = cm.getUserId().toExternalString();
//                if(cm.getUser()!=null)
//                {
//                    this.user = new BBUser(cm.getUser(),BBUser.BBUserVerbosity.extended);
//                }
//            case minimal:
//                this.courseMembershipBbId = cm.getId().toExternalString();
//            return;
//            default: throw new Exception("Undefined verbosity of course membership");
//        }
//    }

    public Boolean getAvailable()
    {
	return this.available;
    }

    public void setAvailable(Boolean available)
    {
	this.available = available;
    }

    public Boolean getCartridgeAccess()
    {
	return this.cartridgeAccess;
    }

    public void setCartridgeAccess(Boolean cartridgeAccess)
    {
	this.cartridgeAccess = cartridgeAccess;
    }

    public BBCourse getCourse()
    {
	return this.course;
    }

    public void setCourse(BBCourse course)
    {
	this.course = course;
    }

    public String getCourseBbId()
    {
	return this.courseBbId;
    }

    public void setCourseBbId(String courseBbId)
    {
	this.courseBbId = courseBbId;
    }

    public String getCourseMembershipBbId()
    {
        return this.courseMembershipBbId;
    }

    public void setCourseMembershipBbId(String courseMembershipBbId)
    {
        this.courseMembershipBbId = courseMembershipBbId;
    }

    public String getDataSourceBbId()
    {
	return this.dataSourceBbId;
    }

    public void setDataSourceBbId(String dataSourceBbId)
    {
	this.dataSourceBbId = dataSourceBbId;
    }

    public String getEnrollmentDate()
    {
	return this.enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate)
    {
	this.enrollmentDate = enrollmentDate;
    }

    public String getIntroduction()
    {
	return this.introduction;
    }

    public void setIntroduction(String introduction)
    {
	this.introduction = introduction;
    }

    public String getLastAccessDate()
    {
	return this.lastAccessDate;
    }

    public void setLastAccessDate(String lastAccessDate)
    {
	this.lastAccessDate = lastAccessDate;
    }

    public String getModifiedDate()
    {
	return this.modifiedDate;
    }

    public void setModifiedDate(String modifiedDate)
    {
	this.modifiedDate = modifiedDate;
    }

    public String getNotes()
    {
	return this.notes;
    }

    public void setNotes(String notes)
    {
	this.notes = notes;
    }

    public String getPersonalInfo()
    {
	return this.personalInfo;
    }

    public void setPersonalInfo(String personalInfo)
    {
	this.personalInfo = personalInfo;
    }

    public BBCourseMembershipRole getRole()
    {
	return this.role;
    }

    public void setRole(BBCourseMembershipRole role)
    {
	this.role = role;
    }

    public BBUser getUser()
    {
	return this.user;
    }

    public void setUser(BBUser user)
    {
	this.user = user;
    }

    public String getUserBbId()
    {
	return this.userBbId;
    }

    public void setUserBbId(String userBbId)
    {
	this.userBbId = userBbId;
    }
}
