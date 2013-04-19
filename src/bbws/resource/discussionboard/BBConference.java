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
package bbws.resource.discussionboard;

//javax
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BBConference
{
    private Boolean available;
    private String conferenceBbId;
    //Changed in 9.1.40071.3
    //private String conferenceType;
    private String description;
    private Integer position;
    private String title;

    public BBConference(){}
//    public BBConference(Conference c)
//    {
//	this.available = c.getIsAvailable();
//	this.conferenceBbId = c.getId().toExternalString();
//	//try{this.conferenceType = ConferenceOwnerDbLoader.Default.getInstance().loadById(c.getConferenceOwnerId()).getOwnerName();}catch(Exception e){this.conferenceType = "";}
//	this.description = c.getDescription().getText();
//	this.position = c.getPosition();
//	this.title = c.getTitle();
//    }

    public Boolean getAvailable()
    {
	return this.available;
    }

    public void setAvailable(Boolean available)
    {
	this.available = available;
    }

    public String getConferenceBbId()
    {
	return this.conferenceBbId;
    }

    public void setConferenceBbId(String conferenceBbId)
    {
	this.conferenceBbId = conferenceBbId;
    }

    /*public String getConferenceType()
    {
	return this.conferenceType;
    }

    public void setConferenceType(String conferenceType)
    {
	this.conferenceType = conferenceType;
    }*/

    public String getDescription()
    {
	return this.description;
    }

    public void setDescription(String description)
    {
	this.description = description;
    }

    public Integer getPosition()
    {
	return this.position;
    }

    public void setPosition(Integer position)
    {
	this.position = position;
    }

    public String getTitle()
    {
	return this.title;
    }

    public void setTitle(String title)
    {
	this.title = title;
    }
}
