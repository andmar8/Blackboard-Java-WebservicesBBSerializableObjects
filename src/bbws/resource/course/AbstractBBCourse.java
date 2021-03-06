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

public abstract class AbstractBBCourse
{
    protected String courseId;
    protected String creationDate;
    protected Boolean available;

    public String getCourseId()
    {
	return this.courseId;
    }

    public void setCourseId(String courseId)
    {
	this.courseId = courseId;
    }

    public String getCreationDate()
    {
	return this.creationDate;
    }

    public void setCreationDate(String creationDate)
    {
	this.creationDate = creationDate;
    }

    public Boolean getAvailable()
    {
	return this.available;
    }

    public void setAvailable(Boolean available)
    {
	this.available = available;
    }
}
