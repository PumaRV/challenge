import {Component, OnInit} from '@angular/core';
import {FoodItemService} from "../food-item.service";
import {FormBuilder, FormGroup} from "@angular/forms";
import {FoodItem} from "../foodItem";

@Component({
  selector: 'app-food-item-details',
  templateUrl: './food-item-details.component.html',
  styleUrls: ['./food-item-details.component.css']
})
export class FoodItemDetailsComponent implements OnInit {

  data: any;
  loading: boolean;

  public foodItemFormGroup: FormGroup;

  constructor(private formBuilder: FormBuilder,
              private foodItemService: FoodItemService) {
  }

  ngOnInit() {
    this.initializeDefaultForm();
  }

  public onSubmit() {
    this.loading = true;
    const foodItem = this.foodItemFormGroup.value;
    this.foodItemService.getFoodItem(foodItem.id).subscribe(response => {
      this.data = response.valueOf();
      this.loading = false;
    });
  }

  private initializeDefaultForm(foodItem?: FoodItem): void {
    this.foodItemFormGroup = this.formBuilder.group({
      id: foodItem ? foodItem.id : 0,
    });
  }

}
