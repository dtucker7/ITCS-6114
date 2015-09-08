arrInt=(100 153 305 610 1221 2441 4883 9766 19531 39063 78125 156250 312500 625000 1250000 2500000 5000000 10000000)
arrClass=(ArgMin ArgMax ArgSort)

for class in ${arrClass[*]}
do
    for i in ${arrInt[*]}
    do
        for r in `seq 0 29`
        do
            echo -n "$class $i " >> log
            java $class instance $i 2>> log
        done
    done
done