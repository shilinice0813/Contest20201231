package com.thoughtworks.cleanarch;

import java.util.*;
import java.util.stream.Collectors;

public class Args {

    private List<Arg> argList = new ArrayList<>();
    private String args;

    public Args(String args) throws Exception {
        this.args = args;
        this.argList = inputArgsParse(args);
//        checkInput(argList);
    }

    public List<Arg> inputArgsParse(String args) throws Exception {
        List<String> inputArgs = Arrays.stream(args.split("-"))
                .filter(p->p.length()!=0)
                .collect(Collectors.toList());
        Set<Object> argsSet = new HashSet<>();
        for(String inputArg: inputArgs ){
            Arg arg = null;
            try {
                arg = Arg.of(Arrays.asList(inputArg.split(" ")));
                argsSet.add(arg.getFlag());
                argsSet.add(arg.getValue());
            }catch (Exception e){
                Schema schema = SchemaFactory.create(inputArg.trim());
                arg = new Arg(inputArg,schema.getDefaultValue(),schema.getValueType());
                argsSet.add(inputArg);
            }
            this.argList.add(arg);
        }
        if(argsSet.size()!=inputArgs.size()){
            throw new Exception("不允许输入重复flag");
        }
        return this.argList;
    }


//    public void checkInput( List<Arg> inputOrderList) throws Exception {
//
//        if(inputOrderList.get(1).contains("-")){
//            throw new Exception("value不能以-开头");
//        }
//    }

    public List<Arg> getArgList() {
        return argList;
    }


}
