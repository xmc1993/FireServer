package cn.edu.nju.software.action;

import cn.edu.nju.software.entity.ResponseData;
import cn.edu.nju.software.entity.Story;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by xmc1993 on 2017/5/12.
 */

@Api(value = "/story", description = "和故事有关的接口")
@Controller
@RequestMapping("/api")
public class StoryController {


    @ApiOperation(value = "获取所有故事列表", notes = "获取所有故事列表")
    @RequestMapping(value = "/user/getAllStory", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Story>> getAllStory(
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData<List<Story>> responseData = new ResponseData();
        return responseData;
    }

    @ApiOperation(value = "根据一级标签获得故事列表", notes = "根据一级标签获得故事列表")
    @RequestMapping(value = "/user/getStoryIdListByOneLevelTagId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Story>> getStoryIdListByOneLevelTagId(
            @ApiParam("一级标签ID") @RequestParam("tagId") String tagId,
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData<List<Story>> responseData = new ResponseData();
        return responseData;
    }

    @ApiOperation(value = "根据二级标签获得故事列表", notes = "根据二级标签获得故事列表")
    @RequestMapping(value = "/user/getStoryIdListByTwoLevelTagId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Story>> getStoryIdListByTwoLevelTagId(
            @ApiParam("二级标签ID") @RequestParam("tagId") String tagId,
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData<List<Story>> responseData = new ResponseData();
        return responseData;
    }

    @ApiOperation(value = "根据标题获得故事列表", notes = "")
    @RequestMapping(value = "/user/getStoryIdListByTitle", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Story>> getStoryIdListByTitle(
            @ApiParam("查询字段") @RequestParam("query") String query,
            HttpServletRequest request, HttpServletResponse response) {
        return null;
    }


}
