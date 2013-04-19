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
public class BBForum
{
    private Boolean available;
    private String description;
    private String forumBbId;
    private Integer position;
    private String title;

    public BBForum(){}
//    public BBForum(Forum f)
//    {
//	this.available = f.getIsAvailable();
//	this.description = f.getDescription().getText();
//	this.forumBbId = f.getId().toExternalString();
//	this.position = f.getPosition();
//	this.title = f.getTitle();
//    }

    public Boolean getAvailable()
    {
	return this.available;
    }

    public void setAvailable(Boolean available)
    {
	this.available = available;
    }

    public String getDescription()
    {
	return this.description;
    }

    public void setDescription(String description)
    {
	this.description = description;
    }

    public String getForumBbId()
    {
	return this.forumBbId;
    }

    public void setForumBbId(String forumBbId)
    {
	this.forumBbId = forumBbId;
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
