/*
 * Copyright 2013 Andrew F. Hart
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */ 

package org.apache.oodt.fuse
package lib

import net.liftweb._
import common._
import http._
import rest._
import util._
import Helpers._
import json._
import scala.xml._

object FuseApi extends RestHelper {

    serve( "api" / "v1" prefix {
        
        case "ping" :: Nil JsonGet _ => JString("pong")
    
    })
    
}
