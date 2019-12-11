





 ArrayList<ArrayList<Integer> >list = new ArrayList< >();
       if (pRoot == null ){
           return list;
       }
       ArrayList<TreeNode> a = new ArrayList<>();
       ArrayList<TreeNode> a1 = new ArrayList<>();

       a.add(pRoot);
       int size = 0;
       while (!a.isEmpty()||!a1.isEmpty()){
           if (!a.isEmpty()){
               size = a.size();
               ArrayList<Integer> b = new ArrayList<>();
               for(int i = 0;i<size;i++){
                   b.add(a.get(i).val);
                   if (a.get(i).left!=null){
                       a1.add(a.get(i).left);
                   }

                   if (a.get(i).right!=null){
                       a1.add(a.get(i).right);
                   }
               }
               list.add(b);
               a.clear();

           }else if (!a1.isEmpty()){
               size  = a1.size();
               ArrayList<Integer> b = new ArrayList<>();
               for(int i = 0;i<size;i++){
                   b.add(a1.get(i).val);
                   if (a1.get(i).left!=null){
                       a.add(a1.get(i).left);
                   }
                   if (a1.get(i).right!=null){
                       a.add(a1.get(i).right);
                   }

               }
               list.add(b);
               a1.clear();

           }




       }
       return list;

    }

}
